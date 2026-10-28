.class public abstract Lmc3/j;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field public static final a:I

.field public static final b:Lhc3/x;

.field public static final c:Lhc3/x;

.field public static final d:Lhc3/x;

.field public static final e:Lhc3/x;

.field public static final f:I


# direct methods
.method static constructor <clinit>()V
    .locals 4

    const/16 v0, 0x64

    const/16 v1, 0xc

    const-string v2, "kotlinx.coroutines.semaphore.maxSpinCycles"

    invoke-static {v0, v1, v2}, Lhc3/b;->k(IILjava/lang/String;)I

    move-result v0

    sput v0, Lmc3/j;->a:I

    new-instance v0, Lhc3/x;

    const-string v2, "PERMIT"

    const/4 v3, 0x0

    invoke-direct {v0, v2, v3}, Lhc3/x;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lmc3/j;->b:Lhc3/x;

    new-instance v0, Lhc3/x;

    const-string v2, "TAKEN"

    invoke-direct {v0, v2, v3}, Lhc3/x;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lmc3/j;->c:Lhc3/x;

    new-instance v0, Lhc3/x;

    const-string v2, "BROKEN"

    invoke-direct {v0, v2, v3}, Lhc3/x;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lmc3/j;->d:Lhc3/x;

    new-instance v0, Lhc3/x;

    const-string v2, "CANCELLED"

    invoke-direct {v0, v2, v3}, Lhc3/x;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lmc3/j;->e:Lhc3/x;

    const-string v0, "kotlinx.coroutines.semaphore.segmentSize"

    const/16 v2, 0x10

    invoke-static {v2, v1, v0}, Lhc3/b;->k(IILjava/lang/String;)I

    move-result v0

    sput v0, Lmc3/j;->f:I

    return-void
.end method

.method public static a(I)Lmc3/i;
    .locals 2

    new-instance v0, Lmc3/i;

    const/4 v1, 0x0

    invoke-direct {v0, p0, v1}, Lmc3/h;-><init>(II)V

    return-object v0
.end method
