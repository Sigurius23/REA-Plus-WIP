.class public abstract Lqx/s0;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field public static final a:Lqx/f;

.field public static final b:Lqx/p0;

.field public static final c:Lqx/p0;

.field public static final d:Lqx/p0;

.field public static final e:Lqx/p0;

.field public static final f:Lqx/p0;

.field public static final g:Lqx/p0;

.field public static final h:Lqx/p0;

.field public static final i:Lqx/p0;

.field public static final j:Lqx/p0;


# direct methods
.method static constructor <clinit>()V
    .locals 2

    new-instance v0, Lqx/f;

    const/4 v1, 0x5

    invoke-direct {v0, v1}, Lqx/f;-><init>(I)V

    sput-object v0, Lqx/s0;->a:Lqx/f;

    new-instance v0, Lqx/p0;

    const/4 v1, 0x1

    invoke-direct {v0, v1}, Lqx/p0;-><init>(I)V

    sput-object v0, Lqx/s0;->b:Lqx/p0;

    new-instance v0, Lqx/p0;

    const/4 v1, 0x2

    invoke-direct {v0, v1}, Lqx/p0;-><init>(I)V

    sput-object v0, Lqx/s0;->c:Lqx/p0;

    new-instance v0, Lqx/p0;

    const/4 v1, 0x3

    invoke-direct {v0, v1}, Lqx/p0;-><init>(I)V

    sput-object v0, Lqx/s0;->d:Lqx/p0;

    new-instance v0, Lqx/p0;

    const/4 v1, 0x4

    invoke-direct {v0, v1}, Lqx/p0;-><init>(I)V

    sput-object v0, Lqx/s0;->e:Lqx/p0;

    new-instance v0, Lqx/p0;

    const/4 v1, 0x5

    invoke-direct {v0, v1}, Lqx/p0;-><init>(I)V

    sput-object v0, Lqx/s0;->f:Lqx/p0;

    new-instance v0, Lqx/p0;

    const/4 v1, 0x6

    invoke-direct {v0, v1}, Lqx/p0;-><init>(I)V

    sput-object v0, Lqx/s0;->g:Lqx/p0;

    new-instance v0, Lqx/p0;

    const/4 v1, 0x7

    invoke-direct {v0, v1}, Lqx/p0;-><init>(I)V

    sput-object v0, Lqx/s0;->h:Lqx/p0;

    new-instance v0, Lqx/p0;

    const/16 v1, 0x8

    invoke-direct {v0, v1}, Lqx/p0;-><init>(I)V

    sput-object v0, Lqx/s0;->i:Lqx/p0;

    new-instance v0, Lqx/p0;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, Lqx/p0;-><init>(I)V

    sput-object v0, Lqx/s0;->j:Lqx/p0;

    return-void
.end method

.method public static a(Lcom/squareup/moshi/JsonReader;Ljava/lang/String;II)I
    .locals 3

    invoke-virtual {p0}, Lcom/squareup/moshi/JsonReader;->nextInt()I

    move-result v0

    if-lt v0, p2, :cond_0

    if-gt v0, p3, :cond_0

    return v0

    :cond_0
    new-instance p2, Lcom/squareup/moshi/JsonDataException;

    invoke-virtual {p0}, Lcom/squareup/moshi/JsonReader;->b()Ljava/lang/String;

    move-result-object p0

    const-string p3, " but was "

    const-string v1, " at path "

    const-string v2, "Expected "

    invoke-static {v0, v2, p1, p3, v1}, Ld;->u(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object p1

    invoke-virtual {p1, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p0

    invoke-direct {p2, p0}, Lcom/squareup/moshi/JsonDataException;-><init>(Ljava/lang/String;)V

    throw p2
.end method
