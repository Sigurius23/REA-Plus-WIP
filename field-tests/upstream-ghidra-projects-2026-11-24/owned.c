__attribute__((noinline)) int rea_project_value(int input) { return input * 7 + 3; }
int main(int argc, char **argv) { (void)argv; return rea_project_value(argc); }
