.class public abstract Lzu2/e;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u000c\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0002\u0008\u0004\"\u0018\u0010\u0004\u001a\u00020\u0001*\u00020\u00008BX\u0082\u0004\u00a2\u0006\u0006\u001a\u0004\u0008\u0002\u0010\u0003\u00a8\u0006\u0005"
    }
    d2 = {
        "",
        "Lzu2/f;",
        "b",
        "(Ljava/lang/String;)Lzu2/f;",
        "workoutNameValidity",
        "weightlifting_release"
    }
    k = 0x2
    mv = {
        0x2,
        0x3,
        0x0
    }
    xi = 0x30
.end annotation


# direct methods
.method public static final synthetic a(Ljava/lang/String;)Lzu2/f;
    .locals 0

    invoke-static {p0}, Lzu2/e;->b(Ljava/lang/String;)Lzu2/f;

    move-result-object p0

    return-object p0
.end method

.method private static final b(Ljava/lang/String;)Lzu2/f;
    .locals 2

    invoke-virtual {p0}, Ljava/lang/String;->length()I

    move-result v0

    const/16 v1, 0x1e

    if-le v0, v1, :cond_0

    sget-object p0, Lzu2/f;->TooLong:Lzu2/f;

    return-object p0

    :cond_0
    invoke-static {p0}, Lyb3/r;->i0(Ljava/lang/CharSequence;)Z

    move-result p0

    if-eqz p0, :cond_1

    sget-object p0, Lzu2/f;->Blank:Lzu2/f;

    return-object p0

    :cond_1
    sget-object p0, Lzu2/f;->Valid:Lzu2/f;

    return-object p0
.end method
