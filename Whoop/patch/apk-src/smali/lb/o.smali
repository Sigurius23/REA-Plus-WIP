.class public final Llb/o;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lq83/h;


# static fields
.field public static final x:Ljc/a;


# instance fields
.field public final w:Llb/n;


# direct methods
.method static constructor <clinit>()V
    .locals 2

    new-instance v0, Ljc/a;

    const/16 v1, 0x8

    invoke-direct {v0, v1}, Ljc/a;-><init>(I)V

    sput-object v0, Llb/o;->x:Ljc/a;

    return-void
.end method

.method public constructor <init>(Llb/n;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Llb/o;->w:Llb/n;

    return-void
.end method


# virtual methods
.method public final fold(Ljava/lang/Object;Lc93/m;)Ljava/lang/Object;
    .locals 0

    invoke-interface {p2, p1, p0}, Lc93/m;->invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public final get(Lq83/i;)Lq83/h;
    .locals 0

    invoke-static {p0, p1}, Le93/b;->D(Lq83/h;Lq83/i;)Lq83/h;

    move-result-object p1

    return-object p1
.end method

.method public final getKey()Lq83/i;
    .locals 1

    sget-object v0, Llb/o;->x:Ljc/a;

    return-object v0
.end method

.method public final minusKey(Lq83/i;)Lq83/j;
    .locals 0

    invoke-static {p0, p1}, Le93/b;->Q(Lq83/h;Lq83/i;)Lq83/j;

    move-result-object p1

    return-object p1
.end method

.method public final plus(Lq83/j;)Lq83/j;
    .locals 0

    invoke-static {p0, p1}, Le93/b;->T(Lq83/h;Lq83/j;)Lq83/j;

    move-result-object p1

    return-object p1
.end method
