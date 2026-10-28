.class public abstract Luj/f;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field public static final synthetic A:I

.field public static final a:J

.field public static final b:J

.field public static final c:J

.field public static final d:J

.field public static final e:J

.field public static final f:J

.field public static final g:J

.field public static final h:J

.field public static final i:J

.field public static final j:J

.field public static final k:J

.field public static final l:J

.field public static final m:J

.field public static final n:J

.field public static final o:J

.field public static final p:J

.field public static final q:J

.field public static final r:J

.field public static final s:J

.field public static final t:J

.field public static final u:J

.field public static final v:J

.field public static final w:J

.field public static final x:J

.field public static final y:J

.field public static final z:J


# direct methods
.method static constructor <clinit>()V
    .locals 13

    const-string v0, "#FFFFFF"

    invoke-static {v0}, Luj/f;->a(Ljava/lang/String;)J

    move-result-wide v1

    sput-wide v1, Luj/f;->a:J

    const/4 v3, 0x0

    invoke-static {v0}, Luj/f;->a(Ljava/lang/String;)J

    move-result-wide v4

    invoke-static {v3, v4, v5}, Li2/x;->c(FJ)J

    move-result-wide v3

    sput-wide v3, Luj/f;->b:J

    const-string v0, "#7856FF"

    invoke-static {v0}, Luj/f;->a(Ljava/lang/String;)J

    move-result-wide v3

    sput-wide v3, Luj/f;->c:J

    const-string v0, "#7D7C78"

    invoke-static {v0}, Luj/f;->a(Ljava/lang/String;)J

    move-result-wide v5

    sput-wide v5, Luj/f;->d:J

    const-string v0, "#A7A7A7"

    invoke-static {v0}, Luj/f;->a(Ljava/lang/String;)J

    move-result-wide v7

    sput-wide v7, Luj/f;->e:J

    const/high16 v0, 0x41c00000    # 24.0f

    invoke-static {v0, v3, v4}, Li2/x;->c(FJ)J

    const/high16 v0, 0x41200000    # 10.0f

    invoke-static {v0, v3, v4}, Li2/x;->c(FJ)J

    move-result-wide v9

    sput-wide v9, Luj/f;->f:J

    sput-wide v1, Luj/f;->g:J

    const-string v0, "#1E1E1E"

    invoke-static {v0}, Luj/f;->a(Ljava/lang/String;)J

    move-result-wide v9

    sput-wide v9, Luj/f;->h:J

    const-string v0, "#F7F7F7"

    invoke-static {v0}, Luj/f;->a(Ljava/lang/String;)J

    move-result-wide v9

    sput-wide v9, Luj/f;->i:J

    const-string v0, "#0F0F0F"

    invoke-static {v0}, Luj/f;->a(Ljava/lang/String;)J

    move-result-wide v11

    sput-wide v11, Luj/f;->j:J

    sput-wide v9, Luj/f;->k:J

    invoke-static {v0}, Luj/f;->a(Ljava/lang/String;)J

    move-result-wide v9

    sput-wide v9, Luj/f;->l:J

    const-string v0, "#E2E2E2"

    invoke-static {v0}, Luj/f;->a(Ljava/lang/String;)J

    move-result-wide v9

    sput-wide v9, Luj/f;->m:J

    const-string v0, "#3B3B3B"

    invoke-static {v0}, Luj/f;->a(Ljava/lang/String;)J

    move-result-wide v9

    sput-wide v9, Luj/f;->n:J

    const-string v0, "#E8E8E8"

    invoke-static {v0}, Luj/f;->a(Ljava/lang/String;)J

    move-result-wide v9

    sput-wide v9, Luj/f;->o:J

    const-string v0, "#363636"

    invoke-static {v0}, Luj/f;->a(Ljava/lang/String;)J

    move-result-wide v9

    sput-wide v9, Luj/f;->p:J

    const-string v0, "#373530"

    invoke-static {v0}, Luj/f;->a(Ljava/lang/String;)J

    move-result-wide v9

    sput-wide v9, Luj/f;->q:J

    sput-wide v1, Luj/f;->r:J

    sput-wide v5, Luj/f;->s:J

    sput-wide v7, Luj/f;->t:J

    const-string v0, "#C0C0C0"

    invoke-static {v0}, Luj/f;->a(Ljava/lang/String;)J

    move-result-wide v0

    sput-wide v0, Luj/f;->u:J

    const-string v0, "#565656"

    invoke-static {v0}, Luj/f;->a(Ljava/lang/String;)J

    move-result-wide v0

    sput-wide v0, Luj/f;->v:J

    sput-wide v3, Luj/f;->w:J

    const-string v0, "#6045CC"

    invoke-static {v0}, Luj/f;->a(Ljava/lang/String;)J

    move-result-wide v0

    sput-wide v0, Luj/f;->x:J

    const-string v0, "#F0E9BB"

    invoke-static {v0}, Luj/f;->a(Ljava/lang/String;)J

    move-result-wide v0

    sput-wide v0, Luj/f;->y:J

    const-string v0, "#FFD700"

    invoke-static {v0}, Luj/f;->a(Ljava/lang/String;)J

    move-result-wide v0

    sput-wide v0, Luj/f;->z:J

    return-void
