.class public final Lh0/b0;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lh0/o1;


# instance fields
.field public a:Ld0/x;

.field public final b:Lh0/m2;


# direct methods
.method public constructor <init>(Ld0/x;)V
    .locals 1

    sget-object v0, Landroidx/compose/foundation/gestures/b;->c:Lh0/m2;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lh0/b0;->a:Ld0/x;

    iput-object v0, p0, Lh0/b0;->b:Lh0/m2;

    return-void
.end method


# virtual methods
.method public final a(Lh0/k2;FLq83/d;)Ljava/lang/Object;
    .locals 2

    new-instance v0, Lh0/a0;

    const/4 v1, 0x0

    invoke-direct {v0, p2, p0, p1, v1}, Lh0/a0;-><init>(FLh0/b0;Lh0/k2;Lq83/d;)V

    iget-object p1, p0, Lh0/b0;->b:Lh0/m2;

    invoke-static {p1, v0, p3}, Lbc3/f0;->K(Lq83/j;Lc93/m;Lq83/d;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method
