.class public final Li63/z;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field public static final k:Li63/e0;


# instance fields
.field public a:Li63/b0;

.field public b:Ljava/lang/String;

.field public c:I

.field public d:Z

.field public e:Ljava/lang/String;

.field public f:Ljava/lang/String;

.field public g:Ljava/lang/String;

.field public h:Ljava/util/List;

.field public i:Li63/x;

.field public j:Laj/c;


# direct methods
.method static constructor <clinit>()V
    .locals 2

    new-instance v0, Li63/z;

    invoke-direct {v0}, Li63/z;-><init>()V

    const-string v1, "http://localhost"

    invoke-static {v0, v1}, Li63/a0;->b(Li63/z;Ljava/lang/String;)V

    invoke-virtual {v0}, Li63/z;->b()Li63/e0;

    move-result-object v0

    sput-object v0, Li63/z;->k:Li63/e0;

    return-void
.end method

.method public constructor <init>()V
    .locals 10

    sget-object v0, Li63/b0;->c:Li63/b0;

    sget-object v1, Li63/w;->b:Li63/l;

    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    const-string v1, "protocol"

    invoke-static {v0, v1}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object v0, p0, Li63/z;->a:Li63/b0;

    const-string v0, ""

    iput-object v0, p0, Li63/z;->b:Ljava/lang/String;

    const/4 v1, 0x0

    iput v1, p0, Li63/z;->c:I

    iput-boolean v1, p0, Li63/z;->d:Z

    const/4 v2, 0x0

    iput-object v2, p0, Li63/z;->e:Ljava/lang/String;

    iput-object v2, p0, Li63/z;->f:Ljava/lang/String;

    sget-object v2, Li63/a;->a:Ljava/util/Set;

    sget-object v2, Lyb3/a;->a:Ljava/nio/charset/Charset;

    const-string v3, "charset"

    invoke-static {v2, v3}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v3, Ljava/lang/StringBuilder;

    invoke-direct {v3}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v2}, Ljava/nio/charset/Charset;->newEncoder()Ljava/nio/charset/CharsetEncoder;

    move-result-object v2

    const-string v4, "charset.newEncoder()"

    invoke-static {v2, v4}, Lkotlin/jvm/internal/k;->i(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-static {v2, v0, v1, v1}, Lhg3/i;->H(Ljava/nio/charset/CharsetEncoder;Ljava/lang/CharSequence;II)Lv63/e;

    move-result-object v0

    new-instance v2, La3/m1;

    const/16 v4, 0x12

    invoke-direct {v2, v3, v4}, La3/m1;-><init>(Ljava/lang/Object;I)V

    invoke-static {v0, v2}, Li63/a;->h(Lv63/e;Lkotlin/jvm/functions/Function1;)V

    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    const-string v2, "StringBuilder().apply(builderAction).toString()"

    invoke-static {v0, v2}, Lkotlin/jvm/internal/k;->i(Ljava/lang/Object;Ljava/lang/String;)V

    iput-object v0, p0, Li63/z;->g:Ljava/lang/String;

    new-instance v0, Ljava/util/ArrayList;

    sget-object v2, Lm83/y;->w:Lm83/y;

    const/16 v3, 0xa

    invoke-static {v2, v3}, Lm83/u;->i0(Ljava/lang/Iterable;I)I

    move-result v4

    invoke-direct {v0, v4}, Ljava/util/ArrayList;-><init>(I)V

    invoke-interface {v2}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v4

    :goto_0
    invoke-interface {v4}, Ljava/util/Iterator;->hasNext()Z

    move-result v5

    const-string v6, "<this>"

    const/4 v7, 0x1

    if-eqz v5, :cond_0

    invoke-interface {v4}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v5

    check-cast v5, Ljava/lang/String;

    invoke-static {v5, v6}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-static {v5, v7}, Li63/a;->g(Ljava/lang/String;Z)Ljava/lang/String;

    move-result-object v5

    invoke-virtual {v0, v5}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    goto :goto_0

    :cond_0
    iput-object v0, p0, Li63/z;->h:Ljava/util/List;

    new-instance v0, Li63/x;

    const/4 v4, 0x3

    invoke-direct {v0, v4}, Lal/a;-><init>(I)V

    :goto_1
    sget-object v4, Lm83/x;->w:Lm83/x;

    invoke-interface {v4}, Ljava/util/Iterator;->hasNext()Z

    move-result v5

    if-eqz v5, :cond_2

    invoke-interface {v4}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Ljava/lang/String;

    const-string v5, "name"

    invoke-static {v4, v5}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-static {v4, v1}, Li63/a;->f(Ljava/lang/String;Z)Ljava/lang/String;

    move-result-object v4

    new-instance v5, Ljava/util/ArrayList;

    invoke-static {v2, v3}, Lm83/u;->i0(Ljava/lang/Iterable;I)I

    move-result v8

    invoke-direct {v5, v8}, Ljava/util/ArrayList;-><init>(I)V

    invoke-interface {v2}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v8

    :goto_2
    invoke-interface {v8}, Ljava/util/Iterator;->hasNext()Z

    move-result v9

    if-eqz v9, :cond_1

    invoke-interface {v8}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v9

    check-cast v9, Ljava/lang/String;

    invoke-static {v9, v6}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-static {v9, v7}, Li63/a;->f(Ljava/lang/String;Z)Ljava/lang/String;

    move-result-object v9

    invoke-virtual {v5, v9}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    goto :goto_2

    :cond_1
    invoke-virtual {v0, v4, v5}, Lal/a;->E(Ljava/lang/String;Ljava/lang/Iterable;)V

    goto :goto_1

    :cond_2
    iput-object v0, p0, Li63/z;->i:Li63/x;

    new-instance v1, Laj/c;

    const/16 v2, 0xd

    invoke-direct {v1, v0, v2}, Laj/c;-><init>(Ljava/lang/Object;I)V

    iput-object v1, p0, Li63/z;->j:Laj/c;

    return-void
.end method


# virtual methods
.method public final a()V
    .locals 3

    iget-object v0, p0, Li63/z;->b:Ljava/lang/String;

    invoke-interface {v0}, Ljava/lang/CharSequence;->length()I

    move-result v0

    if-lez v0, :cond_0

    return-void

    :cond_0
    iget-object v0, p0, Li63/z;->a:Li63/b0;

    iget-object v0, v0, Li63/b0;->a:Ljava/lang/String;

    const-string v1, "file"

    invoke-static {v0, v1}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_1

    goto :goto_0

    :cond_1
    sget-object v0, Li63/z;->k:Li63/e0;

    iget-object v1, v0, Li63/e0;->b:Ljava/lang/String;

    iput-object v1, p0, Li63/z;->b:Ljava/lang/String;

    iget-object v1, p0, Li63/z;->a:Li63/b0;

    sget-object v2, Li63/b0;->c:Li63/b0;

    sget-object v2, Li63/b0;->c:Li63/b0;

    invoke-static {v1, v2}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_2

    iget-object v1, v0, Li63/e0;->a:Li63/b0;

    iput-object v1, p0, Li63/z;->a:Li63/b0;

    :cond_2
    iget v1, p0, Li63/z;->c:I

    if-nez v1, :cond_3

    iget v0, v0, Li63/e0;->c:I

    iput v0, p0, Li63/z;->c:I

    :cond_3
    :goto_0
    return-void
.end method

.method public final b()Li63/e0;
    .locals 10

    invoke-virtual {p0}, Li63/z;->a()V

    new-instance v0, Li63/e0;

    iget-object v1, p0, Li63/z;->a:Li63/b0;

    iget-object v2, p0, Li63/z;->b:Ljava/lang/String;

    iget v3, p0, Li63/z;->c:I

    iget-object v4, p0, Li63/z;->h:Ljava/util/List;

    check-cast v4, Ljava/lang/Iterable;

    move-object v5, v4

    new-instance v4, Ljava/util/ArrayList;

    const/16 v6, 0xa

    invoke-static {v5, v6}, Lm83/u;->i0(Ljava/lang/Iterable;I)I

    move-result v6

    invoke-direct {v4, v6}, Ljava/util/ArrayList;-><init>(I)V

    invoke-interface {v5}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v5

    :goto_0
    invoke-interface {v5}, Ljava/util/Iterator;->hasNext()Z

    move-result v6

    if-eqz v6, :cond_0

    invoke-interface {v5}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v6

    check-cast v6, Ljava/lang/String;

    invoke-static {v6}, Li63/a;->d(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v6

    invoke-virtual {v4, v6}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    goto :goto_0

    :cond_0
    iget-object v5, p0, Li63/z;->j:Laj/c;

    iget-object v5, v5, Laj/c;->x:Ljava/lang/Object;

    check-cast v5, Li63/x;

    invoke-static {v5}, Ldt/b;->o(Li63/x;)Li63/w;

    move-result-object v5

    iget-object v6, p0, Li63/z;->g:Ljava/lang/String;

    const/16 v7, 0xf

    const/4 v8, 0x0

    invoke-static {v8, v8, v7, v6, v8}, Li63/a;->e(IIILjava/lang/String;Z)Ljava/lang/String;

    move-result-object v6

    iget-object v7, p0, Li63/z;->e:Ljava/lang/String;

    const/4 v8, 0x0

    if-eqz v7, :cond_1

    invoke-static {v7}, Li63/a;->d(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v7

    goto :goto_1

    :cond_1
    move-object v7, v8

    :goto_1
    iget-object v9, p0, Li63/z;->f:Ljava/lang/String;

    if-eqz v9, :cond_2

    invoke-static {v9}, Li63/a;->d(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v8

    :cond_2
    invoke-virtual {p0}, Li63/z;->c()Ljava/lang/String;

    move-result-object v9

    invoke-direct/range {v0 .. v9}, Li63/e0;-><init>(Li63/b0;Ljava/lang/String;ILjava/util/ArrayList;Li63/w;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    return-object v0
.end method

.method public final c()Ljava/lang/String;
    .locals 8

    invoke-virtual {p0}, Li63/z;->a()V

    new-instance v1, Ljava/lang/StringBuilder;

    const/16 v0, 0x100

    invoke-direct {v1, v0}, Ljava/lang/StringBuilder;-><init>(I)V

    iget-object v0, p0, Li63/z;->a:Li63/b0;

    iget-object v0, v0, Li63/b0;->a:Ljava/lang/String;

    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/CharSequence;)Ljava/lang/Appendable;

    iget-object v0, p0, Li63/z;->a:Li63/b0;

    iget-object v0, v0, Li63/b0;->a:Ljava/lang/String;

    const-string v2, "file"

    invoke-virtual {v0, v2}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    move-result v2

    const/16 v3, 0x2f

    const-string v4, "://"

    if-eqz v2, :cond_1

    iget-object v0, p0, Li63/z;->b:Ljava/lang/String;

    invoke-static {p0}, Landroidx/room/c1;->w(Li63/z;)Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v1, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/CharSequence;)Ljava/lang/Appendable;

    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/CharSequence;)Ljava/lang/Appendable;

    invoke-static {v2, v3}, Lyb3/r;->z0(Ljava/lang/String;C)Z

    move-result v0

    if-nez v0, :cond_0

    invoke-virtual {v1, v3}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/Appendable;

    :cond_0
    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/CharSequence;)Ljava/lang/Appendable;

    goto/16 :goto_4

    :cond_1
    const-string v2, "mailto"

    invoke-virtual {v0, v2}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_4

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    iget-object v2, p0, Li63/z;->e:Ljava/lang/String;

    iget-object v3, p0, Li63/z;->f:Ljava/lang/String;

    if-nez v2, :cond_2

    goto :goto_0

    :cond_2
    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    if-eqz v3, :cond_3

    const/16 v2, 0x3a

    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    invoke-virtual {v0, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    :cond_3
    const-string v2, "@"

    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    :goto_0
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    const-string v2, "StringBuilder().apply(builderAction).toString()"

    invoke-static {v0, v2}, Lkotlin/jvm/internal/k;->i(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v2, p0, Li63/z;->b:Ljava/lang/String;

    const-string v3, ":"

    invoke-virtual {v1, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/CharSequence;)Ljava/lang/Appendable;

    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/CharSequence;)Ljava/lang/Appendable;

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/CharSequence;)Ljava/lang/Appendable;

    goto/16 :goto_4

    :cond_4
    invoke-virtual {v1, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/CharSequence;)Ljava/lang/Appendable;

    invoke-static {p0}, Landroidx/room/c1;->v(Li63/z;)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/CharSequence;)Ljava/lang/Appendable;

    invoke-static {p0}, Landroidx/room/c1;->w(Li63/z;)Ljava/lang/String;

    move-result-object v0

    iget-object v2, p0, Li63/z;->i:Li63/x;

    iget-boolean v4, p0, Li63/z;->d:Z

    const-string v5, "encodedPath"

    invoke-static {v0, v5}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v5, "encodedQueryParameters"

    invoke-static {v2, v5}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-static {v0}, Lyb3/r;->i0(Ljava/lang/CharSequence;)Z

    move-result v5

    if-nez v5, :cond_5

    const-string v5, "/"

    const/4 v6, 0x0

    invoke-static {v0, v5, v6}, Lyb3/y;->O(Ljava/lang/String;Ljava/lang/String;Z)Z

    move-result v5

    if-nez v5, :cond_5

    invoke-virtual {v1, v3}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/Appendable;

    :cond_5
    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/CharSequence;)Ljava/lang/Appendable;

    iget-object v0, v2, Lal/a;->x:Ljava/lang/Object;

    check-cast v0, Ljava/util/Map;

    invoke-interface {v0}, Ljava/util/Map;->isEmpty()Z

    move-result v0

    if-eqz v0, :cond_6

    if-eqz v4, :cond_7

    :cond_6
    const-string v0, "?"

    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/CharSequence;)Ljava/lang/Appendable;

    :cond_7
    invoke-virtual {v2}, Lal/a;->b()Ljava/util/Set;

    move-result-object v0

    check-cast v0, Ljava/lang/Iterable;

    move-object v2, v0

    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    invoke-interface {v2}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v2

    :goto_1
    invoke-interface {v2}, Ljava/util/Iterator;->hasNext()Z

    move-result v3

    if-eqz v3, :cond_a

    invoke-interface {v2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Ljava/util/Map$Entry;

    invoke-interface {v3}, Ljava/util/Map$Entry;->getKey()Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Ljava/lang/String;

    invoke-interface {v3}, Ljava/util/Map$Entry;->getValue()Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Ljava/util/List;

    invoke-interface {v3}, Ljava/util/List;->isEmpty()Z

    move-result v5

    if-eqz v5, :cond_8

    new-instance v3, Ll83/k;

    const/4 v5, 0x0

    invoke-direct {v3, v4, v5}, Ll83/k;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    invoke-static {v3}, Lwb3/f;->J(Ljava/lang/Object;)Ljava/util/List;

    move-result-object v3

    goto :goto_3

    :cond_8
    check-cast v3, Ljava/lang/Iterable;

    new-instance v5, Ljava/util/ArrayList;

    const/16 v6, 0xa

    invoke-static {v3, v6}, Lm83/u;->i0(Ljava/lang/Iterable;I)I

    move-result v6

    invoke-direct {v5, v6}, Ljava/util/ArrayList;-><init>(I)V

    invoke-interface {v3}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v3

    :goto_2
    invoke-interface {v3}, Ljava/util/Iterator;->hasNext()Z

    move-result v6

    if-eqz v6, :cond_9

    invoke-interface {v3}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v6

    check-cast v6, Ljava/lang/String;

    new-instance v7, Ll83/k;

    invoke-direct {v7, v4, v6}, Ll83/k;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    invoke-virtual {v5, v7}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    goto :goto_2

    :cond_9
    move-object v3, v5

    :goto_3
    check-cast v3, Ljava/lang/Iterable;

    invoke-static {v0, v3}, Lm83/s;->p0(Ljava/util/Collection;Ljava/lang/Iterable;)V

    goto :goto_1

    :cond_a
    sget-object v5, Li63/c0;->w:Li63/c0;

    const/16 v6, 0x3c

    const-string v2, "&"

    const/4 v3, 0x0

    const/4 v4, 0x0

    invoke-static/range {v0 .. v6}, Lm83/s;->M0(Ljava/lang/Iterable;Ljava/lang/Appendable;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lkotlin/jvm/functions/Function1;I)V

    iget-object v0, p0, Li63/z;->g:Ljava/lang/String;

    invoke-virtual {v0}, Ljava/lang/String;->length()I

    move-result v0

    if-lez v0, :cond_b

    const/16 v0, 0x23

    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/Appendable;

    iget-object v0, p0, Li63/z;->g:Ljava/lang/String;

    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/CharSequence;)Ljava/lang/Appendable;

    :cond_b
    :goto_4
    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    const-string v1, "appendTo(StringBuilder(256)).toString()"

    invoke-static {v0, v1}, Lkotlin/jvm/internal/k;->i(Ljava/lang/Object;Ljava/lang/String;)V

    return-object v0
.end method
