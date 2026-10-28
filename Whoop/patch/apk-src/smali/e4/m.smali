.class public final Le4/m;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lp1/z1;


# instance fields
.field public final E:Le4/l;

.field public final F:Ljava/util/ArrayList;

.field public final w:Le4/k;

.field public x:Landroid/os/Handler;

.field public final y:Lz1/v;

.field public z:Z


# direct methods
.method public constructor <init>(Le4/k;)V
    .locals 2

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Le4/m;->w:Le4/k;

    new-instance p1, Lz1/v;

    new-instance v0, Le4/l;

    const/4 v1, 0x0

    invoke-direct {v0, p0, v1}, Le4/l;-><init>(Le4/m;I)V

    invoke-direct {p1, v0}, Lz1/v;-><init>(Lkotlin/jvm/functions/Function1;)V

    iput-object p1, p0, Le4/m;->y:Lz1/v;

    const/4 p1, 0x1

    iput-boolean p1, p0, Le4/m;->z:Z

    new-instance p1, Le4/l;

    const/4 v0, 0x1

    invoke-direct {p1, p0, v0}, Le4/l;-><init>(Le4/m;I)V

    iput-object p1, p0, Le4/m;->E:Le4/l;

    new-instance p1, Ljava/util/ArrayList;

    invoke-direct {p1}, Ljava/util/ArrayList;-><init>()V

    iput-object p1, p0, Le4/m;->F:Ljava/util/ArrayList;

    return-void
.end method


# virtual methods
.method public final a()V
    .locals 1

    iget-object v0, p0, Le4/m;->y:Lz1/v;

    invoke-virtual {v0}, Lz1/v;->e()V

    return-void
.end method

.method public final c()V
    .locals 0

    return-void
.end method

.method public final d()V
    .locals 2

    iget-object v0, p0, Le4/m;->y:Lz1/v;

    iget-object v1, v0, Lz1/v;->h:Lvd1/c;

    if-eqz v1, :cond_0

    invoke-virtual {v1}, Lvd1/c;->a()V

    :cond_0
    invoke-virtual {v0}, Lz1/v;->a()V

    return-void
.end method
