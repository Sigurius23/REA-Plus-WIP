.class public abstract Ll31/k;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u0008\n\u0002\u0018\u0002\n\u0002\u0008\u001d\"\u0017\u0010\u0005\u001a\u00020\u00008\u0006\u00a2\u0006\u000c\n\u0004\u0008\u0001\u0010\u0002\u001a\u0004\u0008\u0003\u0010\u0004\"\u0017\u0010\u0007\u001a\u00020\u00008\u0006\u00a2\u0006\u000c\n\u0004\u0008\u0003\u0010\u0002\u001a\u0004\u0008\u0006\u0010\u0004\"\u0017\u0010\t\u001a\u00020\u00008\u0006\u00a2\u0006\u000c\n\u0004\u0008\u0006\u0010\u0002\u001a\u0004\u0008\u0008\u0010\u0004\"\u0017\u0010\n\u001a\u00020\u00008\u0006\u00a2\u0006\u000c\n\u0004\u0008\u0008\u0010\u0002\u001a\u0004\u0008\u0001\u0010\u0004\"\u0017\u0010\r\u001a\u00020\u00008\u0006\u00a2\u0006\u000c\n\u0004\u0008\u000b\u0010\u0002\u001a\u0004\u0008\u000c\u0010\u0004\"\u0017\u0010\u0010\u001a\u00020\u00008\u0006\u00a2\u0006\u000c\n\u0004\u0008\u000e\u0010\u0002\u001a\u0004\u0008\u000f\u0010\u0004\"\u0017\u0010\u0013\u001a\u00020\u00008\u0006\u00a2\u0006\u000c\n\u0004\u0008\u0011\u0010\u0002\u001a\u0004\u0008\u0012\u0010\u0004\"\u0017\u0010\u0016\u001a\u00020\u00008\u0006\u00a2\u0006\u000c\n\u0004\u0008\u0014\u0010\u0002\u001a\u0004\u0008\u0015\u0010\u0004\"\u0017\u0010\u0019\u001a\u00020\u00008\u0006\u00a2\u0006\u000c\n\u0004\u0008\u0017\u0010\u0002\u001a\u0004\u0008\u0018\u0010\u0004\"\u0017\u0010\u001c\u001a\u00020\u00008\u0006\u00a2\u0006\u000c\n\u0004\u0008\u001a\u0010\u0002\u001a\u0004\u0008\u001b\u0010\u0004\u00a8\u0006\u001d"
    }
    d2 = {
        "Lsz0/c0;",
        "a",
        "Lsz0/c0;",
        "b",
        "()Lsz0/c0;",
        "markdownTextStateCenter",
        "c",
        "markdownTextStateEnd",
        "d",
        "markdownTextStateStart",
        "markdownTextSateCombined",
        "e",
        "getMarkdownTextStateMaxLines",
        "markdownTextStateMaxLines",
        "f",
        "getMarkdownTextStateMinLines",
        "markdownTextStateMinLines",
        "g",
        "getMarkdownTextStateTrailingNewline",
        "markdownTextStateTrailingNewline",
        "h",
        "getMarkdownTextStateZeroMaxLines",
        "markdownTextStateZeroMaxLines",
        "i",
        "getMarkdownTextStateNegativeMaxLines",
        "markdownTextStateNegativeMaxLines",
        "j",
        "getMarkdownTextStateMinAboveMax",
        "markdownTextStateMinAboveMax",
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
.field private static final a:Lsz0/c0;

.field private static final b:Lsz0/c0;

.field private static final c:Lsz0/c0;

.field private static final d:Lsz0/c0;

.field private static final e:Lsz0/c0;

.field private static final f:Lsz0/c0;

.field private static final g:Lsz0/c0;

.field private static final h:Lsz0/c0;

.field private static final i:Lsz0/c0;

.field private static final j:Lsz0/c0;


# direct methods
.method static constructor <clinit>()V
    .locals 19

    new-instance v0, Lsz0/c0;

    sget-object v3, Lb91/c;->B1:Lb91/c;

    sget-object v4, Ly81/f;->WHITE_70:Ly81/f;

    const/16 v11, 0x3f0

    const/4 v12, 0x0

    const-string v1, "`Charlie sent you 4 Advance Labs tests!`"

    move-object v2, v3

    move-object v3, v4

    const/4 v4, 0x3

    const/4 v5, 0x0

    const/4 v6, 0x0

    const/4 v7, 0x0

    const/4 v8, 0x0

    const/4 v9, 0x0

    const/4 v10, 0x0

    invoke-direct/range {v0 .. v12}, Lsz0/c0;-><init>(Ljava/lang/String;Lb91/c;Ly81/f;ILgz0/m0;Ljava/lang/Integer;Ljava/lang/Integer;Li2/t;ZLsz0/y;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    move-object v4, v3

    move-object v3, v2

    sput-object v0, Ll31/k;->a:Lsz0/c0;

    new-instance v5, Lsz0/c0;

    sget-object v7, Lb91/c;->H5:Lb91/c;

    sget-object v8, Ly81/f;->BRAND_PRIMARY:Ly81/f;

    const/16 v16, 0x3f0

    const/16 v17, 0x0

    const-string v6, "~~Charlie sent you 4 Advance Labs tests!~~"

    const/4 v9, 0x6

    const/4 v11, 0x0

    const/4 v13, 0x0

    const/4 v14, 0x0

    const/4 v15, 0x0

    invoke-direct/range {v5 .. v17}, Lsz0/c0;-><init>(Ljava/lang/String;Lb91/c;Ly81/f;ILgz0/m0;Ljava/lang/Integer;Ljava/lang/Integer;Li2/t;ZLsz0/y;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    sput-object v5, Ll31/k;->b:Lsz0/c0;

    new-instance v6, Lsz0/c0;

    sget-object v8, Lb91/c;->T3:Lb91/c;

    sget-object v9, Ly81/f;->ACCENT_ACTION:Ly81/f;

    const/16 v17, 0x3f0

    const/16 v18, 0x0

    const-string v7, "*Charlie sent you 4 Advance Labs tests!*"

    const/4 v10, 0x5

    const/4 v14, 0x0

    const/4 v15, 0x0

    const/16 v16, 0x0

    invoke-direct/range {v6 .. v18}, Lsz0/c0;-><init>(Ljava/lang/String;Lb91/c;Ly81/f;ILgz0/m0;Ljava/lang/Integer;Ljava/lang/Integer;Li2/t;ZLsz0/y;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    sput-object v6, Ll31/k;->c:Lsz0/c0;

    new-instance v1, Lsz0/c0;

    const/16 v12, 0x3f0

    const-string v2, "~~Charlie~~ sent you **25** `Advanced Labs Test!` worth ~~1500~~ / 600"

    const/4 v5, 0x3

    const/4 v6, 0x0

    const/4 v7, 0x0

    const/4 v8, 0x0

    const/4 v9, 0x0

    const/4 v10, 0x0

    invoke-direct/range {v1 .. v13}, Lsz0/c0;-><init>(Ljava/lang/String;Lb91/c;Ly81/f;ILgz0/m0;Ljava/lang/Integer;Ljava/lang/Integer;Li2/t;ZLsz0/y;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    sput-object v1, Ll31/k;->d:Lsz0/c0;

    new-instance v1, Lsz0/c0;

    const/4 v0, 0x2

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v7

    const/16 v12, 0x3d0

    const-string v2, "This is a **long** markdown paragraph that keeps going well beyond two lines so that the maxLines limit truncates it with an ellipsis at the end of the second line."

    const/4 v5, 0x5

    invoke-direct/range {v1 .. v13}, Lsz0/c0;-><init>(Ljava/lang/String;Lb91/c;Ly81/f;ILgz0/m0;Ljava/lang/Integer;Ljava/lang/Integer;Li2/t;ZLsz0/y;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    move-object v0, v7

    sput-object v1, Ll31/k;->e:Lsz0/c0;

    new-instance v1, Lsz0/c0;

    const/4 v2, 0x3

    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v8

    const/16 v12, 0x3b0

    const-string v2, "Short line"

    const/4 v7, 0x0

    invoke-direct/range {v1 .. v13}, Lsz0/c0;-><init>(Ljava/lang/String;Lb91/c;Ly81/f;ILgz0/m0;Ljava/lang/Integer;Ljava/lang/Integer;Li2/t;ZLsz0/y;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    sput-object v1, Ll31/k;->f:Lsz0/c0;

    new-instance v1, Lsz0/c0;

    const/16 v12, 0x3d0

    const-string v2, "This paragraph ends with a trailing newline to verify truncation is unaffected.\n"

    const/4 v8, 0x0

    move-object v7, v0

    invoke-direct/range {v1 .. v13}, Lsz0/c0;-><init>(Ljava/lang/String;Lb91/c;Ly81/f;ILgz0/m0;Ljava/lang/Integer;Ljava/lang/Integer;Li2/t;ZLsz0/y;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    sput-object v1, Ll31/k;->g:Lsz0/c0;

    new-instance v1, Lsz0/c0;

    const/4 v2, 0x0

    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v7

    const-string v2, "maxLines is zero, which is invalid and should be clamped to a single line."

    invoke-direct/range {v1 .. v13}, Lsz0/c0;-><init>(Ljava/lang/String;Lb91/c;Ly81/f;ILgz0/m0;Ljava/lang/Integer;Ljava/lang/Integer;Li2/t;ZLsz0/y;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    sput-object v1, Ll31/k;->h:Lsz0/c0;

    new-instance v1, Lsz0/c0;

    const/4 v2, -0x3

    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v7

    const-string v2, "maxLines is negative, which is invalid and should be clamped to a single line."

    invoke-direct/range {v1 .. v13}, Lsz0/c0;-><init>(Ljava/lang/String;Lb91/c;Ly81/f;ILgz0/m0;Ljava/lang/Integer;Ljava/lang/Integer;Li2/t;ZLsz0/y;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    sput-object v1, Ll31/k;->i:Lsz0/c0;

    new-instance v1, Lsz0/c0;

    const/4 v2, 0x5

    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v8

    const/16 v12, 0x390

    const-string v2, "minLines exceeds maxLines, which is invalid and should be clamped down to maxLines."

    move-object v7, v0

    invoke-direct/range {v1 .. v13}, Lsz0/c0;-><init>(Ljava/lang/String;Lb91/c;Ly81/f;ILgz0/m0;Ljava/lang/Integer;Ljava/lang/Integer;Li2/t;ZLsz0/y;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    sput-object v1, Ll31/k;->j:Lsz0/c0;

    return-void
.end method

.method public static final a()Lsz0/c0;
    .locals 1

    sget-object v0, Ll31/k;->d:Lsz0/c0;

    return-object v0
.end method

.method public static final b()Lsz0/c0;
    .locals 1

    sget-object v0, Ll31/k;->a:Lsz0/c0;

    return-object v0
.end method

.method public static final c()Lsz0/c0;
    .locals 1

    sget-object v0, Ll31/k;->b:Lsz0/c0;

    return-object v0
.end method

.method public static final d()Lsz0/c0;
    .locals 1

    sget-object v0, Ll31/k;->c:Lsz0/c0;

    return-object v0
.end method
