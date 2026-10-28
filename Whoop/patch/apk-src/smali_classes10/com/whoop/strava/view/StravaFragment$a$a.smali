.class final Lcom/whoop/strava/view/StravaFragment$a$a;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lec3/m;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/whoop/strava/view/StravaFragment$a;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "<T:",
        "Ljava/lang/Object;",
        ">",
        "Ljava/lang/Object;",
        "Lec3/m;"
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    k = 0x3
    mv = {
        0x2,
        0x3,
        0x0
    }
    xi = 0x30
.end annotation


# instance fields
.field final synthetic w:Leb/u0;


# direct methods
.method public constructor <init>(Leb/u0;)V
    .locals 0

    iput-object p1, p0, Lcom/whoop/strava/view/StravaFragment$a$a;->w:Leb/u0;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public static synthetic b(Leb/y0;)Ll83/a0;
    .locals 0

    invoke-static {p0}, Lcom/whoop/strava/view/StravaFragment$a$a;->g(Leb/y0;)Ll83/a0;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic c(Leb/y0;)Ll83/a0;
    .locals 0

    invoke-static {p0}, Lcom/whoop/strava/view/StravaFragment$a$a;->f(Leb/y0;)Ll83/a0;

    move-result-object p0

    return-object p0
.end method

.method private static final f(Leb/y0;)Ll83/a0;
    .locals 1

    const-string v0, "$this$navigate"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const/4 v0, 0x1

    iput-boolean v0, p0, Leb/y0;->b:Z

    sget-object p0, Ll83/a0;->a:Ll83/a0;

    return-object p0
.end method

.method private static final g(Leb/y0;)Ll83/a0;
    .locals 1

    const-string v0, "$this$navigate"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const/4 v0, 0x1

    iput-boolean v0, p0, Leb/y0;->b:Z

    sget-object p0, Ll83/a0;->a:Ll83/a0;

    return-object p0
.end method


# virtual methods
.method public final e(Lii2/b;Lq83/d;)Ljava/lang/Object;
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lii2/b;",
            "Lq83/d<",
            "-",
            "Ll83/a0;",
            ">;)",
            "Ljava/lang/Object;"
        }
    .end annotation

    sget-object p2, Lii2/b$c;->a:Lii2/b$c;

    invoke-static {p1, p2}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result p2

    const-string v0, "SETTINGS"

    if-eqz p2, :cond_0

    iget-object p1, p0, Lcom/whoop/strava/view/StravaFragment$a$a;->w:Leb/u0;

    const/4 p2, 0x0

    const/4 v1, 0x6

    invoke-static {p1, v0, p2, v1}, Leb/a0;->y(Leb/a0;Ljava/lang/String;Leb/x0;I)V

    goto :goto_0

    :cond_0
    sget-object p2, Lii2/b$d;->a:Lii2/b$d;

    invoke-static {p1, p2}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result p2

    if-eqz p2, :cond_1

    iget-object p1, p0, Lcom/whoop/strava/view/StravaFragment$a$a;->w:Leb/u0;

    new-instance p2, Lcom/whoop/strava/view/a;

    const/4 v1, 0x0

    invoke-direct {p2, v1}, Lcom/whoop/strava/view/a;-><init>(I)V

    invoke-virtual {p1, v0, p2}, Leb/a0;->w(Ljava/lang/String;Lkotlin/jvm/functions/Function1;)V

    goto :goto_0

    :cond_1
    sget-object p2, Lii2/b$b;->a:Lii2/b$b;

    invoke-static {p1, p2}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result p2

    if-eqz p2, :cond_2

    iget-object p1, p0, Lcom/whoop/strava/view/StravaFragment$a$a;->w:Leb/u0;

    new-instance p2, Lcom/whoop/strava/view/a;

    const/4 v0, 0x1

    invoke-direct {p2, v0}, Lcom/whoop/strava/view/a;-><init>(I)V

    const-string v0, "SELECTED_ACTIVITIES"

    invoke-virtual {p1, v0, p2}, Leb/a0;->w(Ljava/lang/String;Lkotlin/jvm/functions/Function1;)V

    goto :goto_0

    :cond_2
    sget-object p2, Lii2/b$a;->a:Lii2/b$a;

    invoke-static {p1, p2}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result p1

    if-eqz p1, :cond_3

    iget-object p1, p0, Lcom/whoop/strava/view/StravaFragment$a$a;->w:Leb/u0;

    invoke-virtual {p1}, Leb/a0;->z()Z

    :goto_0
    sget-object p1, Ll83/a0;->a:Ll83/a0;

    return-object p1

    :cond_3
    new-instance p1, Lkotlin/NoWhenBranchMatchedException;

    invoke-direct {p1}, Lkotlin/NoWhenBranchMatchedException;-><init>()V

    throw p1
.end method

.method public bridge synthetic emit(Ljava/lang/Object;Lq83/d;)Ljava/lang/Object;
    .locals 0

    check-cast p1, Lii2/b;

    invoke-virtual {p0, p1, p2}, Lcom/whoop/strava/view/StravaFragment$a$a;->e(Lii2/b;Lq83/d;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method
