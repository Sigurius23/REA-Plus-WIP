.class public final Lto2/a$g;
.super Lkotlin/jvm/internal/m;
.source "SourceFile"

# interfaces
.implements Lc93/a;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lto2/a;->g(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lj02/x0;Leb/a0;Leb/a0;Landroidx/fragment/app/r0;Leb/q;Landroidx/compose/runtime/Composer;II)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lkotlin/jvm/internal/m;",
        "Lc93/a;"
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    k = 0x3
    mv = {
        0x2,
        0x3,
        0x0
    }
    xi = 0x30
.end annotation


# instance fields
.field final synthetic w:Lxf3/c;

.field final synthetic x:Lvf3/a;

.field final synthetic y:Lc93/a;

.field final synthetic z:Ljf3/a;


# direct methods
.method public constructor <init>(Lxf3/c;Lvf3/a;Lc93/a;Ljf3/a;)V
    .locals 0

    iput-object p1, p0, Lto2/a$g;->w:Lxf3/c;

    iput-object p2, p0, Lto2/a$g;->x:Lvf3/a;

    iput-object p3, p0, Lto2/a$g;->y:Lc93/a;

    iput-object p4, p0, Lto2/a$g;->z:Ljf3/a;

    const/4 p1, 0x0

    invoke-direct {p0, p1}, Lkotlin/jvm/internal/m;-><init>(I)V

    return-void
.end method


# virtual methods
.method public final invoke()Landroidx/lifecycle/w1;
    .locals 6
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Lpo2/b;"
        }
    .end annotation

    .line 2
    iget-object v0, p0, Lto2/a$g;->w:Lxf3/c;

    .line 3
    iget-object v1, p0, Lto2/a$g;->x:Lvf3/a;

    .line 4
    new-instance v2, Lto2/a$g$a;

    iget-object v3, p0, Lto2/a$g;->z:Ljf3/a;

    invoke-direct {v2, v3}, Lto2/a$g$a;-><init>(Ljf3/a;)V

    .line 5
    iget-object v5, p0, Lto2/a$g;->y:Lc93/a;

    .line 6
    const-class v3, Lpo2/b;

    .line 7
    sget-object v4, Lkotlin/jvm/internal/h0;->a:Lkotlin/jvm/internal/i0;

    invoke-virtual {v4, v3}, Lkotlin/jvm/internal/i0;->getOrCreateKotlinClass(Ljava/lang/Class;)Lj93/d;

    move-result-object v3

    const/4 v4, 0x0

    .line 8
    invoke-static/range {v0 .. v5}, Ljc/x;->X(Lxf3/c;Lvf3/a;Lc93/a;Lj93/d;Lc93/a;Lc93/a;)Landroidx/lifecycle/w1;

    move-result-object v0

    return-object v0
.end method

.method public bridge synthetic invoke()Ljava/lang/Object;
    .locals 1

    .line 1
    invoke-virtual {p0}, Lto2/a$g;->invoke()Landroidx/lifecycle/w1;

    move-result-object v0

    return-object v0
.end method
