.class public final Ll1/x;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field public final a:Li93/j;

.field public final b:Ll1/n3;

.field public final c:Lm1/t;

.field public final d:Ll1/e0;

.field public final e:Ljava/lang/String;

.field public final f:Ljava/lang/String;

.field public final g:Ljava/lang/String;


# direct methods
.method public constructor <init>(Li93/j;Ll1/n3;Lm1/t;Ll1/e0;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Ll1/x;->a:Li93/j;

    iput-object p2, p0, Ll1/x;->b:Ll1/n3;

    iput-object p3, p0, Ll1/x;->c:Lm1/t;

    iput-object p4, p0, Ll1/x;->d:Ll1/e0;

    iput-object p5, p0, Ll1/x;->e:Ljava/lang/String;

    iput-object p6, p0, Ll1/x;->f:Ljava/lang/String;

    iput-object p7, p0, Ll1/x;->g:Ljava/lang/String;

    return-void
.end method


# virtual methods
.method public final a(Lm1/n;Ljava/util/Locale;)Ljava/lang/String;
    .locals 5

    const/4 v0, 0x1

    if-nez p1, :cond_0

    iget-object p1, p0, Ll1/x;->c:Lm1/t;

    iget-object p1, p1, Lm1/t;->a:Ljava/lang/String;

    sget-object p2, Ljava/util/Locale;->ROOT:Ljava/util/Locale;

    invoke-virtual {p1, p2}, Ljava/lang/String;->toUpperCase(Ljava/util/Locale;)Ljava/lang/String;

    move-result-object p1

    const-string p2, "toUpperCase(...)"

    invoke-static {p1, p2}, Lkotlin/jvm/internal/k;->i(Ljava/lang/Object;Ljava/lang/String;)V

    filled-new-array {p1}, [Ljava/lang/Object;

    move-result-object p1

    invoke-static {p1, v0}, Ljava/util/Arrays;->copyOf([Ljava/lang/Object;I)[Ljava/lang/Object;

    move-result-object p1

    array-length p2, p1

    invoke-static {p1, p2}, Ljava/util/Arrays;->copyOf([Ljava/lang/Object;I)[Ljava/lang/Object;

    move-result-object p1

    iget-object p2, p0, Ll1/x;->e:Ljava/lang/String;

    invoke-static {p2, p1}, Ljava/lang/String;->format(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object p1

    return-object p1

    :cond_0
    iget v1, p1, Lm1/n;->w:I

    iget-wide v2, p1, Lm1/n;->z:J

    iget-object p1, p0, Ll1/x;->a:Li93/j;

    invoke-virtual {p1, v1}, Li93/j;->e(I)Z

    move-result v4

    if-nez v4, :cond_1

    iget v0, p1, Li93/h;->w:I

    invoke-static {v0, p2}, Ll1/j;->a(ILjava/util/Locale;)Ljava/lang/String;

    move-result-object v0

    iget p1, p1, Li93/h;->x:I

    invoke-static {p1, p2}, Ll1/j;->a(ILjava/util/Locale;)Ljava/lang/String;

    move-result-object p1

    filled-new-array {v0, p1}, [Ljava/lang/Object;

    move-result-object p1

    const/4 p2, 0x2

    invoke-static {p1, p2}, Ljava/util/Arrays;->copyOf([Ljava/lang/Object;I)[Ljava/lang/Object;

    move-result-object p1

    array-length p2, p1

    invoke-static {p1, p2}, Ljava/util/Arrays;->copyOf([Ljava/lang/Object;I)[Ljava/lang/Object;

    move-result-object p1

    iget-object p2, p0, Ll1/x;->f:Ljava/lang/String;

    invoke-static {p2, p1}, Ljava/lang/String;->format(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object p1

    return-object p1

    :cond_1
    iget-object p1, p0, Ll1/x;->b:Ll1/n3;

    invoke-interface {p1, v1}, Ll1/n3;->isSelectableYear(I)Z

    move-result v1

    if-eqz v1, :cond_3

    invoke-interface {p1, v2, v3}, Ll1/n3;->isSelectableDate(J)Z

    move-result p1

    if-nez p1, :cond_2

    goto :goto_0

    :cond_2
    const-string p1, ""

    return-object p1

    :cond_3
    :goto_0
    invoke-static {v2, v3}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object p1

    const/4 v1, 0x0

    iget-object v2, p0, Ll1/x;->d:Ll1/e0;

    invoke-virtual {v2, p1, p2, v1}, Ll1/e0;->a(Ljava/lang/Long;Ljava/util/Locale;Z)Ljava/lang/String;

    move-result-object p1

    filled-new-array {p1}, [Ljava/lang/Object;

    move-result-object p1

    invoke-static {p1, v0}, Ljava/util/Arrays;->copyOf([Ljava/lang/Object;I)[Ljava/lang/Object;

    move-result-object p1

    array-length p2, p1

    invoke-static {p1, p2}, Ljava/util/Arrays;->copyOf([Ljava/lang/Object;I)[Ljava/lang/Object;

    move-result-object p1

    iget-object p2, p0, Ll1/x;->g:Ljava/lang/String;

    invoke-static {p2, p1}, Ljava/lang/String;->format(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object p1

    return-object p1
.end method
