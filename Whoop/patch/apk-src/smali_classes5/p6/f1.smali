.class public final Lp6/f1;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ly6/g;


# static fields
.field public static final a:Lp6/f1;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    new-instance v0, Lp6/f1;

    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    sput-object v0, Lp6/f1;->a:Lp6/f1;

    return-void
.end method


# virtual methods
.method public final a(Landroid/content/Context;Ljava/lang/String;)Ljava/io/File;
    .locals 0

    invoke-static {p1, p2}, Lv63/h;->b(Landroid/content/Context;Ljava/lang/String;)Ljava/io/File;

    move-result-object p1

    return-object p1
.end method

.method public final b(Landroid/content/Context;Ljava/lang/String;)Ljava/lang/Object;
    .locals 5

    sget-object v0, Lr6/z;->a:Lr6/z;

    new-instance v1, Lp6/e1;

    const/4 v2, 0x0

    invoke-direct {v1, p1, p2, v2}, Lp6/e1;-><init>(Landroid/content/Context;Ljava/lang/String;I)V

    sget-object p1, Lbc3/q0;->a:Lkc3/e;

    sget-object p1, Lkc3/d;->w:Lkc3/d;

    invoke-static {}, Lbc3/f0;->d()Lbc3/e2;

    move-result-object p2

    invoke-virtual {p1, p2}, Lq83/a;->plus(Lq83/j;)Lq83/j;

    move-result-object p1

    invoke-static {p1}, Lbc3/f0;->b(Lq83/j;)Lhc3/d;

    move-result-object p1

    new-instance p2, La6/m0;

    invoke-direct {p2, v0, v1}, La6/m0;-><init>(La6/y0;Lc93/a;)V

    new-instance v0, Lio/sentry/hints/j;

    const/16 v1, 0xa

    invoke-direct {v0, v1}, Lio/sentry/hints/j;-><init>(I)V

    new-instance v1, La6/c;

    sget-object v3, Lm83/y;->w:Lm83/y;

    const/4 v4, 0x0

    invoke-direct {v1, v3, v4, v2}, La6/c;-><init>(Ljava/lang/Object;Lq83/d;I)V

    invoke-static {v1}, Lwb3/f;->J(Ljava/lang/Object;)Ljava/util/List;

    move-result-object v1

    new-instance v2, La6/i0;

    invoke-direct {v2, p2, v1, v0, p1}, La6/i0;-><init>(La6/f1;Ljava/util/List;Lio/sentry/hints/j;Lbc3/c0;)V

    return-object v2
.end method
