.class public final Lfb2/a$c;
.super Lfb2/a;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lfb2/a;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "c"
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0010\u000e\n\u0002\u0008\u0002\n\u0002\u0010\u0008\n\u0002\u0008\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\u0008\u0006\u0008\u0087\u0008\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u00a2\u0006\u0004\u0008\u0004\u0010\u0005J\u0010\u0010\u0007\u001a\u00020\u0006H\u00d6\u0001\u00a2\u0006\u0004\u0008\u0007\u0010\u0008J\u0010\u0010\n\u001a\u00020\tH\u00d6\u0001\u00a2\u0006\u0004\u0008\n\u0010\u000bJ\u001a\u0010\u000f\u001a\u00020\u000e2\u0008\u0010\r\u001a\u0004\u0018\u00010\u000cH\u00d6\u0003\u00a2\u0006\u0004\u0008\u000f\u0010\u0010R\u0017\u0010\u0003\u001a\u00020\u00028\u0006\u00a2\u0006\u000c\n\u0004\u0008\u0011\u0010\u0012\u001a\u0004\u0008\u0011\u0010\u0013\u00a8\u0006\u0014"
    }
    d2 = {
        "Lfb2/a$c;",
        "Lfb2/a;",
        "Lcom/whoop/design/models/modal/AnyModal;",
        "modal",
        "<init>",
        "(Lcom/whoop/design/models/modal/AnyModal;)V",
        "",
        "toString",
        "()Ljava/lang/String;",
        "",
        "hashCode",
        "()I",
        "",
        "other",
        "",
        "equals",
        "(Ljava/lang/Object;)Z",
        "a",
        "Lcom/whoop/design/models/modal/AnyModal;",
        "()Lcom/whoop/design/models/modal/AnyModal;",
        "settings_release"
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
.field public static final b:I


# instance fields
.field private final a:Lcom/whoop/design/models/modal/AnyModal;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    sget v0, Lcom/whoop/design/models/modal/AnyModal;->$stable:I

    sput v0, Lfb2/a$c;->b:I

    return-void
.end method

.method public constructor <init>(Lcom/whoop/design/models/modal/AnyModal;)V
    .locals 1

    const-string v0, "modal"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const/4 v0, 0x0

    invoke-direct {p0, v0}, Lfb2/a;-><init>(Lkotlin/jvm/internal/DefaultConstructorMarker;)V

    iput-object p1, p0, Lfb2/a$c;->a:Lcom/whoop/design/models/modal/AnyModal;

    return-void
.end method


# virtual methods
.method public final a()Lcom/whoop/design/models/modal/AnyModal;
    .locals 1

    iget-object v0, p0, Lfb2/a$c;->a:Lcom/whoop/design/models/modal/AnyModal;

    return-object v0
.end method

.method public equals(Ljava/lang/Object;)Z
    .locals 3

    const/4 v0, 0x1

    if-ne p0, p1, :cond_0

    return v0

    :cond_0
    instance-of v1, p1, Lfb2/a$c;

    const/4 v2, 0x0

    if-nez v1, :cond_1

    return v2

    :cond_1
    check-cast p1, Lfb2/a$c;

    iget-object v1, p0, Lfb2/a$c;->a:Lcom/whoop/design/models/modal/AnyModal;

    iget-object p1, p1, Lfb2/a$c;->a:Lcom/whoop/design/models/modal/AnyModal;

    invoke-static {v1, p1}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result p1

    if-nez p1, :cond_2

    return v2

    :cond_2
    return v0
.end method

.method public hashCode()I
    .locals 1

    iget-object v0, p0, Lfb2/a$c;->a:Lcom/whoop/design/models/modal/AnyModal;

    invoke-virtual {v0}, Lcom/whoop/design/models/modal/AnyModal;->hashCode()I

    move-result v0

    return v0
.end method

.method public toString()Ljava/lang/String;
    .locals 3

    iget-object v0, p0, Lfb2/a$c;->a:Lcom/whoop/design/models/modal/AnyModal;

    const-string v1, "Present(modal="

    const-string v2, ")"

    invoke-static {v1, v2, v0}, Ljh3/c;->f(Ljava/lang/String;Ljava/lang/String;Lcom/whoop/design/models/modal/AnyModal;)Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method
