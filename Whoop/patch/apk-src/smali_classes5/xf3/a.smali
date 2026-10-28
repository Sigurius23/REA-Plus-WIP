.class public final Lxf3/a;
.super Lkotlin/jvm/internal/m;
.source "SourceFile"

# interfaces
.implements Lc93/a;


# instance fields
.field public final synthetic w:Lxf3/c;

.field public final synthetic x:Lvf3/a;

.field public final synthetic y:Lj93/d;

.field public final synthetic z:Lc93/a;


# direct methods
.method public constructor <init>(Lxf3/c;Lvf3/a;Lj93/d;Lc93/a;)V
    .locals 0

    iput-object p1, p0, Lxf3/a;->w:Lxf3/c;

    iput-object p2, p0, Lxf3/a;->x:Lvf3/a;

    iput-object p3, p0, Lxf3/a;->y:Lj93/d;

    iput-object p4, p0, Lxf3/a;->z:Lc93/a;

    const/4 p1, 0x0

    invoke-direct {p0, p1}, Lkotlin/jvm/internal/m;-><init>(I)V

    return-void
.end method


# virtual methods
.method public final invoke()Ljava/lang/Object;
    .locals 4

    iget-object v0, p0, Lxf3/a;->y:Lj93/d;

    iget-object v1, p0, Lxf3/a;->z:Lc93/a;

    iget-object v2, p0, Lxf3/a;->w:Lxf3/c;

    iget-object v3, p0, Lxf3/a;->x:Lvf3/a;

    invoke-virtual {v2, v1, v0, v3}, Lxf3/c;->d(Lc93/a;Lj93/d;Lvf3/a;)Ljava/lang/Object;

    move-result-object v0

    return-object v0
.end method
