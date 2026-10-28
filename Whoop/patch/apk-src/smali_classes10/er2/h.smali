.class public abstract Ler2/h;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u0008\n\u0002\u0018\u0002\n\u0002\u0008\u0005\"\u001a\u0010\u0004\u001a\u00020\u00008\u0000X\u0080\u0004\u00a2\u0006\u000c\n\u0004\u0008\u0001\u0010\u0002\u001a\u0004\u0008\u0001\u0010\u0003\u00a8\u0006\u0005"
    }
    d2 = {
        "Ll3/v0;",
        "a",
        "Ll3/v0;",
        "()Ll3/v0;",
        "wirChatBoxTextStyle",
        "user-journey_release"
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
.field private static final a:Ll3/v0;


# direct methods
.method static constructor <clinit>()V
    .locals 16

    invoke-static {}, Lfr2/a;->a()Lp3/i;

    move-result-object v7

    const/16 v0, 0x11

    invoke-static {v0}, Lv63/c;->h(I)J

    move-result-wide v3

    sget-object v5, Lp3/r;->H:Lp3/r;

    const/16 v0, 0x14

    invoke-static {v0}, Lv63/c;->h(I)J

    move-result-wide v13

    const/4 v0, 0x0

    invoke-static {v0}, Lv63/c;->h(I)J

    move-result-wide v8

    new-instance v0, Ll3/v0;

    const/4 v12, 0x0

    const v15, 0xfdff59

    const-wide/16 v1, 0x0

    const/4 v6, 0x0

    const/4 v10, 0x0

    const/4 v11, 0x0

    invoke-direct/range {v0 .. v15}, Ll3/v0;-><init>(JJLp3/r;Lp3/n;Lp3/i;JLw3/l;Li2/z0;IJI)V

    sput-object v0, Ler2/h;->a:Ll3/v0;

    return-void
.end method

.method public static final a()Ll3/v0;
    .locals 1

    sget-object v0, Ler2/h;->a:Ll3/v0;

    return-object v0
.end method
