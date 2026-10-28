.class public final synthetic Lhb1/i;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function3;


# instance fields
.field public final synthetic w:Lhb1/o;

.field public final synthetic x:Lc93/n;

.field public final synthetic y:Ly3/c;


# direct methods
.method public synthetic constructor <init>(Lhb1/o;Lc93/n;Ly3/c;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lhb1/i;->w:Lhb1/o;

    iput-object p2, p0, Lhb1/i;->x:Lc93/n;

    iput-object p3, p0, Lhb1/i;->y:Ly3/c;

    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 6

    move-object v3, p1

    check-cast v3, Ly2/t0;

    move-object v4, p2

    check-cast v4, Ly2/q0;

    move-object v5, p3

    check-cast v5, Ly3/a;

    iget-object v0, p0, Lhb1/i;->w:Lhb1/o;

    iget-object v1, p0, Lhb1/i;->x:Lc93/n;

    iget-object v2, p0, Lhb1/i;->y:Ly3/c;

    invoke-static/range {v0 .. v5}, Lhb1/m;->b(Lhb1/o;Lc93/n;Ly3/c;Ly2/t0;Ly2/q0;Ly3/a;)Ly2/s0;

    move-result-object p1

    return-object p1
.end method