.end method

.method public static final a(Ljava/lang/String;)J
    .locals 9

    const-string v0, "#"

    const/4 v1, 0x0

    invoke-static {p0, v0, v1}, Lyb3/y;->O(Ljava/lang/String;Ljava/lang/String;Z)Z

    move-result v0

    const/4 v2, 0x1

    const-string v3, "substring(...)"

    if-eqz v0, :cond_0

    invoke-virtual {p0, v2}, Ljava/lang/String;->substring(I)Ljava/lang/String;

    move-result-object p0

    invoke-static {p0, v3}, Lkotlin/jvm/internal/k;->i(Ljava/lang/Object;Ljava/lang/String;)V

    :cond_0
    invoke-virtual {p0}, Ljava/lang/String;->length()I

    move-result v0

    const/16 v4, 0xff

    const/4 v5, 0x3

    const/16 v6, 0x10

    const/4 v7, 0x2

    if-eq v0, v5, :cond_4

    const/4 v8, 0x4

    if-eq v0, v8, :cond_3

    const/4 v2, 0x6

    if-eq v0, v2, :cond_2

    const/16 v4, 0x8

    if-ne v0, v4, :cond_1

    invoke-virtual {p0, v1, v7}, Ljava/lang/String;->substring(II)Ljava/lang/String;

    move-result-object v0

    invoke-static {v0, v3}, Lkotlin/jvm/internal/k;->i(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-static {v6}, Lva3/d;->c(I)V

    invoke-static {v0, v6}, Ljava/lang/Integer;->parseInt(Ljava/lang/String;I)I

    move-result v0

    invoke-virtual {p0, v7, v8}, Ljava/lang/String;->substring(II)Ljava/lang/String;

    move-result-object v1

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->i(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-static {v6}, Lva3/d;->c(I)V

    invoke-static {v1, v6}, Ljava/lang/Integer;->parseInt(Ljava/lang/String;I)I

    move-result v1

    invoke-virtual {p0, v8, v2}, Ljava/lang/String;->substring(II)Ljava/lang/String;

    move-result-object v5

    invoke-static {v5, v3}, Lkotlin/jvm/internal/k;->i(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-static {v6}, Lva3/d;->c(I)V

    invoke-static {v5, v6}, Ljava/lang/Integer;->parseInt(Ljava/lang/String;I)I

    move-result v5

    invoke-virtual {p0, v2, v4}, Ljava/lang/String;->substring(II)Ljava/lang/String;

    move-result-object p0

    invoke-static {p0, v3}, Lkotlin/jvm/internal/k;->i(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-static {v6}, Lva3/d;->c(I)V

    invoke-static {p0, v6}, Ljava/lang/Integer;->parseInt(Ljava/lang/String;I)I

    move-result p0

    invoke-static {v0, v1, v5, p0}, Li2/w0;->d(IIII)J

    move-result-wide v0

    return-wide v0

    :cond_1
    new-instance p0, Ljava/lang/IllegalArgumentException;

    const-string v0, "Invalid color format. Use #RGB, #RGBA, #RRGGBB, or #RRGGBBAA."

    invoke-direct {p0, v0}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw p0

    :cond_2
    invoke-virtual {p0, v1, v7}, Ljava/lang/String;->substring(II)Ljava/lang/String;

    move-result-object v0

    invoke-static {v0, v3}, Lkotlin/jvm/internal/k;->i(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-static {v6}, Lva3/d;->c(I)V

    invoke-static {v0, v6}, Ljava/lang/Integer;->parseInt(Ljava/lang/String;I)I

    move-result v0

    invoke-virtual {p0, v7, v8}, Ljava/lang/String;->substring(II)Ljava/lang/String;

    move-result-object v1

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->i(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-static {v6}, Lva3/d;->c(I)V

    invoke-static {v1, v6}, Ljava/lang/Integer;->parseInt(Ljava/lang/String;I)I

    move-result v1

    invoke-virtual {p0, v8, v2}, Ljava/lang/String;->substring(II)Ljava/lang/String;

    move-result-object p0

    invoke-static {p0, v3}, Lkotlin/jvm/internal/k;->i(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-static {v6}, Lva3/d;->c(I)V

    invoke-static {p0, v6}, Ljava/lang/Integer;->parseInt(Ljava/lang/String;I)I

    move-result p0

    invoke-static {v0, v1, p0, v4}, Li2/w0;->d(IIII)J

    move-result-wide v0

    return-wide v0

    :cond_3
    invoke-virtual {p0, v1, v2}, Ljava/lang/String;->substring(II)Ljava/lang/String;

    move-result-object v0

    invoke-static {v0, v3}, Lkotlin/jvm/internal/k;->i(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-static {v7, v0}, Lyb3/y;->J(ILjava/lang/String;)Ljava/lang/String;

    move-result-object v0

    invoke-static {v6}, Lva3/d;->c(I)V

    invoke-static {v0, v6}, Ljava/lang/Integer;->parseInt(Ljava/lang/String;I)I

    move-result v0

    invoke-virtual {p0, v2, v7}, Ljava/lang/String;->substring(II)Ljava/lang/String;

    move-result-object v1

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->i(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-static {v7, v1}, Lyb3/y;->J(ILjava/lang/String;)Ljava/lang/String;

    move-result-object v1

    invoke-static {v6}, Lva3/d;->c(I)V

    invoke-static {v1, v6}, Ljava/lang/Integer;->parseInt(Ljava/lang/String;I)I

    move-result v1

    invoke-virtual {p0, v7, v5}, Ljava/lang/String;->substring(II)Ljava/lang/String;

    move-result-object v2

    invoke-static {v2, v3}, Lkotlin/jvm/internal/k;->i(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-static {v7, v2}, Lyb3/y;->J(ILjava/lang/String;)Ljava/lang/String;

    move-result-object v2

    invoke-static {v6}, Lva3/d;->c(I)V

    invoke-static {v2, v6}, Ljava/lang/Integer;->parseInt(Ljava/lang/String;I)I

    move-result v2

    invoke-virtual {p0, v5, v8}, Ljava/lang/String;->substring(II)Ljava/lang/String;

    move-result-object p0

    invoke-static {p0, v3}, Lkotlin/jvm/internal/k;->i(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-static {v7, p0}, Lyb3/y;->J(ILjava/lang/String;)Ljava/lang/String;

    move-result-object p0

    invoke-static {v6}, Lva3/d;->c(I)V

    invoke-static {p0, v6}, Ljava/lang/Integer;->parseInt(Ljava/lang/String;I)I

    move-result p0

    invoke-static {v0, v1, v2, p0}, Li2/w0;->d(IIII)J

    move-result-wide v0

    return-wide v0

    :cond_4
    invoke-virtual {p0, v1, v2}, Ljava/lang/String;->substring(II)Ljava/lang/String;

    move-result-object v0

    invoke-static {v0, v3}, Lkotlin/jvm/internal/k;->i(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-static {v7, v0}, Lyb3/y;->J(ILjava/lang/String;)Ljava/lang/String;

    move-result-object v0

    invoke-static {v6}, Lva3/d;->c(I)V

    invoke-static {v0, v6}, Ljava/lang/Integer;->parseInt(Ljava/lang/String;I)I

    move-result v0

    invoke-virtual {p0, v2, v7}, Ljava/lang/String;->substring(II)Ljava/lang/String;

    move-result-object v1

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->i(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-static {v7, v1}, Lyb3/y;->J(ILjava/lang/String;)Ljava/lang/String;

    move-result-object v1

    invoke-static {v6}, Lva3/d;->c(I)V

    invoke-static {v1, v6}, Ljava/lang/Integer;->parseInt(Ljava/lang/String;I)I

    move-result v1

    invoke-virtual {p0, v7, v5}, Ljava/lang/String;->substring(II)Ljava/lang/String;

    move-result-object p0

    invoke-static {p0, v3}, Lkotlin/jvm/internal/k;->i(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-static {v7, p0}, Lyb3/y;->J(ILjava/lang/String;)Ljava/lang/String;

    move-result-object p0

    invoke-static {v6}, Lva3/d;->c(I)V

    invoke-static {p0, v6}, Ljava/lang/Integer;->parseInt(Ljava/lang/String;I)I

    move-result p0

    invoke-static {v0, v1, p0, v4}, Li2/w0;->d(IIII)J

    move-result-wide v0

    return-wide v0
.end method
