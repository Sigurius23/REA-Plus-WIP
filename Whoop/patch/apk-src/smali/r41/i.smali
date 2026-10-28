.class public abstract Lr41/i;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lm91/n;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lr41/i$a;,
        Lr41/i$b;,
        Lr41/i$c;,
        Lr41/i$d;,
        Lr41/i$e;
    }
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;",
        "Lm91/n<",
        "Ljava/util/UUID;",
        ">;"
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0005\n\u0002\u0018\u0002\n\u0002\u0008\u0008\n\u0002\u0010\u000b\n\u0002\u0008\n\n\u0002\u0010\u0000\n\u0002\u0008\u0007\n\u0002\u0018\u0002\n\u0002\u0008\t\n\u0002\u0010\u0008\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0008\t\n\u0002\u0018\u0002\n\u0002\u0008\u0006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u00087\u0018\u00002\u0008\u0012\u0004\u0012\u00020\u00020\u0001:\u0005\u0015\u0011\u0006\u000c\u0008B\t\u0008\u0004\u00a2\u0006\u0004\u0008\u0003\u0010\u0004R\u001a\u0010\n\u001a\u00020\u00058\u0016X\u0096\u0004\u00a2\u0006\u000c\n\u0004\u0008\u0006\u0010\u0007\u001a\u0004\u0008\u0008\u0010\tR\u001a\u0010\u0010\u001a\u00020\u000b8\u0016X\u0096\u0004\u00a2\u0006\u000c\n\u0004\u0008\u000c\u0010\r\u001a\u0004\u0008\u000e\u0010\u000fR\u001c\u0010\u0013\u001a\u0004\u0018\u00010\u000b8\u0016X\u0096\u0004\u00a2\u0006\u000c\n\u0004\u0008\u0011\u0010\r\u001a\u0004\u0008\u0012\u0010\u000fR\u001a\u0010\u0019\u001a\u00020\u00148\u0016X\u0096D\u00a2\u0006\u000c\n\u0004\u0008\u0015\u0010\u0016\u001a\u0004\u0008\u0017\u0010\u0018R\u001a\u0010\u001b\u001a\u00020\u00148\u0016X\u0096D\u00a2\u0006\u000c\n\u0004\u0008\u0008\u0010\u0016\u001a\u0004\u0008\u001a\u0010\u0018R\u001a\u0010\u001d\u001a\u00020\u00148\u0016X\u0096D\u00a2\u0006\u000c\n\u0004\u0008\u0012\u0010\u0016\u001a\u0004\u0008\u001c\u0010\u0018R\u001a\u0010\u001e\u001a\u00020\u00148\u0016X\u0096D\u00a2\u0006\u000c\n\u0004\u0008\u000e\u0010\u0016\u001a\u0004\u0008\u0006\u0010\u0018R\u001a\u0010$\u001a\u00020\u001f8\u0016X\u0096\u0004\u00a2\u0006\u000c\n\u0004\u0008 \u0010!\u001a\u0004\u0008\"\u0010#R\u001a\u0010&\u001a\u00020\u00148\u0016X\u0096D\u00a2\u0006\u000c\n\u0004\u0008\u0017\u0010\u0016\u001a\u0004\u0008%\u0010\u0018R\u001a\u0010*\u001a\u00020\'8\u0016X\u0096\u0004\u00a2\u0006\u000c\n\u0004\u0008\u001c\u0010(\u001a\u0004\u0008\u000c\u0010)R\u001a\u0010,\u001a\u00020\u000b8\u0016X\u0096\u0004\u00a2\u0006\u000c\n\u0004\u0008\u001a\u0010\r\u001a\u0004\u0008+\u0010\u000fR\u001a\u0010.\u001a\u00020\u000b8\u0016X\u0096\u0004\u00a2\u0006\u000c\n\u0004\u0008\"\u0010\r\u001a\u0004\u0008-\u0010\u000fR\u001a\u00100\u001a\u00020\u00148\u0016X\u0096D\u00a2\u0006\u000c\n\u0004\u0008-\u0010\u0016\u001a\u0004\u0008/\u0010\u0018R\u0014\u00104\u001a\u0002018&X\u00a6\u0004\u00a2\u0006\u0006\u001a\u0004\u00082\u00103R\u0014\u00108\u001a\u0002058&X\u00a6\u0004\u00a2\u0006\u0006\u001a\u0004\u00086\u00107R\u0014\u0010:\u001a\u0002058&X\u00a6\u0004\u00a2\u0006\u0006\u001a\u0004\u00089\u00107R\u0014\u0010<\u001a\u0002058&X\u00a6\u0004\u00a2\u0006\u0006\u001a\u0004\u0008;\u00107R\u0014\u0010>\u001a\u0002058&X\u00a6\u0004\u00a2\u0006\u0006\u001a\u0004\u0008=\u00107R\u0014\u0010A\u001a\u00020?8&X\u00a6\u0004\u00a2\u0006\u0006\u001a\u0004\u0008@\u00103R\u0014\u0010C\u001a\u00020\u00148&X\u00a6\u0004\u00a2\u0006\u0006\u001a\u0004\u0008B\u0010\u0018R\u0014\u0010D\u001a\u0002018&X\u00a6\u0004\u00a2\u0006\u0006\u001a\u0004\u0008\u0011\u00103R\u0014\u0010E\u001a\u0002018&X\u00a6\u0004\u00a2\u0006\u0006\u001a\u0004\u0008 \u00103\u0082\u0001\u0005FGHIJ\u00a8\u0006K"
    }
    d2 = {
        "Lr41/i;",
        "Lm91/n;",
        "Ljava/util/UUID;",
        "<init>",
        "()V",
        "Lny0/q;",
        "a",
        "Lny0/q;",
        "e",
        "()Lny0/q;",
        "iconButtonType",
        "Ly81/f;",
        "b",
        "Ly81/f;",
        "g",
        "()Ly81/f;",
        "iconColor",
        "c",
        "f",
        "iconCircleColor",
        "",
        "d",
        "Z",
        "i",
        "()Z",
        "iconEnabled",
        "k",
        "iconNonFunctional",
        "j",
        "iconFill",
        "animateIconOnChange",
        "",
        "h",
        "Ljava/lang/Object;",
        "l",
        "()Ljava/lang/Object;",
        "onIconClickEvent",
        "s",
        "showProgressIndicatorInsteadOfIcon",
        "Ly81/e;",
        "Ly81/e;",
        "()Ly81/e;",
        "backgroundColor",
        "p",
        "setNumberColor",
        "m",
        "repsAndWeightTextColor",
        "r",
        "showCurrentSetIndicator",
        "",
        "o",
        "()I",
        "setIndex",
        "Lcom/whoop/design/util/TextResource;",
        "q",
        "()Lcom/whoop/design/util/TextResource;",
        "setNumberText",
        "n",
        "repsText",
        "t",
        "timeText",
        "w",
        "weightText",
        "Lq3/k;",
        "v",
        "weightFieldImeAction",
        "u",
        "useTimeEntry",
        "icon",
        "iconContentDescriptionResId",
        "Lr41/i$a;",
        "Lr41/i$b;",
        "Lr41/i$c;",
        "Lr41/i$d;",
        "Lr41/i$e;",
        "design_release"
    }
    k = 0x1
    mv = {
        0x2,
        0x3,
        0x0
    }
    xi = 0x30
