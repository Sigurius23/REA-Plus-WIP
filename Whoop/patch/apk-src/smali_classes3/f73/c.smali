.class public final Lf73/c;
.super Lvp/c;
.source "SourceFile"


# static fields
.field public static final w:Ljava/util/regex/Pattern;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    const-string v0, "^\\[([xX\\s])]\\s+(.*)"

    invoke-static {v0}, Ljava/util/regex/Pattern;->compile(Ljava/lang/String;)Ljava/util/regex/Pattern;

    move-result-object v0

    sput-object v0, Lf73/c;->w:Ljava/util/regex/Pattern;

    return-void
.end method


# virtual methods
.method public final B(Laf3/s;)V
    .locals 7

    iget-object v0, p1, Laf3/t;->b:Laf3/t;

    instance-of v1, v0, Laf3/w;

    if-eqz v1, :cond_7

    iget-object v1, v0, Laf3/t;->b:Laf3/t;

    instance-of v2, v1, Laf3/a0;

    if-eqz v2, :cond_7

    move-object v2, v1

    check-cast v2, Laf3/a0;

    sget-object v3, Lf73/c;->w:Ljava/util/regex/Pattern;

    iget-object v2, v2, Laf3/a0;->g:Ljava/lang/String;

    invoke-virtual {v3, v2}, Ljava/util/regex/Pattern;->matcher(Ljava/lang/CharSequence;)Ljava/util/regex/Matcher;

    move-result-object v2

    invoke-virtual {v2}, Ljava/util/regex/Matcher;->matches()Z

    move-result v3

    if-eqz v3, :cond_7

    const/4 v3, 0x1

    invoke-virtual {v2, v3}, Ljava/util/regex/Matcher;->group(I)Ljava/lang/String;

    move-result-object v4

    const-string v5, "x"

    invoke-virtual {v5, v4}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v5

    if-nez v5, :cond_1

    const-string v5, "X"

    invoke-virtual {v5, v4}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v4

    if-eqz v4, :cond_0

    goto :goto_0

    :cond_0
    const/4 v3, 0x0

    :cond_1
    :goto_0
    new-instance v4, Lf73/b;

    invoke-direct {v4, v3}, Lf73/b;-><init>(Z)V

    new-instance v3, Laf3/w;

    invoke-direct {v3}, Laf3/t;-><init>()V

    invoke-virtual {v4}, Laf3/t;->j()V

    iget-object v5, p1, Laf3/t;->d:Laf3/t;

    iput-object v5, v4, Laf3/t;->d:Laf3/t;

    if-eqz v5, :cond_2

    iput-object v4, v5, Laf3/t;->e:Laf3/t;

    :cond_2
    iput-object p1, v4, Laf3/t;->e:Laf3/t;

    iput-object v4, p1, Laf3/t;->d:Laf3/t;

    iget-object v5, p1, Laf3/t;->a:Laf3/t;

    iput-object v5, v4, Laf3/t;->a:Laf3/t;

    iget-object v6, v4, Laf3/t;->d:Laf3/t;

    if-nez v6, :cond_3

    iput-object v4, v5, Laf3/t;->b:Laf3/t;

    :cond_3
    const/4 v5, 0x2

    invoke-virtual {v2, v5}, Ljava/util/regex/Matcher;->group(I)Ljava/lang/String;

    move-result-object v2

    invoke-static {v2}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v5

    if-nez v5, :cond_4

    new-instance v5, Laf3/a0;

    invoke-direct {v5, v2}, Laf3/a0;-><init>(Ljava/lang/String;)V

    invoke-virtual {v3, v5}, Laf3/t;->c(Laf3/t;)V

    :cond_4
    iget-object v1, v1, Laf3/t;->e:Laf3/t;

    :goto_1
    if-eqz v1, :cond_5

    iget-object v2, v1, Laf3/t;->e:Laf3/t;

    invoke-virtual {v3, v1}, Laf3/t;->c(Laf3/t;)V

    move-object v1, v2

    goto :goto_1

    :cond_5
    invoke-virtual {v4, v3}, Laf3/t;->c(Laf3/t;)V

    iget-object v0, v0, Laf3/t;->e:Laf3/t;

    :goto_2
    if-eqz v0, :cond_6

    iget-object v1, v0, Laf3/t;->e:Laf3/t;

    invoke-virtual {v4, v0}, Laf3/t;->c(Laf3/t;)V

    move-object v0, v1

    goto :goto_2

    :cond_6
    invoke-virtual {p1}, Laf3/t;->j()V

    invoke-virtual {p0, v4}, Lvp/c;->r0(Laf3/t;)V

    return-void

    :cond_7
    invoke-virtual {p0, p1}, Lvp/c;->r0(Laf3/t;)V

    return-void
.end method
