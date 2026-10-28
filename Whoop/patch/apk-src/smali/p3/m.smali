.class public final Lp3/m;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field public static final c:Lo63/g;


# instance fields
.field public final a:La3/p;

.field public final b:Lhc3/d;


# direct methods
.method static constructor <clinit>()V
    .locals 3

    new-instance v0, Lo63/g;

    const/4 v1, 0x1

    sget-object v2, Lbc3/a0;->w:Lbc3/a0;

    invoke-direct {v0, v2, v1}, Lo63/g;-><init>(Lq83/i;I)V

    sput-object v0, Lp3/m;->c:Lo63/g;

    return-void
.end method

.method public constructor <init>(La3/p;)V
    .locals 2

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lp3/m;->a:La3/p;

    sget-object p1, Lp3/m;->c:Lo63/g;

    sget-object v0, Lt3/g;->a:Lbc3/w1;

    invoke-interface {p1, v0}, Lq83/j;->plus(Lq83/j;)Lq83/j;

    move-result-object p1

    sget-object v0, Lq83/k;->w:Lq83/k;

    invoke-interface {p1, v0}, Lq83/j;->plus(Lq83/j;)Lq83/j;

    move-result-object p1

    new-instance v0, Lbc3/e2;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, Lbc3/l1;-><init>(Lbc3/k1;)V

    invoke-interface {p1, v0}, Lq83/j;->plus(Lq83/j;)Lq83/j;

    move-result-object p1

    invoke-static {p1}, Lbc3/f0;->b(Lq83/j;)Lhc3/d;

    move-result-object p1

    iput-object p1, p0, Lp3/m;->b:Lhc3/d;

    return-void
.end method