.end annotation


# instance fields
.field private final a:Lny0/q;

.field private final b:Ly81/f;

.field private final c:Ly81/f;

.field private final d:Z

.field private final e:Z

.field private final f:Z

.field private final g:Z

.field private final h:Ljava/lang/Object;

.field private final i:Z

.field private final j:Ly81/e;

.field private final k:Ly81/f;

.field private final l:Ly81/f;

.field private final m:Z


# direct methods
.method private constructor <init>()V
    .locals 3

    .line 2
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 3
    sget-object v0, Lny0/q$c;->f:Lny0/q$c;

    iput-object v0, p0, Lr41/i;->a:Lny0/q;

    .line 4
    sget-object v0, Ly81/f;->BRAND_WHITE:Ly81/f;

    iput-object v0, p0, Lr41/i;->b:Ly81/f;

    const/4 v1, 0x1

    .line 5
    iput-boolean v1, p0, Lr41/i;->d:Z

    .line 6
    sget-object v1, Ll83/a0;->a:Ll83/a0;

    iput-object v1, p0, Lr41/i;->h:Ljava/lang/Object;

    .line 7
    sget v1, Li2/x;->o:I

    .line 8
    sget-wide v1, Li2/x;->m:J

    .line 9
    invoke-static {v1, v2}, Ly81/g;->b(J)Ly81/e;

    move-result-object v1

    iput-object v1, p0, Lr41/i;->j:Ly81/e;

    .line 10
    sget-object v1, Ly81/f;->WHITE_50:Ly81/f;

    iput-object v1, p0, Lr41/i;->k:Ly81/f;

    .line 11
    iput-object v0, p0, Lr41/i;->l:Ly81/f;

    return-void
