.class public final Lmg/i;
.super Lq83/a;
.source "SourceFile"


# static fields
.field public static final x:Lg73/d;


# instance fields
.field public final w:Lmg/h;


# direct methods
.method static constructor <clinit>()V
    .locals 2

    new-instance v0, Lg73/d;

    const/16 v1, 0x19

    invoke-direct {v0, v1}, Lg73/d;-><init>(I)V

    sput-object v0, Lmg/i;->x:Lg73/d;

    return-void
.end method

.method public constructor <init>(Lmg/h;)V
    .locals 1

    const-string v0, "provider"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    sget-object v0, Lmg/i;->x:Lg73/d;

    invoke-direct {p0, v0}, Lq83/a;-><init>(Lq83/i;)V

    iput-object p1, p0, Lmg/i;->w:Lmg/h;

    return-void
.end method


# virtual methods
.method public final equals(Ljava/lang/Object;)Z
    .locals 3

    const/4 v0, 0x1

    if-ne p0, p1, :cond_0

    return v0

    :cond_0
    instance-of v1, p1, Lmg/i;

    const/4 v2, 0x0

    if-nez v1, :cond_1

    return v2

    :cond_1
    check-cast p1, Lmg/i;

    iget-object v1, p0, Lmg/i;->w:Lmg/h;

    iget-object p1, p1, Lmg/i;->w:Lmg/h;

    invoke-static {v1, p1}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result p1

    if-nez p1, :cond_2

    return v2

    :cond_2
    return v0
.end method

.method public final hashCode()I
    .locals 1

    iget-object v0, p0, Lmg/i;->w:Lmg/h;

    invoke-virtual {v0}, Ljava/lang/Object;->hashCode()I

    move-result v0

    return v0
.end method

.method public final s()Lmg/h;
    .locals 1

    iget-object v0, p0, Lmg/i;->w:Lmg/h;

    return-object v0
.end method

.method public final toString()Ljava/lang/String;
    .locals 2

    new-instance v0, Ljava/lang/StringBuilder;

    const-string v1, "TelemetryContext("

    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    iget-object v1, p0, Lmg/i;->w:Lmg/h;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const/16 v1, 0x29

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method
