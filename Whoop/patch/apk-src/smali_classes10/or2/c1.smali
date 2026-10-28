.class public abstract Lor2/c1;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u0016\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u000b\u001a\u0017\u0010\u0003\u001a\u0004\u0018\u00010\u00022\u0006\u0010\u0001\u001a\u00020\u0000\u00a2\u0006\u0004\u0008\u0003\u0010\u0004\u001a\u0011\u0010\u0006\u001a\u00020\u0005*\u00020\u0005\u00a2\u0006\u0004\u0008\u0006\u0010\u0007\u001a\u0011\u0010\u0008\u001a\u00020\u0005*\u00020\u0005\u00a2\u0006\u0004\u0008\u0008\u0010\u0007\u001a\u0011\u0010\t\u001a\u00020\u0005*\u00020\u0005\u00a2\u0006\u0004\u0008\t\u0010\u0007\"\u0017\u0010\u000e\u001a\u00020\u00028\u0006\u00a2\u0006\u000c\n\u0004\u0008\n\u0010\u000b\u001a\u0004\u0008\u000c\u0010\r\"\u0017\u0010\u000f\u001a\u00020\u00028\u0006\u00a2\u0006\u000c\n\u0004\u0008\u000c\u0010\u000b\u001a\u0004\u0008\n\u0010\r\u00a8\u0006\u0010"
    }
    d2 = {
        "",
        "predicate",
        "Leb/x0;",
        "c",
        "(Z)Leb/x0;",
        "Leb/w0;",
        "f",
        "(Leb/w0;)Leb/w0;",
        "d",
        "e",
        "a",
        "Leb/x0;",
        "b",
        "()Leb/x0;",
        "whoopFeatureNavOptions",
        "whoopBottomSheetNavOptions",
        "feature_release"
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
.field private static final a:Leb/x0;

.field private static final b:Leb/x0;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    new-instance v0, Leb/w0;

    invoke-direct {v0}, Leb/w0;-><init>()V

    invoke-static {v0}, Lor2/c1;->f(Leb/w0;)Leb/w0;

    move-result-object v0

    invoke-virtual {v0}, Leb/w0;->a()Leb/x0;

    move-result-object v0

    sput-object v0, Lor2/c1;->a:Leb/x0;

    new-instance v0, Leb/w0;

    invoke-direct {v0}, Leb/w0;-><init>()V

    invoke-static {v0}, Lor2/c1;->d(Leb/w0;)Leb/w0;

    move-result-object v0

    invoke-virtual {v0}, Leb/w0;->a()Leb/x0;

    move-result-object v0

    sput-object v0, Lor2/c1;->b:Leb/x0;

    return-void
.end method

.method public static final a()Leb/x0;
    .locals 1

    sget-object v0, Lor2/c1;->b:Leb/x0;

    return-object v0
.end method

.method public static final b()Leb/x0;
    .locals 1

    sget-object v0, Lor2/c1;->a:Leb/x0;

    return-object v0
.end method

.method public static final c(Z)Leb/x0;
    .locals 0

    if-eqz p0, :cond_0

    sget-object p0, Lor2/c1;->a:Leb/x0;

    return-object p0

    :cond_0
    const/4 p0, 0x0

    return-object p0
.end method

.method public static final d(Leb/w0;)Leb/w0;
    .locals 1

    const-string v0, "<this>"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    sget v0, Lnf1/a;->e:I

    iput v0, p0, Leb/w0;->g:I

    const v0, 0x10a0001

    iput v0, p0, Leb/w0;->h:I

    const/high16 v0, 0x10a0000

    iput v0, p0, Leb/w0;->i:I

    sget v0, Lnf1/a;->p:I

    iput v0, p0, Leb/w0;->j:I

    return-object p0
.end method

.method public static final e(Leb/w0;)Leb/w0;
    .locals 2

    const-string v0, "<this>"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const/high16 v0, 0x10a0000

    iput v0, p0, Leb/w0;->g:I

    const v1, 0x10a0001

    iput v1, p0, Leb/w0;->h:I

    iput v0, p0, Leb/w0;->i:I

    iput v1, p0, Leb/w0;->j:I

    return-object p0
.end method

.method public static final f(Leb/w0;)Leb/w0;
    .locals 1

    const-string v0, "<this>"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    sget v0, Lnf1/a;->d:I

    iput v0, p0, Leb/w0;->g:I

    sget v0, Lnf1/a;->c:I

    iput v0, p0, Leb/w0;->h:I

    sget v0, Lnf1/a;->b:I

    iput v0, p0, Leb/w0;->i:I

    sget v0, Lnf1/a;->a:I

    iput v0, p0, Leb/w0;->j:I

    return-object p0
.end method
