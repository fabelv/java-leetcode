{
  description = "Java + JDTLS + Gradle DevShell";

  inputs = {
    nixpkgs.url = "github:NixOS/nixpkgs/nixos-unstable";
    flake-utils.url = "github:numtide/flake-utils";
  };

  outputs = { self, nixpkgs, flake-utils }:
    flake-utils.lib.eachDefaultSystem (system:
      let
        pkgs = import nixpkgs { inherit system; };
        name = "java-leetcode";
      in
      {
        devShells.default = import ./shell.nix {
          inherit pkgs name;
        };
      });
}
