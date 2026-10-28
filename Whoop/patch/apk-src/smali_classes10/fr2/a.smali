.class public abstract Lfr2/a;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0008\u0005\n\u0002\u0018\u0002\n\u0002\u0008\u0003\"\u001a\u0010\u0005\u001a\u00020\u00008\u0000X\u0080\u0004\u00a2\u0006\u000c\n\u0004\u0008\u0001\u0010\u0002\u001a\u0004\u0008\u0003\u0010\u0004\"\u0014\u0010\u0008\u001a\u00020\u00068@X\u0080\u0004\u00a2\u0006\u0006\u001a\u0004\u0008\u0001\u0010\u0007\u00a8\u0006\t"
    }
    d2 = {
        "Lb91/a;",
        "a",
        "Lb91/a;",
        "b",
        "()Lb91/a;",
        "wirIntroFooterTextStyle",
        "Lp3/i;",
        "()Lp3/i;",
        "proximaNova",
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
.field private static final a:Lb91/a;


# direct methods
.method static constructor <clinit>()V
    .locals 16

    new-instance v0, Lb91/a;

    sget-object v1, Ll3/v0;->d:Ll3/v0;

    invoke-static {}, Lfr2/a;->a()Lp3/i;

    move-result-object v7

    const/16 v2, 0x22

    invoke-static {v2}, Lv63/c;->h(I)J

    move-result-wide v4

    sget-object v6, Lp3/r;->H:Lp3/r;

    const/16 v2, 0x27

    invoke-static {v2}, Lv63/c;->h(I)J

    move-result-wide v11

    const/4 v2, 0x0

    invoke-static {v2}, Lv63/c;->h(I)J

    move-result-wide v8

    const/4 v14, 0x0

    const v15, 0xfdff59

    const-wide/16 v2, 0x0

    const/4 v10, 0x0

    const/4 v13, 0x0

    invoke-static/range {v1 .. v15}, Ll3/v0;->b(Ll3/v0;JJLp3/r;Lp3/i;JIJLl3/g0;Lw3/i;I)Ll3/v0;

    move-result-object v1

    const/4 v2, 0x0

    const/4 v3, 0x2

    invoke-direct {v0, v1, v2, v3, v2}, Lb91/a;-><init>(Ll3/v0;Lb91/b;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    sput-object v0, Lfr2/a;->a:Lb91/a;

    return-void
.end method

.method public static final a()Lp3/i;
    .locals 5

    sget v0, Lgy0/b;->b:I

    const/4 v1, 0x0

    const/16 v2, 0xe

    invoke-static {v0, v1, v2}, Lhg3/i;->b(ILp3/r;I)Lp3/x;

    move-result-object v0

    sget v1, Lgy0/b;->a:I

    sget-object v2, Lp3/r;->I:Lp3/r;

    const/16 v3, 0xc

    invoke-static {v1, v2, v3}, Lhg3/i;->b(ILp3/r;I)Lp3/x;

    move-result-object v1

    sget v2, Lgy0/b;->c:I

    sget-object v4, Lp3/r;->H:Lp3/r;

    invoke-static {v2, v4, v3}, Lhg3/i;->b(ILp3/r;I)Lp3/x;

    move-result-object v2

    filled-new-array {v0, v1, v2}, [Lp3/x;

    move-result-object v0

    invoke-static {v0}, Le93/b;->d([Lp3/x;)Lp3/l;

    move-result-object v0

    return-object v0
.end method

.method public static final b()Lb91/a;
    .locals 1

    sget-object v0, Lfr2/a;->a:Lb91/a;

    return-object v0
.end method
