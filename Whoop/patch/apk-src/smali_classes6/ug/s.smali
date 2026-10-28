.class public abstract Lug/s;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field public static final synthetic a:I


# direct methods
.method static constructor <clinit>()V
    .locals 3

    new-instance v0, Lyb3/p;

    sget-object v1, Lyb3/q;->x:Lyb3/q;

    const/4 v1, 0x0

    const-string v2, "(-)?(\\d+(.(\\d+))?)E(-?\\d+)"

    invoke-direct {v0, v2, v1}, Lyb3/p;-><init>(Ljava/lang/String;I)V

    return-void
.end method

.method public static final a(ILjava/lang/String;)Lug/f;
    .locals 5

    const-string v0, "str"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const/4 v0, 0x1

    invoke-static {p0, v0, p1}, Lug/m;->J(IILjava/lang/String;)V

    invoke-virtual {p1, p0}, Ljava/lang/String;->charAt(I)C

    move-result v1

    const/16 v2, 0x20

    if-ne v1, v2, :cond_0

    new-instance p1, Lug/f;

    add-int/2addr p0, v0

    invoke-static {v1}, Ljava/lang/Character;->valueOf(C)Ljava/lang/Character;

    move-result-object v0

    invoke-direct {p1, p0, v0}, Lug/f;-><init>(ILjava/lang/Object;)V

    return-object p1

    :cond_0
    new-instance v0, Laws/smithy/kotlin/runtime/time/ParseException;

    new-instance v3, Ljava/lang/StringBuilder;

    const-string v4, "expected `"

    invoke-direct {v3, v4}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v3, v2}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    const-string v2, "` found `"

    invoke-virtual {v3, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v3, v1}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    const/16 v1, 0x60

    invoke-virtual {v3, v1}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-direct {v0, p1, v1, p0}, Laws/smithy/kotlin/runtime/time/ParseException;-><init>(Ljava/lang/String;Ljava/lang/String;I)V

    throw v0
.end method
