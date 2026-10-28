.class public final Lio/sentry/h7;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lio/sentry/h2;


# static fields
.field public static final x:Lio/sentry/h7;


# instance fields
.field public final w:Lio/sentry/util/f;


# direct methods
.method static constructor <clinit>()V
    .locals 4

    new-instance v0, Lio/sentry/h7;

    const-string v1, "-"

    const-string v2, ""

    const-string v3, "00000000-0000-0000-0000-000000000000"

    invoke-virtual {v3, v1, v2}, Ljava/lang/String;->replace(Ljava/lang/CharSequence;Ljava/lang/CharSequence;)Ljava/lang/String;

    move-result-object v1

    const/4 v2, 0x0

    const/16 v3, 0x10

    invoke-virtual {v1, v2, v3}, Ljava/lang/String;->substring(II)Ljava/lang/String;

    move-result-object v1

    invoke-direct {v0, v1}, Lio/sentry/h7;-><init>(Ljava/lang/String;)V

    sput-object v0, Lio/sentry/h7;->x:Lio/sentry/h7;

    return-void
.end method

.method public constructor <init>()V
    .locals 3

    .line 4
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 5
    new-instance v0, Lio/sentry/util/f;

    new-instance v1, Li5/c;

    const/16 v2, 0xe

    invoke-direct {v1, v2}, Li5/c;-><init>(I)V

    invoke-direct {v0, v1}, Lio/sentry/util/f;-><init>(Lio/sentry/util/e;)V

    iput-object v0, p0, Lio/sentry/h7;->w:Lio/sentry/util/f;

    return-void
.end method

.method public constructor <init>(Ljava/lang/String;)V
    .locals 3

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    const-string v0, "value is required"

    invoke-static {p1, v0}, Ljava/util/Objects;->requireNonNull(Ljava/lang/Object;Ljava/lang/String;)Ljava/lang/Object;

    .line 3
    new-instance v0, Lio/sentry/util/f;

    new-instance v1, Lio/sentry/g7;

    const/4 v2, 0x0

    invoke-direct {v1, p1, v2}, Lio/sentry/g7;-><init>(Ljava/lang/String;I)V

    invoke-direct {v0, v1}, Lio/sentry/util/f;-><init>(Lio/sentry/util/e;)V

    iput-object v0, p0, Lio/sentry/h7;->w:Lio/sentry/util/f;

    return-void
.end method


# virtual methods
.method public final equals(Ljava/lang/Object;)Z
    .locals 2

    if-ne p0, p1, :cond_0

    const/4 p1, 0x1

    return p1

    :cond_0
    if-eqz p1, :cond_2

    const-class v0, Lio/sentry/h7;

    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object v1

    if-eq v0, v1, :cond_1

    goto :goto_0

    :cond_1
    check-cast p1, Lio/sentry/h7;

    iget-object v0, p0, Lio/sentry/h7;->w:Lio/sentry/util/f;

    invoke-virtual {v0}, Lio/sentry/util/f;->a()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/String;

    iget-object p1, p1, Lio/sentry/h7;->w:Lio/sentry/util/f;

    invoke-virtual {p1}, Lio/sentry/util/f;->a()Ljava/lang/Object;

    move-result-object p1

    invoke-virtual {v0, p1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p1

    return p1

    :cond_2
    :goto_0
    const/4 p1, 0x0

    return p1
.end method

.method public final hashCode()I
    .locals 1

    iget-object v0, p0, Lio/sentry/h7;->w:Lio/sentry/util/f;

    invoke-virtual {v0}, Lio/sentry/util/f;->a()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/String;

    invoke-virtual {v0}, Ljava/lang/String;->hashCode()I

    move-result v0

    return v0
.end method

.method public final serialize(Lio/sentry/k3;Lio/sentry/v0;)V
    .locals 0

    iget-object p2, p0, Lio/sentry/h7;->w:Lio/sentry/util/f;

    invoke-virtual {p2}, Lio/sentry/util/f;->a()Ljava/lang/Object;

    move-result-object p2

    check-cast p2, Ljava/lang/String;

    check-cast p1, Lwe/o;

    invoke-virtual {p1, p2}, Lwe/o;->b0(Ljava/lang/String;)Lwe/o;

    return-void
.end method

.method public final toString()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lio/sentry/h7;->w:Lio/sentry/util/f;

    invoke-virtual {v0}, Lio/sentry/util/f;->a()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/String;

    return-object v0
.end method
