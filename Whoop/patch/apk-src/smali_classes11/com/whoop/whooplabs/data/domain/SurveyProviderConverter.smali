.class public final Lcom/whoop/whooplabs/data/domain/SurveyProviderConverter;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0008\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0002\u0008\u0007\u0018\u00002\u00020\u0001B\u0007\u00a2\u0006\u0004\u0008\u0002\u0010\u0003J\u0014\u0010\u0004\u001a\u0004\u0018\u00010\u00052\u0008\u0010\u0006\u001a\u0004\u0018\u00010\u0007H\u0007J\u0012\u0010\u0008\u001a\u00020\u00072\u0008\u0010\u0006\u001a\u0004\u0018\u00010\u0005H\u0007\u00a8\u0006\t"
    }
    d2 = {
        "Lcom/whoop/whooplabs/data/domain/SurveyProviderConverter;",
        "",
        "<init>",
        "()V",
        "fromSurveyProvider",
        "",
        "value",
        "Lcom/whoop/whooplabs/data/domain/SurveyProvider;",
        "toSurveyProvider",
        "whooplabs_release"
    }
    k = 0x1
    mv = {
        0x2,
        0x3,
        0x0
    }
    xi = 0x30
.end annotation


# static fields
.field public static final $stable:I


# direct methods
.method public constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final fromSurveyProvider(Lcom/whoop/whooplabs/data/domain/SurveyProvider;)Ljava/lang/String;
    .locals 0

    if-eqz p1, :cond_0

    invoke-virtual {p1}, Ljava/lang/Enum;->name()Ljava/lang/String;

    move-result-object p1

    return-object p1

    :cond_0
    const/4 p1, 0x0

    return-object p1
.end method

.method public final toSurveyProvider(Ljava/lang/String;)Lcom/whoop/whooplabs/data/domain/SurveyProvider;
    .locals 1

    sget-object v0, Lcom/whoop/whooplabs/data/domain/SurveyProvider;->Companion:Lcom/whoop/whooplabs/data/domain/SurveyProvider$Companion;

    invoke-virtual {v0, p1}, Lcom/whoop/whooplabs/data/domain/SurveyProvider$Companion;->valueOfOrDefault(Ljava/lang/String;)Lcom/whoop/whooplabs/data/domain/SurveyProvider;

    move-result-object p1

    return-object p1
.end method
