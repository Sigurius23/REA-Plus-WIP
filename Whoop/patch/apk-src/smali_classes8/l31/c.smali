.class public abstract Ll31/c;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u0008\n\u0002\u0018\u0002\n\u0002\u0008\u0005\"\u0017\u0010\u0004\u001a\u00020\u00008\u0006\u00a2\u0006\u000c\n\u0004\u0008\u0001\u0010\u0002\u001a\u0004\u0008\u0001\u0010\u0003\u00a8\u0006\u0005"
    }
    d2 = {
        "Lf01/q;",
        "a",
        "Lf01/q;",
        "()Lf01/q;",
        "transparentButtonCardSample",
        "design_release"
    }
    k = 0x2
    mv = {
        0x2,
        0x3,
        0x0
    }
    xi = 0x30
.end annotation


# static fields
.field private static final a:Lf01/q;


# direct methods
.method static constructor <clinit>()V
    .locals 20

    new-instance v0, Lf01/q;

    new-instance v4, Lkd1/o$a;

    sget v1, Lgy0/a;->s:I

    invoke-direct {v4, v1}, Lkd1/o$a;-><init>(I)V

    sget-object v5, Lhy0/c0;->LEADING:Lhy0/c0;

    const/16 v1, 0x30

    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v6

    sget-object v15, Lf01/p;->TRANSPARENT:Lf01/p;

    sget-object v17, Ly81/f;->WHITE_70:Ly81/f;

    const v18, 0xbfc0

    const/16 v19, 0x0

    const-string v1, "transparent_button_card"

    const-string v2, "Track your referrals here"

    const-string v3, "when they sign up with your link"

    const/4 v7, 0x0

    const/4 v8, 0x0

    const/4 v9, 0x0

    const/4 v10, 0x0

    const/4 v11, 0x0

    const/4 v12, 0x0

    const/4 v13, 0x0

    const/4 v14, 0x0

    const/16 v16, 0x0

    invoke-direct/range {v0 .. v19}, Lf01/q;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lkd1/o;Lhy0/c0;Ljava/lang/Integer;Lny0/h;Lhy0/h1;Ljava/util/List;Ljava/util/List;ZLgz0/m0;Lcom/whoop/whoopaction/domain/models/Action;Lcom/whoop/navigation/e;Lf01/p;Lf01/o;Ly81/f;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    sput-object v0, Ll31/c;->a:Lf01/q;

    return-void
.end method

.method public static final a()Lf01/q;
    .locals 1

    sget-object v0, Ll31/c;->a:Lf01/q;

    return-object v0
.end method
