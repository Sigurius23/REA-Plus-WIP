.class public final synthetic Lz41/i;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function1;


# instance fields
.field public final synthetic w:Lp1/c1;

.field public final synthetic x:Lz41/e;

.field public final synthetic y:Lp1/c1;

.field public final synthetic z:Lp1/c1;


# direct methods
.method public synthetic constructor <init>(Lp1/c1;Lz41/e;Lp1/c1;Lp1/c1;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lz41/i;->w:Lp1/c1;

    iput-object p2, p0, Lz41/i;->x:Lz41/e;

    iput-object p3, p0, Lz41/i;->y:Lp1/c1;

    iput-object p4, p0, Lz41/i;->z:Lp1/c1;

    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 6

    check-cast p1, Ljava/lang/Long;

    invoke-virtual {p1}, Ljava/lang/Long;->longValue()J

    move-result-wide v4

    iget-object v0, p0, Lz41/i;->w:Lp1/c1;

    iget-object v1, p0, Lz41/i;->x:Lz41/e;

    iget-object v2, p0, Lz41/i;->y:Lp1/c1;

    iget-object v3, p0, Lz41/i;->z:Lp1/c1;

    invoke-static/range {v0 .. v5}, Lz41/j$a;->f(Lp1/c1;Lz41/e;Lp1/c1;Lp1/c1;J)Ll83/a0;

    move-result-object p1

    return-object p1
.end method
