.class public final Lt3/f;
.super Lh6/g;
.source "SourceFile"


# instance fields
.field public final synthetic w:Lp1/k1;

.field public final synthetic x:Laj/d;


# direct methods
.method public constructor <init>(Lp1/k1;Laj/d;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lt3/f;->w:Lp1/k1;

    iput-object p2, p0, Lt3/f;->x:Laj/d;

    return-void
.end method


# virtual methods
.method public final a()V
    .locals 2

    iget-object v0, p0, Lt3/f;->x:Laj/d;

    sget-object v1, Lt3/i;->a:Lt3/j;

    iput-object v1, v0, Laj/d;->w:Ljava/lang/Object;

    return-void
.end method

.method public final b()V
    .locals 2

    iget-object v0, p0, Lt3/f;->w:Lp1/k1;

    sget-object v1, Ljava/lang/Boolean;->TRUE:Ljava/lang/Boolean;

    invoke-virtual {v0, v1}, Lp1/k1;->setValue(Ljava/lang/Object;)V

    new-instance v0, Lt3/j;

    const/4 v1, 0x1

    invoke-direct {v0, v1}, Lt3/j;-><init>(Z)V

    iget-object v1, p0, Lt3/f;->x:Laj/d;

    iput-object v0, v1, Laj/d;->w:Ljava/lang/Object;

    return-void
.end method
