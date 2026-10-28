.class public final Lcom/stripe/android/stripe3ds2/transactions/ChallengeResponseParseException;
.super Ljava/lang/Exception;
.source "SourceFile"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0002\u0008\u0000\u0018\u00002\u00060\u0001j\u0002`\u0002:\u0001\u0003\u00a8\u0006\u0004"
    }
    d2 = {
        "Lcom/stripe/android/stripe3ds2/transactions/ChallengeResponseParseException;",
        "Ljava/lang/Exception;",
        "Lkotlin/Exception;",
        "o73/a",
        "3ds2sdk_release"
    }
    k = 0x1
    mv = {
        0x2,
        0x1,
        0x0
    }
    xi = 0x30
.end annotation


# static fields
.field public static final synthetic z:I


# instance fields
.field public final w:I

.field public final x:Ljava/lang/String;

.field public final y:Ljava/lang/String;


# direct methods
.method public constructor <init>(ILjava/lang/String;Ljava/lang/String;)V
    .locals 3

    const-string v0, "description"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "detail"

    invoke-static {p3, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v1, " - "

    const-string v2, " ("

    .line 5
    invoke-static {v0, v1, p2, v2, p3}, Ld;->B(Ljava/lang/StringBuilder;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    .line 6
    const-string v1, ")"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-direct {p0, v0}, Ljava/lang/Exception;-><init>(Ljava/lang/String;)V

    .line 7
    iput p1, p0, Lcom/stripe/android/stripe3ds2/transactions/ChallengeResponseParseException;->w:I

    .line 8
    iput-object p2, p0, Lcom/stripe/android/stripe3ds2/transactions/ChallengeResponseParseException;->x:Ljava/lang/String;

    .line 9
    iput-object p3, p0, Lcom/stripe/android/stripe3ds2/transactions/ChallengeResponseParseException;->y:Ljava/lang/String;

    return-void
.end method

.method public constructor <init>(Lr30/i;Ljava/lang/String;)V
    .locals 1

    const-string v0, "detail"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    .line 1
    iget v0, p1, Lr30/i;->w:I

    .line 2
    iget-object p1, p1, Lr30/i;->x:Ljava/lang/String;

    .line 3
    invoke-direct {p0, v0, p1, p2}, Lcom/stripe/android/stripe3ds2/transactions/ChallengeResponseParseException;-><init>(ILjava/lang/String;Ljava/lang/String;)V

    return-void
.end method
