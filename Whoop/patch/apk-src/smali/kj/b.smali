.class public final Lkj/b;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lkk/e;


# instance fields
.field public E:Ljava/lang/String;

.field public F:Ljava/lang/String;

.field public G:Ljava/lang/Long;

.field public H:Lhj/b;

.field public final I:Lkk/d;

.field public final w:Lcom/amplitude/android/engagement/a;

.field public x:Lgj/d;

.field public final y:Lcom/google/crypto/tink/internal/l0;

.field public z:Z


# direct methods
.method public constructor <init>(Lcom/amplitude/android/engagement/a;)V
    .locals 1

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lkj/b;->w:Lcom/amplitude/android/engagement/a;

    new-instance p1, Lcom/google/crypto/tink/internal/l0;

    const-string v0, "AmplitudeEngagementPlugin"

    invoke-direct {p1, v0}, Lcom/google/crypto/tink/internal/l0;-><init>(Ljava/lang/String;)V

    iput-object p1, p0, Lkj/b;->y:Lcom/google/crypto/tink/internal/l0;

    sget-object p1, Lkk/d;->x:Lkk/d;

    iput-object p1, p0, Lkj/b;->I:Lkk/d;

    return-void
.end method


# virtual methods
.method public final a(Ljk/a;)Ljk/a;
    .locals 6

    iget-object v0, p1, Ljk/a;->a:Ljava/lang/String;

    iget-object v1, p1, Ljk/a;->b:Ljava/lang/String;

    invoke-virtual {p0, v0, v1}, Lkj/b;->c(Ljava/lang/String;Ljava/lang/String;)V

    iget-object v0, p1, Ljk/a;->e:Ljava/lang/Long;

    const/4 v1, 0x3

    const/4 v2, 0x0

    if-eqz v0, :cond_0

    iget-object v3, p0, Lkj/b;->G:Ljava/lang/Long;

    iput-object v0, p0, Lkj/b;->G:Ljava/lang/Long;

    if-eqz v3, :cond_0

    invoke-virtual {v3, v0}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_0

    sget-object v0, Lbc3/q0;->a:Lkc3/e;

    sget-object v0, Lhc3/o;->a:Lbc3/w1;

    invoke-static {v0}, Lbc3/f0;->b(Lq83/j;)Lhc3/d;

    move-result-object v0

    new-instance v3, Landroidx/room/e;

    const/16 v4, 0x15

    invoke-direct {v3, p0, p1, v2, v4}, Landroidx/room/e;-><init>(Ljava/lang/Object;Ljava/lang/Object;Lq83/d;I)V

    invoke-static {v0, v2, v2, v3, v1}, Lbc3/f0;->z(Lbc3/c0;Lq83/j;Lbc3/d0;Lc93/m;I)Lbc3/c2;

    :cond_0
    invoke-virtual {p1}, Ljk/a;->a()Ljava/lang/String;

    move-result-object v0

    const-string v3, "[Amplitude] Screen Viewed"

    invoke-static {v0, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_1

    iget-object v0, p1, Ljk/a;->N:Ljava/util/LinkedHashMap;

    if-eqz v0, :cond_1

    const-string v3, "[Amplitude] Screen Name"

    invoke-interface {v0, v3}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    if-eqz v0, :cond_1

    instance-of v3, v0, Ljava/lang/String;

    if-eqz v3, :cond_1

    sget-object v3, Lbc3/q0;->a:Lkc3/e;

    sget-object v3, Lhc3/o;->a:Lbc3/w1;

    invoke-static {v3}, Lbc3/f0;->b(Lq83/j;)Lhc3/d;

    move-result-object v3

    new-instance v4, Landroidx/room/e;

    const/16 v5, 0x16

    invoke-direct {v4, p0, v0, v2, v5}, Landroidx/room/e;-><init>(Ljava/lang/Object;Ljava/lang/Object;Lq83/d;I)V

    invoke-static {v3, v2, v2, v4, v1}, Lbc3/f0;->z(Lbc3/c0;Lq83/j;Lbc3/d0;Lc93/m;I)Lbc3/c2;

    :cond_1
    sget-object v0, Lbc3/q0;->a:Lkc3/e;

    sget-object v0, Lhc3/o;->a:Lbc3/w1;

    invoke-static {v0}, Lbc3/f0;->b(Lq83/j;)Lhc3/d;

    move-result-object v0

    new-instance v3, La6/q;

    const/4 v4, 0x7

    invoke-direct {v3, p0, p1, v2, v4}, La6/q;-><init>(Ljava/lang/Object;Ljava/lang/Object;Lq83/d;I)V

    invoke-static {v0, v2, v2, v3, v1}, Lbc3/f0;->z(Lbc3/c0;Lq83/j;Lbc3/d0;Lc93/m;I)Lbc3/c2;

    new-instance v0, Lhj/o;

    const/4 v1, 0x1

    invoke-direct {v0, v1, p1}, Lhj/o;-><init>(ILjk/a;)V

    iget-object v1, p0, Lkj/b;->y:Lcom/google/crypto/tink/internal/l0;

    invoke-virtual {v1, v0}, Lcom/google/crypto/tink/internal/l0;->H(Lc93/a;)V

    return-object p1
.end method

.method public final b(Lgj/d;)V
    .locals 4

    iput-object p1, p0, Lkj/b;->x:Lgj/d;

    iget-object v0, p1, Lgj/d;->l:Lqk/c;

    const/4 v1, 0x0

    if-eqz v0, :cond_0

    invoke-virtual {p1}, Lgj/d;->c()Lqk/c;

    move-result-object v0

    iget-object v0, v0, Lqk/c;->a:Lcd3/g;

    invoke-virtual {v0}, Lcd3/g;->y()Lqk/a;

    move-result-object v0

    iget-object v0, v0, Lqk/a;->a:Ljava/lang/String;

    goto :goto_0

    :cond_0
    move-object v0, v1

    :goto_0
    if-eqz v0, :cond_1

    invoke-static {v0}, Lyb3/r;->i0(Ljava/lang/CharSequence;)Z

    move-result v2

    if-eqz v2, :cond_2

    :cond_1
    move-object v0, v1

    :cond_2
    iget-object v2, p1, Lgj/d;->l:Lqk/c;

    if-eqz v2, :cond_3

    invoke-virtual {p1}, Lgj/d;->c()Lqk/c;

    move-result-object p1

    iget-object p1, p1, Lqk/c;->a:Lcd3/g;

    invoke-virtual {p1}, Lcd3/g;->y()Lqk/a;

    move-result-object p1

    iget-object v1, p1, Lqk/a;->b:Ljava/lang/String;

    :cond_3
    iget-object p1, p0, Lkj/b;->w:Lcom/amplitude/android/engagement/a;

    iget-object p1, p1, Lcom/amplitude/android/engagement/a;->b:Lcom/amplitude/android/engagement/AmplitudeInitOptions;

    invoke-virtual {p1}, Lcom/amplitude/android/engagement/AmplitudeInitOptions;->getOptions()Lcom/amplitude/android/engagement/AmplitudeInitOptions$Options;

    move-result-object p1

    invoke-virtual {p1}, Lcom/amplitude/android/engagement/AmplitudeInitOptions$Options;->getLogLevel()Lhj/v;

    move-result-object p1

    iget-object v2, p0, Lkj/b;->y:Lcom/google/crypto/tink/internal/l0;

    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    const-string v3, "logLevel"

    invoke-static {p1, v3}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    iput-object p1, v2, Lcom/google/crypto/tink/internal/l0;->y:Ljava/lang/Object;

    new-instance p1, Lkj/a;

    const/4 v3, 0x1

    invoke-direct {p1, v0, v1, v3}, Lkj/a;-><init>(Ljava/lang/String;Ljava/lang/String;I)V

    invoke-virtual {v2, p1}, Lcom/google/crypto/tink/internal/l0;->H(Lc93/a;)V

    invoke-virtual {p0, v0, v1}, Lkj/b;->c(Ljava/lang/String;Ljava/lang/String;)V

    return-void
.end method

.method public final c(Ljava/lang/String;Ljava/lang/String;)V
    .locals 11

    new-instance v0, Lkj/a;

    const/4 v1, 0x0

    invoke-direct {v0, p1, p2, v1}, Lkj/a;-><init>(Ljava/lang/String;Ljava/lang/String;I)V

    iget-object v2, p0, Lkj/b;->y:Lcom/google/crypto/tink/internal/l0;

    invoke-virtual {v2, v0}, Lcom/google/crypto/tink/internal/l0;->H(Lc93/a;)V

    iget-object v0, p0, Lkj/b;->E:Ljava/lang/String;

    iget-object v2, p0, Lkj/b;->F:Ljava/lang/String;

    iput-object p1, p0, Lkj/b;->E:Ljava/lang/String;

    iput-object p2, p0, Lkj/b;->F:Ljava/lang/String;

    iget-boolean v3, p0, Lkj/b;->z:Z

    iget-object v4, p0, Lkj/b;->w:Lcom/amplitude/android/engagement/a;

    if-eqz v3, :cond_1

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_0

    invoke-static {p2, v2}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_3

    :cond_0
    invoke-virtual {v4}, Lcom/amplitude/android/engagement/a;->h()V

    :cond_1
    if-eqz p1, :cond_3

    invoke-static {p1}, Lyb3/r;->i0(Ljava/lang/CharSequence;)Z

    move-result v0

    if-eqz v0, :cond_2

    goto :goto_0

    :cond_2
    const/4 v0, 0x1

    iput-boolean v0, p0, Lkj/b;->z:Z

    new-instance v5, Lhj/b;

    new-instance v2, La3/m1;

    const/16 v3, 0x16

    invoke-direct {v2, p0, v3}, La3/m1;-><init>(Ljava/lang/Object;I)V

    new-array v8, v0, [Lkotlin/jvm/functions/Function1;

    aput-object v2, v8, v1

    const/4 v9, 0x0

    const/16 v10, 0x8

    move-object v6, p1

    move-object v7, p2

    invoke-direct/range {v5 .. v10}, Lhj/b;-><init>(Ljava/lang/String;Ljava/lang/String;[Lkotlin/jvm/functions/Function1;Ljava/util/Map;I)V

    invoke-virtual {v4, v5}, Lcom/amplitude/android/engagement/a;->a(Lhj/b;)V

    iput-object v5, p0, Lkj/b;->H:Lhj/b;

    :cond_3
    :goto_0
    return-void
.end method

.method public final getType()Lkk/d;
    .locals 1

    iget-object v0, p0, Lkj/b;->I:Lkk/d;

    return-object v0
.end method
