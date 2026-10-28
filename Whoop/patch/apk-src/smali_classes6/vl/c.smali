.class public final Lvl/c;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field public static final c:[C

.field public static final d:[C

.field public static final e:Lvl/c;


# instance fields
.field public final a:[C

.field public final b:[C


# direct methods
.method static constructor <clinit>()V
    .locals 5

    const/4 v0, 0x3

    new-array v0, v0, [C

    fill-array-data v0, :array_0

    sput-object v0, Lvl/c;->c:[C

    const/4 v1, 0x1

    new-array v2, v1, [C

    const/4 v3, 0x0

    const/16 v4, 0x2e

    aput-char v4, v2, v3

    sput-object v2, Lvl/c;->d:[C

    new-instance v4, Lvl/c;

    invoke-direct {v4, v0, v2}, Lvl/c;-><init>([C[C)V

    sput-object v4, Lvl/c;->e:Lvl/c;

    new-instance v0, Lvl/c;

    new-array v1, v1, [C

    const/16 v4, 0x54

    aput-char v4, v1, v3

    invoke-direct {v0, v1, v2}, Lvl/c;-><init>([C[C)V

    return-void

    nop

    :array_0
    .array-data 2
        0x54s
        0x74s
        0x20s
    .end array-data
.end method

.method public constructor <init>([C[C)V
    .locals 1

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    invoke-static {p1}, Ljava/util/Optional;->ofNullable(Ljava/lang/Object;)Ljava/util/Optional;

    move-result-object p1

    sget-object v0, Lvl/c;->c:[C

    invoke-virtual {p1, v0}, Ljava/util/Optional;->orElse(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, [C

    iput-object p1, p0, Lvl/c;->a:[C

    invoke-static {p2}, Ljava/util/Optional;->ofNullable(Ljava/lang/Object;)Ljava/util/Optional;

    move-result-object p1

    sget-object p2, Lvl/c;->d:[C

    invoke-virtual {p1, p2}, Ljava/util/Optional;->orElse(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, [C

    iput-object p1, p0, Lvl/c;->b:[C

    return-void
.end method


# virtual methods
.method public final toString()Ljava/lang/String;
    .locals 2

    new-instance v0, Ljava/lang/StringBuilder;

    const-string v1, "ParseConfig{dateTimeSeparators="

    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    iget-object v1, p0, Lvl/c;->a:[C

    invoke-static {v1}, Ljava/util/Arrays;->toString([C)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v1, ", fractionSeparators="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v1, p0, Lvl/c;->b:[C

    invoke-static {v1}, Ljava/util/Arrays;->toString([C)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const/16 v1, 0x7d

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method
