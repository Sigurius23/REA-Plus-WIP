.class public Lga3/b;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lha3/g;


# static fields
.field public static final synthetic e:[Lj93/z;


# instance fields
.field public final a:Lva3/e;

.field public final b:Lr93/s0;

.field public final c:Lkb3/i;

.field public final d:Lma3/a;


# direct methods
.method static constructor <clinit>()V
    .locals 5

    new-instance v0, Lkotlin/jvm/internal/x;

    const-class v1, Lga3/b;

    const-string v2, "type"

    const-string v3, "getType()Lorg/jetbrains/kotlin/types/SimpleType;"

    const/4 v4, 0x0

    invoke-direct {v0, v1, v2, v3, v4}, Lkotlin/jvm/internal/x;-><init>(Ljava/lang/Class;Ljava/lang/String;Ljava/lang/String;I)V

    sget-object v1, Lkotlin/jvm/internal/h0;->a:Lkotlin/jvm/internal/i0;

    invoke-virtual {v1, v0}, Lkotlin/jvm/internal/i0;->property1(Lkotlin/jvm/internal/w;)Lj93/w;

    move-result-object v0

    const/4 v1, 0x1

    new-array v1, v1, [Lj93/z;

    aput-object v0, v1, v4

    sput-object v1, Lga3/b;->e:[Lj93/z;

    return-void
.end method

.method public constructor <init>(Lzt/q;Lx93/d;Lva3/e;)V
    .locals 2

    const-string v0, "c"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v0, p1, Lzt/q;->x:Ljava/lang/Object;

    check-cast v0, Lia3/a;

    const-string v1, "fqName"

    invoke-static {p3, v1}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p3, p0, Lga3/b;->a:Lva3/e;

    if-eqz p2, :cond_0

    iget-object p3, v0, Lia3/a;->j:Lw93/d;

    invoke-virtual {p3, p2}, Lw93/d;->c(Lma3/d;)Lw93/f;

    move-result-object p3

    goto :goto_0

    :cond_0
    sget-object p3, Lr93/s0;->q:Lr93/v0;

    :goto_0
    iput-object p3, p0, Lga3/b;->b:Lr93/s0;

    iget-object p3, v0, Lia3/a;->a:Lkb3/n;

    new-instance v0, Lce/d;

    const/4 v1, 0x2

    invoke-direct {v0, v1, p1, p0}, Lce/d;-><init>(ILjava/lang/Object;Ljava/lang/Object;)V

    check-cast p3, Lkb3/k;

    invoke-virtual {p3}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    new-instance p1, Lkb3/i;

    invoke-direct {p1, p3, v0}, Lkb3/h;-><init>(Lkb3/k;Lc93/a;)V

    iput-object p1, p0, Lga3/b;->c:Lkb3/i;

    if-eqz p2, :cond_1

    invoke-virtual {p2}, Lx93/d;->b()Ljava/util/ArrayList;

    move-result-object p1

    invoke-static {p1}, Lm83/s;->G0(Ljava/lang/Iterable;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Lma3/a;

    goto :goto_1

    :cond_1
    const/4 p1, 0x0

    :goto_1
    iput-object p1, p0, Lga3/b;->d:Lma3/a;

    return-void
.end method


# virtual methods
.method public a()Ljava/util/Map;
    .locals 1

    sget-object v0, Lm83/z;->w:Lm83/z;

    return-object v0
.end method

.method public final b()Lva3/e;
    .locals 1

    iget-object v0, p0, Lga3/b;->a:Lva3/e;

    return-object v0
.end method

.method public final getSource()Lr93/s0;
    .locals 1

    iget-object v0, p0, Lga3/b;->b:Lr93/s0;

    return-object v0
.end method

.method public final getType()Llb3/y;
    .locals 2

    sget-object v0, Lga3/b;->e:[Lj93/z;

    const/4 v1, 0x0

    aget-object v0, v0, v1

    iget-object v1, p0, Lga3/b;->c:Lkb3/i;

    invoke-static {v1, v0}, Lpf/c;->C(Lkb3/l;Lj93/z;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Llb3/c0;

    return-object v0
.end method
