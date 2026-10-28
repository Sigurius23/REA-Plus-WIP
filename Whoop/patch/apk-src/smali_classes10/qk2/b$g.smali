.class public final Lqk2/b$g;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ly2/r0;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lqk2/b;->q(Lok2/a;Lok2/c;FLandroidx/compose/ui/Modifier;Landroidx/compose/runtime/Composer;II)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = null
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0002\u0010\u0007\u001a\u00020\u0006*\u00020\u00002\u000c\u0010\u0003\u001a\u0008\u0012\u0004\u0012\u00020\u00020\u00012\u0006\u0010\u0005\u001a\u00020\u0004H\n\u00a2\u0006\u0004\u0008\u0007\u0010\u0008"
    }
    d2 = {
        "Ly2/t0;",
        "",
        "Ly2/q0;",
        "measurables",
        "Ly3/a;",
        "constraints",
        "Ly2/s0;",
        "a",
        "(Ly2/t0;Ljava/util/List;J)Ly2/s0;"
    }
    k = 0x3
    mv = {
        0x2,
        0x3,
        0x0
    }
.end annotation


# instance fields
.field final synthetic a:Lp1/c1;

.field final synthetic b:Le4/r;

.field final synthetic c:Le4/m;

.field final synthetic d:I

.field final synthetic e:Lp1/c1;


# direct methods
.method public constructor <init>(Lp1/c1;Le4/r;Le4/m;ILp1/c1;)V
    .locals 0

    iput-object p1, p0, Lqk2/b$g;->a:Lp1/c1;

    iput-object p2, p0, Lqk2/b$g;->b:Le4/r;

    iput-object p3, p0, Lqk2/b$g;->c:Le4/m;

    iput p4, p0, Lqk2/b$g;->d:I

    iput-object p5, p0, Lqk2/b$g;->e:Lp1/c1;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final a(Ly2/t0;Ljava/util/List;J)Ly2/s0;
    .locals 8
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ly2/t0;",
            "Ljava/util/List<",
            "+",
            "Ly2/q0;",
            ">;J)",
            "Ly2/s0;"
        }
    .end annotation

    iget-object v0, p0, Lqk2/b$g;->a:Lp1/c1;

    invoke-interface {v0}, Lp1/t2;->getValue()Ljava/lang/Object;

    iget-object v1, p0, Lqk2/b$g;->b:Le4/r;

    invoke-interface {p1}, Ly2/r;->getLayoutDirection()Ly3/m;

    move-result-object v4

    iget-object v5, p0, Lqk2/b$g;->c:Le4/m;

    iget v7, p0, Lqk2/b$g;->d:I

    move-object v6, p2

    move-wide v2, p3

    invoke-virtual/range {v1 .. v7}, Le4/r;->f(JLy3/m;Le4/m;Ljava/util/List;I)J

    move-result-wide p2

    iget-object p4, p0, Lqk2/b$g;->e:Lp1/c1;

    invoke-interface {p4}, Lp1/t2;->getValue()Ljava/lang/Object;

    const/16 p4, 0x20

    shr-long v0, p2, p4

    long-to-int p4, v0

    const-wide v0, 0xffffffffL

    and-long/2addr p2, v0

    long-to-int p2, p2

    new-instance p3, Lqk2/b$g$a;

    iget-object v0, p0, Lqk2/b$g;->b:Le4/r;

    invoke-direct {p3, v0, v6}, Lqk2/b$g$a;-><init>(Le4/r;Ljava/util/List;)V

    sget-object v0, Lm83/z;->w:Lm83/z;

    invoke-interface {p1, p4, p2, v0, p3}, Ly2/t0;->W(IILjava/util/Map;Lkotlin/jvm/functions/Function1;)Ly2/s0;

    move-result-object p1

    return-object p1
.end method
