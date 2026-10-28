.class public final Lkc3/e;
.super Lkc3/h;
.source "SourceFile"


# static fields
.field public static final x:Lkc3/e;


# direct methods
.method static constructor <clinit>()V
    .locals 7

    new-instance v0, Lkc3/e;

    sget v5, Lkc3/k;->c:I

    sget v6, Lkc3/k;->d:I

    sget-wide v2, Lkc3/k;->e:J

    sget-object v4, Lkc3/k;->a:Ljava/lang/String;

    invoke-direct {v0}, Lbc3/z;-><init>()V

    new-instance v1, Lkc3/c;

    invoke-direct/range {v1 .. v6}, Lkc3/c;-><init>(JLjava/lang/String;II)V

    iput-object v1, v0, Lkc3/h;->w:Lkc3/c;

    sput-object v0, Lkc3/e;->x:Lkc3/e;

    return-void
.end method


# virtual methods
.method public final close()V
    .locals 2

    new-instance v0, Ljava/lang/UnsupportedOperationException;

    const-string v1, "Dispatchers.Default cannot be closed"

    invoke-direct {v0, v1}, Ljava/lang/UnsupportedOperationException;-><init>(Ljava/lang/String;)V

    throw v0
.end method

.method public final limitedParallelism(ILjava/lang/String;)Lbc3/z;
    .locals 1

    invoke-static {p1}, Lhc3/b;->a(I)V

    sget v0, Lkc3/k;->c:I

    if-lt p1, v0, :cond_1

    if-eqz p2, :cond_0

    new-instance p1, Lhc3/r;

    invoke-direct {p1, p0, p2}, Lhc3/r;-><init>(Lbc3/z;Ljava/lang/String;)V

    return-object p1

    :cond_0
    return-object p0

    :cond_1
    invoke-super {p0, p1, p2}, Lbc3/z;->limitedParallelism(ILjava/lang/String;)Lbc3/z;

    move-result-object p1

    return-object p1
.end method

.method public final toString()Ljava/lang/String;
    .locals 1

    const-string v0, "Dispatchers.Default"

    return-object v0
.end method
