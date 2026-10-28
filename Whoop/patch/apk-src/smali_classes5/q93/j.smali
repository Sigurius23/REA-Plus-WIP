.class public final Lq93/j;
.super Lo93/h;
.source "SourceFile"


# static fields
.field public static final synthetic h:[Lj93/z;


# instance fields
.field public f:Lo93/k;

.field public final g:Lkb3/i;


# direct methods
.method static constructor <clinit>()V
    .locals 5

    new-instance v0, Lkotlin/jvm/internal/x;

    const-class v1, Lq93/j;

    const-string v2, "customizer"

    const-string v3, "getCustomizer()Lorg/jetbrains/kotlin/builtins/jvm/JvmBuiltInsCustomizer;"

    const/4 v4, 0x0

    invoke-direct {v0, v1, v2, v3, v4}, Lkotlin/jvm/internal/x;-><init>(Ljava/lang/Class;Ljava/lang/String;Ljava/lang/String;I)V

    sget-object v1, Lkotlin/jvm/internal/h0;->a:Lkotlin/jvm/internal/i0;

    invoke-virtual {v1, v0}, Lkotlin/jvm/internal/i0;->property1(Lkotlin/jvm/internal/w;)Lj93/w;

    move-result-object v0

    const/4 v1, 0x1

    new-array v1, v1, [Lj93/z;

    aput-object v0, v1, v4

    sput-object v1, Lq93/j;->h:[Lj93/z;

    return-void
.end method

.method public constructor <init>(Lkb3/k;)V
    .locals 3

    sget-object v0, Lq93/h;->w:[Lq93/h;

    invoke-direct {p0, p1}, Lo93/h;-><init>(Lkb3/k;)V

    new-instance v0, Lce3/p;

    const/4 v1, 0x6

    const/4 v2, 0x0

    invoke-direct {v0, p0, p1, v2, v1}, Lce3/p;-><init>(Ljava/lang/Object;Ljava/lang/Object;ZI)V

    new-instance v1, Lkb3/i;

    invoke-direct {v1, p1, v0}, Lkb3/h;-><init>(Lkb3/k;Lc93/a;)V

    iput-object v1, p0, Lq93/j;->g:Lkb3/i;

    return-void
.end method


# virtual methods
.method public final K()Lq93/p;
    .locals 2

    sget-object v0, Lq93/j;->h:[Lj93/z;

    const/4 v1, 0x0

    aget-object v0, v0, v1

    iget-object v1, p0, Lq93/j;->g:Lkb3/i;

    invoke-static {v1, v0}, Lpf/c;->C(Lkb3/l;Lj93/z;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lq93/p;

    return-object v0
.end method

.method public final d()Lt93/b;
    .locals 1

    invoke-virtual {p0}, Lq93/j;->K()Lq93/p;

    move-result-object v0

    return-object v0
.end method

.method public final m()Ljava/lang/Iterable;
    .locals 4

    invoke-super {p0}, Lo93/h;->m()Ljava/lang/Iterable;

    move-result-object v0

    new-instance v1, Lq93/g;

    invoke-virtual {p0}, Lo93/h;->l()Lu93/e0;

    move-result-object v2

    const-string v3, "getBuiltInsModule(...)"

    invoke-static {v2, v3}, Lkotlin/jvm/internal/k;->i(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v3, p0, Lo93/h;->d:Lkb3/k;

    invoke-direct {v1, v3, v2}, Lq93/g;-><init>(Lkb3/k;Lu93/e0;)V

    invoke-static {v0, v1}, Lm83/s;->e1(Ljava/lang/Iterable;Ljava/lang/Object;)Ljava/util/ArrayList;

    move-result-object v0

    return-object v0
.end method

.method public final q()Lt93/d;
    .locals 1

    invoke-virtual {p0}, Lq93/j;->K()Lq93/p;

    move-result-object v0

    return-object v0
.end method
