.class public Lp92/e;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field private final a:J

.field private final b:Llm2/b;

.field private final c:D

.field private final d:Lcom/whoop/domain/model/StrainRecoveryMapping;

.field private e:Z

.field private final f:Lcom/whoop/data/repositories/RestingHeartRate;


# direct methods
.method public constructor <init>(JLlm2/b;Lcom/whoop/domain/model/StrainRecoveryMapping;DZLcom/whoop/data/repositories/RestingHeartRate;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-wide p1, p0, Lp92/e;->a:J

    iput-object p3, p0, Lp92/e;->b:Llm2/b;

    iput-wide p5, p0, Lp92/e;->c:D

    iput-object p4, p0, Lp92/e;->d:Lcom/whoop/domain/model/StrainRecoveryMapping;

    iput-boolean p7, p0, Lp92/e;->e:Z

    iput-object p8, p0, Lp92/e;->f:Lcom/whoop/data/repositories/RestingHeartRate;

    return-void
.end method


# virtual methods
.method public a()Llm2/b;
    .locals 1

    iget-object v0, p0, Lp92/e;->b:Llm2/b;

    return-object v0
.end method

.method public b()Lcom/whoop/data/repositories/RestingHeartRate;
    .locals 1

    iget-object v0, p0, Lp92/e;->f:Lcom/whoop/data/repositories/RestingHeartRate;

    return-object v0
.end method

.method public c()J
    .locals 2

    iget-wide v0, p0, Lp92/e;->a:J

    return-wide v0
.end method

.method public d()D
    .locals 2

    iget-wide v0, p0, Lp92/e;->c:D

    return-wide v0
.end method

.method public e()Lcom/whoop/domain/model/StrainRecoveryMapping;
    .locals 1

    iget-object v0, p0, Lp92/e;->d:Lcom/whoop/domain/model/StrainRecoveryMapping;

    return-object v0
.end method

.method public f()Z
    .locals 1

    iget-boolean v0, p0, Lp92/e;->e:Z

    return v0
.end method

.method public g(Z)V
    .locals 0

    iput-boolean p1, p0, Lp92/e;->e:Z

    return-void
.end method
