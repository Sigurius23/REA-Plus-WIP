.class public Lte/c;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field public static final b:Lgf/a;

.field public static final c:Lgf/a;

.field public static final d:Lgf/a;


# instance fields
.field public final a:Lgf/c;


# direct methods
.method static constructor <clinit>()V
    .locals 2

    new-instance v0, Lgf/a;

    const-string v1, "aws.smithy.kotlin#ClientContext"

    invoke-direct {v0, v1}, Lgf/a;-><init>(Ljava/lang/String;)V

    sput-object v0, Lte/c;->b:Lgf/a;

    new-instance v0, Lgf/a;

    const-string v1, "aws.smithy.kotlin#Retryable"

    invoke-direct {v0, v1}, Lgf/a;-><init>(Ljava/lang/String;)V

    sput-object v0, Lte/c;->c:Lgf/a;

    new-instance v0, Lgf/a;

    const-string v1, "aws.smithy.kotlin#ThrottlingError"

    invoke-direct {v0, v1}, Lgf/a;-><init>(Ljava/lang/String;)V

    sput-object v0, Lte/c;->d:Lgf/a;

    return-void
.end method

.method public constructor <init>()V
    .locals 1

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    new-instance v0, Lgf/c;

    invoke-direct {v0}, Lgf/c;-><init>()V

    iput-object v0, p0, Lte/c;->a:Lgf/c;

    return-void
.end method


# virtual methods
.method public final a()Lgf/c;
    .locals 1

    iget-object v0, p0, Lte/c;->a:Lgf/c;

    return-object v0
.end method

.method public final b()Ljava/util/List;
    .locals 2

    iget-object v0, p0, Lte/c;->a:Lgf/c;

    sget-object v1, Lte/c;->b:Lgf/a;

    invoke-virtual {v0, v1}, Lgf/c;->b(Lgf/a;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/util/List;

    if-nez v0, :cond_0

    sget-object v0, Lm83/y;->w:Lm83/y;

    :cond_0
    return-object v0
.end method

.method public final c()Z
    .locals 2

    iget-object v0, p0, Lte/c;->a:Lgf/c;

    sget-object v1, Lte/c;->c:Lgf/a;

    invoke-virtual {v0, v1}, Lgf/c;->b(Lgf/a;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/Boolean;

    if-eqz v0, :cond_0

    invoke-virtual {v0}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v0

    return v0

    :cond_0
    const/4 v0, 0x0

    return v0
.end method

.method public final d()Z
    .locals 2

    iget-object v0, p0, Lte/c;->a:Lgf/c;

    sget-object v1, Lte/c;->d:Lgf/a;

    invoke-virtual {v0, v1}, Lgf/c;->b(Lgf/a;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/Boolean;

    if-eqz v0, :cond_0

    invoke-virtual {v0}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v0

    return v0

    :cond_0
    const/4 v0, 0x0

    return v0
.end method