.end method

.method public synthetic constructor <init>(Lkotlin/jvm/internal/DefaultConstructorMarker;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Lr41/i;-><init>()V

    return-void
.end method


# virtual methods
.method public a()Z
    .locals 1

    iget-boolean v0, p0, Lr41/i;->g:Z

    return v0
.end method

.method public b()Ly81/e;
    .locals 1

    iget-object v0, p0, Lr41/i;->j:Ly81/e;

    return-object v0
.end method

.method public abstract c()I
.end method

.method public e()Lny0/q;
    .locals 1

    iget-object v0, p0, Lr41/i;->a:Lny0/q;

    return-object v0
.end method

.method public f()Ly81/f;
    .locals 1

    iget-object v0, p0, Lr41/i;->c:Ly81/f;

    return-object v0
.end method

.method public g()Ly81/f;
    .locals 1

    iget-object v0, p0, Lr41/i;->b:Ly81/f;

    return-object v0
.end method

.method public abstract h()I
.end method

.method public i()Z
    .locals 1

    iget-boolean v0, p0, Lr41/i;->d:Z

    return v0
.end method

.method public j()Z
    .locals 1

    iget-boolean v0, p0, Lr41/i;->f:Z

    return v0
.end method

.method public k()Z
    .locals 1

    iget-boolean v0, p0, Lr41/i;->e:Z

    return v0
.end method

.method public l()Ljava/lang/Object;
    .locals 1

    iget-object v0, p0, Lr41/i;->h:Ljava/lang/Object;

    return-object v0
.end method

.method public m()Ly81/f;
    .locals 1

    iget-object v0, p0, Lr41/i;->l:Ly81/f;

    return-object v0
.end method

.method public abstract n()Lcom/whoop/design/util/TextResource;
.end method

.method public abstract o()I
.end method

.method public p()Ly81/f;
    .locals 1

    iget-object v0, p0, Lr41/i;->k:Ly81/f;

    return-object v0
.end method

.method public abstract q()Lcom/whoop/design/util/TextResource;
.end method

.method public r()Z
    .locals 1

    iget-boolean v0, p0, Lr41/i;->m:Z

    return v0
.end method

.method public s()Z
    .locals 1

    iget-boolean v0, p0, Lr41/i;->i:Z

    return v0
.end method

.method public abstract t()Lcom/whoop/design/util/TextResource;
.end method

.method public abstract u()Z
.end method

.method public abstract v()I
.end method

.method public abstract w()Lcom/whoop/design/util/TextResource;
.end method
