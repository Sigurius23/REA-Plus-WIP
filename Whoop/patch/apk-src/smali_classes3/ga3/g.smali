.class public final Lga3/g;
.super Lga3/b;
.source "SourceFile"


# static fields
.field public static final synthetic g:[Lj93/z;


# instance fields
.field public final f:Lkb3/i;


# direct methods
.method static constructor <clinit>()V
    .locals 5

    new-instance v0, Lkotlin/jvm/internal/x;

    const-class v1, Lga3/g;

    const-string v2, "allValueArguments"

    const-string v3, "getAllValueArguments()Ljava/util/Map;"

    const/4 v4, 0x0

    invoke-direct {v0, v1, v2, v3, v4}, Lkotlin/jvm/internal/x;-><init>(Ljava/lang/Class;Ljava/lang/String;Ljava/lang/String;I)V

    sget-object v1, Lkotlin/jvm/internal/h0;->a:Lkotlin/jvm/internal/i0;

    invoke-virtual {v1, v0}, Lkotlin/jvm/internal/i0;->property1(Lkotlin/jvm/internal/w;)Lj93/w;

    move-result-object v0

    const/4 v1, 0x1

    new-array v1, v1, [Lj93/z;

    aput-object v0, v1, v4

    sput-object v1, Lga3/g;->g:[Lj93/z;

    return-void
.end method

.method public constructor <init>(Lx93/d;Lzt/q;)V
    .locals 1

    const-string v0, "c"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    sget-object v0, Lo93/m;->m:Lva3/e;

    invoke-direct {p0, p2, p1, v0}, Lga3/b;-><init>(Lzt/q;Lx93/d;Lva3/e;)V

    iget-object p1, p2, Lzt/q;->x:Ljava/lang/Object;

    check-cast p1, Lia3/a;

    iget-object p1, p1, Lia3/a;->a:Lkb3/n;

    check-cast p1, Lkb3/k;

    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    new-instance p2, Lkb3/i;

    sget-object v0, Lga3/f;->w:Lga3/f;

    invoke-direct {p2, p1, v0}, Lkb3/h;-><init>(Lkb3/k;Lc93/a;)V

    iput-object p2, p0, Lga3/g;->f:Lkb3/i;

    return-void
.end method


# virtual methods
.method public final a()Ljava/util/Map;
    .locals 2

    sget-object v0, Lga3/g;->g:[Lj93/z;

    const/4 v1, 0x0

    aget-object v0, v0, v1

    iget-object v1, p0, Lga3/g;->f:Lkb3/i;

    invoke-static {v1, v0}, Lpf/c;->C(Lkb3/l;Lj93/z;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/util/Map;

    return-object v0
.end method
