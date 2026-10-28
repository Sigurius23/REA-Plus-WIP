.class public final synthetic Lug/j;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lc93/m;


# instance fields
.field public final synthetic w:C


# direct methods
.method public synthetic constructor <init>(C)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-char p1, p0, Lug/j;->w:C

    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 5

    check-cast p1, Ljava/lang/String;

    check-cast p2, Ljava/lang/Integer;

    invoke-virtual {p2}, Ljava/lang/Integer;->intValue()I

    move-result p2

    const-string v0, "str"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const/4 v0, 0x1

    invoke-static {p2, v0, p1}, Lug/m;->J(IILjava/lang/String;)V

    invoke-virtual {p1, p2}, Ljava/lang/String;->charAt(I)C

    move-result v1

    iget-char v2, p0, Lug/j;->w:C

    if-ne v1, v2, :cond_0

    new-instance p1, Lug/f;

    add-int/2addr p2, v0

    invoke-static {v1}, Ljava/lang/Character;->valueOf(C)Ljava/lang/Character;

    move-result-object v0

    invoke-direct {p1, p2, v0}, Lug/f;-><init>(ILjava/lang/Object;)V

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

    invoke-direct {v0, p1, v1, p2}, Laws/smithy/kotlin/runtime/time/ParseException;-><init>(Ljava/lang/String;Ljava/lang/String;I)V

    throw v0
.end method
