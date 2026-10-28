.class public final Lhj/b;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field public final a:Lhj/c;

.field public final b:[Lkotlin/jvm/functions/Function1;


# direct methods
.method public constructor <init>(Ljava/lang/String;Ljava/lang/String;[Lkotlin/jvm/functions/Function1;Ljava/util/Map;I)V
    .locals 1

    and-int/lit8 v0, p5, 0x2

    if-eqz v0, :cond_0

    const/4 p2, 0x0

    :cond_0
    and-int/lit8 v0, p5, 0x4

    if-eqz v0, :cond_1

    const/4 p3, 0x0

    new-array p3, p3, [Lkotlin/jvm/functions/Function1;

    :cond_1
    and-int/lit8 p5, p5, 0x8

    if-eqz p5, :cond_2

    sget-object p4, Lm83/z;->w:Lm83/z;

    :cond_2
    const-string p5, "userId"

    invoke-static {p1, p5}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string p5, "userProperties"

    invoke-static {p4, p5}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance p5, Lhj/c;

    invoke-direct {p5}, Ljava/lang/Object;-><init>()V

    iput-object p1, p5, Lhj/c;->a:Ljava/lang/String;

    iput-object p2, p5, Lhj/c;->b:Ljava/lang/String;

    iput-object p4, p5, Lhj/c;->c:Ljava/util/Map;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p5, p0, Lhj/b;->a:Lhj/c;

    iput-object p3, p0, Lhj/b;->b:[Lkotlin/jvm/functions/Function1;

    return-void
.end method


# virtual methods
.method public final equals(Ljava/lang/Object;)Z
    .locals 4

    const/4 v0, 0x1

    if-ne p0, p1, :cond_0

    return v0

    :cond_0
    if-eqz p1, :cond_1

    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object v1

    goto :goto_0

    :cond_1
    const/4 v1, 0x0

    :goto_0
    const-class v2, Lhj/b;

    invoke-virtual {v2, v1}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    move-result v1

    const/4 v2, 0x0

    if-nez v1, :cond_2

    return v2

    :cond_2
    const-string v1, "null cannot be cast to non-null type com.amplitude.android.engagement.AmplitudeBootOptions"

    invoke-static {p1, v1}, Lkotlin/jvm/internal/k;->h(Ljava/lang/Object;Ljava/lang/String;)V

    check-cast p1, Lhj/b;

    iget-object v1, p0, Lhj/b;->a:Lhj/c;

    iget-object v3, p1, Lhj/b;->a:Lhj/c;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_3

    return v2

    :cond_3
    iget-object v1, p0, Lhj/b;->b:[Lkotlin/jvm/functions/Function1;

    iget-object p1, p1, Lhj/b;->b:[Lkotlin/jvm/functions/Function1;

    invoke-static {v1, p1}, Ljava/util/Arrays;->equals([Ljava/lang/Object;[Ljava/lang/Object;)Z

    move-result p1

    if-nez p1, :cond_4

    return v2

    :cond_4
    return v0
.end method

.method public final hashCode()I
    .locals 2

    iget-object v0, p0, Lhj/b;->a:Lhj/c;

    invoke-virtual {v0}, Lhj/c;->hashCode()I

    move-result v0

    mul-int/lit8 v0, v0, 0x1f

    iget-object v1, p0, Lhj/b;->b:[Lkotlin/jvm/functions/Function1;

    invoke-static {v1}, Ljava/util/Arrays;->hashCode([Ljava/lang/Object;)I

    move-result v1

    add-int/2addr v0, v1

    return v0
.end method

.method public final toString()Ljava/lang/String;
    .locals 3

    new-instance v0, Ljava/lang/StringBuilder;

    const-string v1, "AmplitudeBootOptions(user="

    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    iget-object v1, p0, Lhj/b;->a:Lhj/c;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v1, ", integrations="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v1, p0, Lhj/b;->b:[Lkotlin/jvm/functions/Function1;

    invoke-static {v1}, Ljava/util/Arrays;->toString([Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v1

    const/16 v2, 0x29

    invoke-static {v0, v1, v2}, Lm4/a;->j(Ljava/lang/StringBuilder;Ljava/lang/String;C)Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method
