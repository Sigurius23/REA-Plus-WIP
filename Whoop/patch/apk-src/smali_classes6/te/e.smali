.class public Lte/e;
.super Lte/c;
.source "SourceFile"


# static fields
.field public static final e:Lgf/a;

.field public static final f:Lgf/a;

.field public static final g:Lgf/a;

.field public static final h:Lgf/a;

.field public static final i:Lgf/a;


# direct methods
.method static constructor <clinit>()V
    .locals 2

    new-instance v0, Lgf/a;

    const-string v1, "aws.smithy.kotlin#ErrorCode"

    invoke-direct {v0, v1}, Lgf/a;-><init>(Ljava/lang/String;)V

    sput-object v0, Lte/e;->e:Lgf/a;

    new-instance v0, Lgf/a;

    const-string v1, "aws.smithy.kotlin#ErrorMessage"

    invoke-direct {v0, v1}, Lgf/a;-><init>(Ljava/lang/String;)V

    sput-object v0, Lte/e;->f:Lgf/a;

    new-instance v0, Lgf/a;

    const-string v1, "aws.smithy.kotlin#ErrorType"

    invoke-direct {v0, v1}, Lgf/a;-><init>(Ljava/lang/String;)V

    sput-object v0, Lte/e;->g:Lgf/a;

    new-instance v0, Lgf/a;

    const-string v1, "aws.smithy.kotlin#ProtocolResponse"

    invoke-direct {v0, v1}, Lgf/a;-><init>(Ljava/lang/String;)V

    sput-object v0, Lte/e;->h:Lgf/a;

    new-instance v0, Lgf/a;

    const-string v1, "aws.smithy.kotlin#RequestId"

    invoke-direct {v0, v1}, Lgf/a;-><init>(Ljava/lang/String;)V

    sput-object v0, Lte/e;->i:Lgf/a;

    return-void
.end method

.method public constructor <init>()V
    .locals 0

    invoke-direct {p0}, Lte/c;-><init>()V

    return-void
.end method


# virtual methods
.method public final e()Ljava/lang/String;
    .locals 2

    iget-object v0, p0, Lte/c;->a:Lgf/c;

    sget-object v1, Lte/e;->e:Lgf/a;

    invoke-virtual {v0, v1}, Lgf/c;->b(Lgf/a;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/String;

    return-object v0
.end method

.method public final f()Ljava/lang/String;
    .locals 2

    iget-object v0, p0, Lte/c;->a:Lgf/c;

    sget-object v1, Lte/e;->f:Lgf/a;

    invoke-virtual {v0, v1}, Lgf/c;->b(Lgf/a;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/String;

    return-object v0
.end method

.method public final g()Lte/f;
    .locals 2

    iget-object v0, p0, Lte/c;->a:Lgf/c;

    sget-object v1, Lte/e;->g:Lgf/a;

    invoke-virtual {v0, v1}, Lgf/c;->b(Lgf/a;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lte/f;

    if-nez v0, :cond_0

    sget-object v0, Lte/f;->y:Lte/f;

    :cond_0
    return-object v0
.end method

.method public final h()Lte/d;
    .locals 2

    iget-object v0, p0, Lte/c;->a:Lgf/c;

    sget-object v1, Lte/e;->h:Lgf/a;

    invoke-virtual {v0, v1}, Lgf/c;->b(Lgf/a;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lte/d;

    if-nez v0, :cond_0

    sget-object v0, Lte/b;->a:Lte/b;

    :cond_0
    return-object v0
.end method

.method public final i()Ljava/lang/String;
    .locals 2

    iget-object v0, p0, Lte/c;->a:Lgf/c;

    sget-object v1, Lte/e;->i:Lgf/a;

    invoke-virtual {v0, v1}, Lgf/c;->b(Lgf/a;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/String;

    return-object v0
.end method
