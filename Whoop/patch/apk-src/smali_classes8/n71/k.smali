.class public final synthetic Ln71/k;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function1;


# instance fields
.field public final synthetic E:J

.field public final synthetic F:Lp1/z0;

.field public final synthetic w:Ln71/q;

.field public final synthetic x:Ljava/util/List;

.field public final synthetic y:J

.field public final synthetic z:J


# direct methods
.method public synthetic constructor <init>(Ln71/q;Ljava/util/List;JJJLp1/z0;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Ln71/k;->w:Ln71/q;

    iput-object p2, p0, Ln71/k;->x:Ljava/util/List;

    iput-wide p3, p0, Ln71/k;->y:J

    iput-wide p5, p0, Ln71/k;->z:J

    iput-wide p7, p0, Ln71/k;->E:J

    iput-object p9, p0, Ln71/k;->F:Lp1/z0;

    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 10

    iget-object v8, p0, Ln71/k;->F:Lp1/z0;

    move-object v9, p1

    check-cast v9, Lk2/e;

    iget-object v0, p0, Ln71/k;->w:Ln71/q;

    iget-object v1, p0, Ln71/k;->x:Ljava/util/List;

    iget-wide v2, p0, Ln71/k;->y:J

    iget-wide v4, p0, Ln71/k;->z:J

    iget-wide v6, p0, Ln71/k;->E:J

    invoke-static/range {v0 .. v9}, Ln71/o;->a(Ln71/q;Ljava/util/List;JJJLp1/z0;Lk2/e;)Ll83/a0;

    move-result-object p1

    return-object p1
.end method
