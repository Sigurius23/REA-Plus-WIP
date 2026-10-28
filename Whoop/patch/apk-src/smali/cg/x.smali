.class public final Lcg/x;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field public static final synthetic c:I


# instance fields
.field public final a:Ljava/util/List;

.field public final b:Z


# direct methods
.method static constructor <clinit>()V
    .locals 11

    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    sget-object v1, Lcg/u;->w:Lcg/u;

    new-instance v2, Landroidx/room/u;

    sget-object v4, Ltg/g;->i:Ltg/g;

    const/4 v8, 0x0

    const/4 v9, 0x6

    const/4 v3, 0x1

    const-class v5, Ltg/e;

    const-string v6, "encodableFromDecoded"

    const-string v7, "encodableFromDecoded(Ljava/lang/String;)Laws/smithy/kotlin/runtime/text/encoding/Encodable;"

    invoke-direct/range {v2 .. v9}, Landroidx/room/u;-><init>(ILjava/lang/Object;Ljava/lang/Class;Ljava/lang/String;Ljava/lang/String;II)V

    invoke-static {v0, v1, v2}, Lhg3/i;->s(Ljava/util/List;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;)Lhf/f;

    sget-object v1, Lcg/v;->w:Lcg/v;

    new-instance v3, Landroidx/room/u;

    const/4 v9, 0x0

    const/4 v10, 0x7

    move-object v5, v4

    const/4 v4, 0x1

    const-class v6, Ltg/e;

    const-string v7, "encodableFromEncoded"

    const-string v8, "encodableFromEncoded(Ljava/lang/String;)Laws/smithy/kotlin/runtime/text/encoding/Encodable;"

    invoke-direct/range {v3 .. v10}, Landroidx/room/u;-><init>(ILjava/lang/Object;Ljava/lang/Class;Ljava/lang/String;Ljava/lang/String;II)V

    invoke-static {v0, v1, v3}, Lhg3/i;->s(Ljava/util/List;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;)Lhf/f;

    invoke-static {v0}, Lm83/s;->D1(Ljava/lang/Iterable;)Ljava/util/List;

    return-void
.end method

.method public constructor <init>(Ljava/util/List;Z)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lcg/x;->a:Ljava/util/List;

    iput-boolean p2, p0, Lcg/x;->b:Z

    return-void
.end method


# virtual methods
.method public final equals(Ljava/lang/Object;)Z
    .locals 4

    const/4 v0, 0x1

    if-ne p0, p1, :cond_0

    return v0

    :cond_0
    const/4 v1, 0x0

    if-eqz p1, :cond_4

    const-class v2, Lcg/x;

    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object v3

    if-eq v2, v3, :cond_1

    goto :goto_0

    :cond_1
    check-cast p1, Lcg/x;

    iget-object v2, p0, Lcg/x;->a:Ljava/util/List;

    iget-object v3, p1, Lcg/x;->a:Ljava/util/List;

    invoke-static {v2, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v2

    if-nez v2, :cond_2

    return v1

    :cond_2
    iget-boolean v2, p0, Lcg/x;->b:Z

    iget-boolean p1, p1, Lcg/x;->b:Z

    if-eq v2, p1, :cond_3

    return v1

    :cond_3
    return v0

    :cond_4
    :goto_0
    return v1
.end method

.method public final hashCode()I
    .locals 2

    iget-object v0, p0, Lcg/x;->a:Ljava/util/List;

    invoke-virtual {v0}, Ljava/lang/Object;->hashCode()I

    move-result v0

    mul-int/lit8 v0, v0, 0x1f

    iget-boolean v1, p0, Lcg/x;->b:Z

    invoke-static {v1}, Ljava/lang/Boolean;->hashCode(Z)I

    move-result v1

    add-int/2addr v1, v0

    return v1
.end method

.method public final toString()Ljava/lang/String;
    .locals 2

    iget-object v0, p0, Lcg/x;->a:Ljava/util/List;

    iget-boolean v1, p0, Lcg/x;->b:Z

    invoke-static {v0, v1}, Lio/sentry/hints/j;->i(Ljava/util/List;Z)Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method
