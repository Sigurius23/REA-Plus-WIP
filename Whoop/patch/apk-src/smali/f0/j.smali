.class public final Lf0/j;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Landroidx/compose/ui/input/pointer/PointerInputEventHandler;


# instance fields
.field public final synthetic w:Lf0/k;


# direct methods
.method public constructor <init>(Lf0/k;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lf0/j;->w:Lf0/k;

    return-void
.end method


# virtual methods
.method public final invoke(Lu2/v;Lq83/d;)Ljava/lang/Object;
    .locals 4

    new-instance v0, Lb30/g2;

    const/4 v1, 0x0

    const/4 v2, 0x1

    iget-object v3, p0, Lf0/j;->w:Lf0/k;

    invoke-direct {v0, v3, v1, v2}, Lb30/g2;-><init>(Ljava/lang/Object;Lq83/d;I)V

    invoke-static {p1, v0, p2}, Lh0/q3;->g(Lu2/v;Lc93/m;Lq83/d;)Ljava/lang/Object;

    move-result-object p1

    sget-object p2, Lr83/a;->w:Lr83/a;

    if-ne p1, p2, :cond_0

    return-object p1

    :cond_0
    sget-object p1, Ll83/a0;->a:Ll83/a0;

    return-object p1
.end method
