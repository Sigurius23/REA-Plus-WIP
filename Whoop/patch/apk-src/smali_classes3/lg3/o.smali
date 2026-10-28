.class public final Llg3/o;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field public static final f:Lg73/a;

.field public static final g:Lb2/d;


# instance fields
.field public a:Llg3/o;

.field public final b:Llg3/o;

.field public final c:Ljava/util/ArrayList;

.field public final d:Z

.field public e:I


# direct methods
.method static constructor <clinit>()V
    .locals 4

    new-instance v0, Lg73/a;

    const/16 v1, 0x14

    invoke-direct {v0, v1}, Lg73/a;-><init>(I)V

    sput-object v0, Llg3/o;->f:Lg73/a;

    new-instance v0, Ljava/util/HashMap;

    invoke-direct {v0}, Ljava/util/HashMap;-><init>()V

    const/16 v1, 0x47

    invoke-static {v1}, Ljava/lang/Character;->valueOf(C)Ljava/lang/Character;

    move-result-object v1

    sget-object v2, Lng3/a;->d0:Lng3/a;

    invoke-virtual {v0, v1, v2}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const/16 v1, 0x79

    invoke-static {v1}, Ljava/lang/Character;->valueOf(C)Ljava/lang/Character;

    move-result-object v1

    sget-object v2, Lng3/a;->b0:Lng3/a;

    invoke-virtual {v0, v1, v2}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const/16 v1, 0x75

    invoke-static {v1}, Ljava/lang/Character;->valueOf(C)Ljava/lang/Character;

    move-result-object v1

    sget-object v2, Lng3/a;->c0:Lng3/a;

    invoke-virtual {v0, v1, v2}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const/16 v1, 0x51

    invoke-static {v1}, Ljava/lang/Character;->valueOf(C)Ljava/lang/Character;

    move-result-object v1

    sget v2, Lng3/i;->a:I

    sget-object v2, Lng3/g;->x:Lng3/d;

    invoke-virtual {v0, v1, v2}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const/16 v1, 0x71

    invoke-static {v1}, Ljava/lang/Character;->valueOf(C)Ljava/lang/Character;

    move-result-object v1

    invoke-virtual {v0, v1, v2}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const/16 v1, 0x4d

    invoke-static {v1}, Ljava/lang/Character;->valueOf(C)Ljava/lang/Character;

    move-result-object v1

    sget-object v2, Lng3/a;->Z:Lng3/a;

    invoke-virtual {v0, v1, v2}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const/16 v1, 0x4c

    invoke-static {v1}, Ljava/lang/Character;->valueOf(C)Ljava/lang/Character;

    move-result-object v1

    invoke-virtual {v0, v1, v2}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const/16 v1, 0x44

    invoke-static {v1}, Ljava/lang/Character;->valueOf(C)Ljava/lang/Character;

    move-result-object v1

    sget-object v2, Lng3/a;->V:Lng3/a;

    invoke-virtual {v0, v1, v2}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const/16 v1, 0x64

    invoke-static {v1}, Ljava/lang/Character;->valueOf(C)Ljava/lang/Character;

    move-result-object v1

    sget-object v2, Lng3/a;->U:Lng3/a;

    invoke-virtual {v0, v1, v2}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const/16 v1, 0x46

    invoke-static {v1}, Ljava/lang/Character;->valueOf(C)Ljava/lang/Character;

    move-result-object v1

    sget-object v2, Lng3/a;->S:Lng3/a;

    invoke-virtual {v0, v1, v2}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const/16 v1, 0x45

    invoke-static {v1}, Ljava/lang/Character;->valueOf(C)Ljava/lang/Character;

    move-result-object v1

    sget-object v2, Lng3/a;->R:Lng3/a;

    invoke-virtual {v0, v1, v2}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const/16 v1, 0x63

    invoke-static {v1}, Ljava/lang/Character;->valueOf(C)Ljava/lang/Character;

    move-result-object v1

    invoke-virtual {v0, v1, v2}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const/16 v1, 0x65

    invoke-static {v1}, Ljava/lang/Character;->valueOf(C)Ljava/lang/Character;

    move-result-object v1

    invoke-virtual {v0, v1, v2}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const/16 v1, 0x61

    invoke-static {v1}, Ljava/lang/Character;->valueOf(C)Ljava/lang/Character;

    move-result-object v1

    sget-object v2, Lng3/a;->Q:Lng3/a;

    invoke-virtual {v0, v1, v2}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const/16 v1, 0x48

    invoke-static {v1}, Ljava/lang/Character;->valueOf(C)Ljava/lang/Character;

    move-result-object v1

    sget-object v2, Lng3/a;->O:Lng3/a;

    invoke-virtual {v0, v1, v2}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const/16 v1, 0x6b

    invoke-static {v1}, Ljava/lang/Character;->valueOf(C)Ljava/lang/Character;

    move-result-object v1

    sget-object v2, Lng3/a;->P:Lng3/a;

    invoke-virtual {v0, v1, v2}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const/16 v1, 0x4b

    invoke-static {v1}, Ljava/lang/Character;->valueOf(C)Ljava/lang/Character;

    move-result-object v1

    sget-object v2, Lng3/a;->M:Lng3/a;

    invoke-virtual {v0, v1, v2}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const/16 v1, 0x68

    invoke-static {v1}, Ljava/lang/Character;->valueOf(C)Ljava/lang/Character;

    move-result-object v1

    sget-object v2, Lng3/a;->N:Lng3/a;

    invoke-virtual {v0, v1, v2}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const/16 v1, 0x6d

    invoke-static {v1}, Ljava/lang/Character;->valueOf(C)Ljava/lang/Character;

    move-result-object v1

    sget-object v2, Lng3/a;->K:Lng3/a;

    invoke-virtual {v0, v1, v2}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const/16 v1, 0x73

    invoke-static {v1}, Ljava/lang/Character;->valueOf(C)Ljava/lang/Character;

    move-result-object v1

    sget-object v2, Lng3/a;->I:Lng3/a;

    invoke-virtual {v0, v1, v2}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const/16 v1, 0x53

    invoke-static {v1}, Ljava/lang/Character;->valueOf(C)Ljava/lang/Character;

    move-result-object v1

    sget-object v2, Lng3/a;->y:Lng3/a;

    invoke-virtual {v0, v1, v2}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const/16 v1, 0x41

    invoke-static {v1}, Ljava/lang/Character;->valueOf(C)Ljava/lang/Character;

    move-result-object v1

    sget-object v3, Lng3/a;->H:Lng3/a;

    invoke-virtual {v0, v1, v3}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const/16 v1, 0x6e

    invoke-static {v1}, Ljava/lang/Character;->valueOf(C)Ljava/lang/Character;

    move-result-object v1

    invoke-virtual {v0, v1, v2}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const/16 v1, 0x4e

    invoke-static {v1}, Ljava/lang/Character;->valueOf(C)Ljava/lang/Character;

    move-result-object v1

    sget-object v2, Lng3/a;->z:Lng3/a;

    invoke-virtual {v0, v1, v2}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    new-instance v0, Lb2/d;

    const/16 v1, 0x11

    invoke-direct {v0, v1}, Lb2/d;-><init>(I)V

    sput-object v0, Llg3/o;->g:Lb2/d;

    return-void
.end method

.method public constructor <init>()V
    .locals 1

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    iput-object p0, p0, Llg3/o;->a:Llg3/o;

    .line 3
    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    iput-object v0, p0, Llg3/o;->c:Ljava/util/ArrayList;

    const/4 v0, -0x1

    .line 4
    iput v0, p0, Llg3/o;->e:I

    const/4 v0, 0x0

    .line 5
    iput-object v0, p0, Llg3/o;->b:Llg3/o;

    const/4 v0, 0x0

    .line 6
    iput-boolean v0, p0, Llg3/o;->d:Z

    return-void
.end method

.method public constructor <init>(Llg3/o;)V
    .locals 1

    .line 7
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 8
    iput-object p0, p0, Llg3/o;->a:Llg3/o;

    .line 9
    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    iput-object v0, p0, Llg3/o;->c:Ljava/util/ArrayList;

    const/4 v0, -0x1

    .line 10
    iput v0, p0, Llg3/o;->e:I

    .line 11
    iput-object p1, p0, Llg3/o;->b:Llg3/o;

    const/4 p1, 0x1

    .line 12
    iput-boolean p1, p0, Llg3/o;->d:Z

    return-void
.end method


# virtual methods
.method public final a(Llg3/b;)V
    .locals 2

    const-string v0, "formatter"

    invoke-static {p1, v0}, Lcom/squareup/wire/n;->V(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object p1, p1, Llg3/b;->a:Llg3/e;

    iget-boolean v0, p1, Llg3/e;->x:Z

    if-nez v0, :cond_0

    goto :goto_0

    :cond_0
    new-instance v0, Llg3/e;

    iget-object p1, p1, Llg3/e;->w:[Llg3/f;

    const/4 v1, 0x0

    invoke-direct {v0, p1, v1}, Llg3/e;-><init>([Llg3/f;Z)V

    move-object p1, v0

    :goto_0
    invoke-virtual {p0, p1}, Llg3/o;->b(Llg3/f;)I

    return-void
.end method

.method public final b(Llg3/f;)I
    .locals 1

    const-string v0, "pp"

    invoke-static {p1, v0}, Lcom/squareup/wire/n;->V(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v0, p0, Llg3/o;->a:Llg3/o;

    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    iget-object v0, v0, Llg3/o;->c:Ljava/util/ArrayList;

    invoke-virtual {v0, p1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    iget-object p1, p0, Llg3/o;->a:Llg3/o;

    const/4 v0, -0x1

    iput v0, p1, Llg3/o;->e:I

    iget-object p1, p1, Llg3/o;->c:Ljava/util/ArrayList;

    invoke-virtual {p1}, Ljava/util/ArrayList;->size()I

    move-result p1

    add-int/lit8 p1, p1, -0x1

    return p1
.end method

.method public final c(C)V
    .locals 1

    new-instance v0, Llg3/d;

    invoke-direct {v0, p1}, Llg3/d;-><init>(C)V

    invoke-virtual {p0, v0}, Llg3/o;->b(Llg3/f;)I

    return-void
.end method

.method public final d(Ljava/lang/String;)V
    .locals 2

    invoke-virtual {p1}, Ljava/lang/String;->length()I

    move-result v0

    if-lez v0, :cond_1

    invoke-virtual {p1}, Ljava/lang/String;->length()I

    move-result v0

    const/4 v1, 0x1

    if-ne v0, v1, :cond_0

    new-instance v0, Llg3/d;

    const/4 v1, 0x0

    invoke-virtual {p1, v1}, Ljava/lang/String;->charAt(I)C

    move-result p1

    invoke-direct {v0, p1}, Llg3/d;-><init>(C)V

    invoke-virtual {p0, v0}, Llg3/o;->b(Llg3/f;)I

    return-void

    :cond_0
    new-instance v0, Llg3/l;

    invoke-direct {v0, p1}, Llg3/l;-><init>(Ljava/lang/String;)V

    invoke-virtual {p0, v0}, Llg3/o;->b(Llg3/f;)I

    :cond_1
    return-void
.end method

.method public final e(Lng3/m;Ljava/util/HashMap;)V
    .locals 1

    const-string v0, "field"

    invoke-static {p1, v0}, Lcom/squareup/wire/n;->V(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v0, Ljava/util/LinkedHashMap;

    invoke-direct {v0, p2}, Ljava/util/LinkedHashMap;-><init>(Ljava/util/Map;)V

    sget-object p2, Llg3/w;->w:Llg3/w;

    invoke-static {p2, v0}, Ljava/util/Collections;->singletonMap(Ljava/lang/Object;Ljava/lang/Object;)Ljava/util/Map;

    move-result-object p2

    new-instance v0, Ld1/j;

    invoke-direct {v0, p2}, Ld1/j;-><init>(Ljava/util/Map;)V

    new-instance p2, Llg3/c;

    invoke-direct {p2, v0}, Llg3/c;-><init>(Ld1/j;)V

    new-instance v0, Llg3/m;

    invoke-direct {v0, p1, p2}, Llg3/m;-><init>(Lng3/m;Llg3/c;)V

    invoke-virtual {p0, v0}, Llg3/o;->b(Llg3/f;)I

    return-void
.end method

.method public final f(Llg3/i;)V
    .locals 13

    iget-object v0, p0, Llg3/o;->a:Llg3/o;

    iget v1, v0, Llg3/o;->e:I

    if-ltz v1, :cond_3

    iget-object v0, v0, Llg3/o;->c:Ljava/util/ArrayList;

    invoke-virtual {v0, v1}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v0

    instance-of v0, v0, Llg3/i;

    if-eqz v0, :cond_3

    iget-object v0, p0, Llg3/o;->a:Llg3/o;

    iget v1, v0, Llg3/o;->e:I

    iget-object v0, v0, Llg3/o;->c:Ljava/util/ArrayList;

    invoke-virtual {v0, v1}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Llg3/i;

    iget v4, p1, Llg3/i;->x:I

    iget v5, p1, Llg3/i;->y:I

    const/4 v2, -0x1

    if-ne v4, v5, :cond_1

    iget v6, p1, Llg3/i;->z:I

    const/4 v3, 0x4

    if-ne v6, v3, :cond_1

    new-instance v7, Llg3/i;

    iget-object v8, v0, Llg3/i;->w:Lng3/m;

    iget v9, v0, Llg3/i;->x:I

    iget v10, v0, Llg3/i;->y:I

    iget v11, v0, Llg3/i;->z:I

    iget v0, v0, Llg3/i;->E:I

    add-int v12, v0, v5

    invoke-direct/range {v7 .. v12}, Llg3/i;-><init>(Lng3/m;IIII)V

    move-object v0, v7

    iget v3, p1, Llg3/i;->E:I

    if-ne v3, v2, :cond_0

    goto :goto_0

    :cond_0
    new-instance v2, Llg3/i;

    iget-object v3, p1, Llg3/i;->w:Lng3/m;

    const/4 v7, -0x1

    invoke-direct/range {v2 .. v7}, Llg3/i;-><init>(Lng3/m;IIII)V

    move-object p1, v2

    :goto_0
    invoke-virtual {p0, p1}, Llg3/o;->b(Llg3/f;)I

    iget-object p1, p0, Llg3/o;->a:Llg3/o;

    iput v1, p1, Llg3/o;->e:I

    :goto_1
    move-object v7, v0

    goto :goto_3

    :cond_1
    iget v3, v0, Llg3/i;->E:I

    if-ne v3, v2, :cond_2

    goto :goto_2

    :cond_2
    new-instance v4, Llg3/i;

    iget-object v5, v0, Llg3/i;->w:Lng3/m;

    iget v6, v0, Llg3/i;->x:I

    iget v7, v0, Llg3/i;->y:I

    iget v8, v0, Llg3/i;->z:I

    const/4 v9, -0x1

    invoke-direct/range {v4 .. v9}, Llg3/i;-><init>(Lng3/m;IIII)V

    move-object v0, v4

    :goto_2
    iget-object v2, p0, Llg3/o;->a:Llg3/o;

    invoke-virtual {p0, p1}, Llg3/o;->b(Llg3/f;)I

    move-result p1

    iput p1, v2, Llg3/o;->e:I

    goto :goto_1

    :goto_3
    iget-object p1, p0, Llg3/o;->a:Llg3/o;

    iget-object p1, p1, Llg3/o;->c:Ljava/util/ArrayList;

    invoke-virtual {p1, v1, v7}, Ljava/util/ArrayList;->set(ILjava/lang/Object;)Ljava/lang/Object;

    return-void

    :cond_3
    iget-object v0, p0, Llg3/o;->a:Llg3/o;

    invoke-virtual {p0, p1}, Llg3/o;->b(Llg3/f;)I

    move-result p1

    iput p1, v0, Llg3/o;->e:I

    return-void
.end method

.method public final g(Lng3/m;I)V
    .locals 2

    const-string v0, "field"

    invoke-static {p1, v0}, Lcom/squareup/wire/n;->V(Ljava/lang/Object;Ljava/lang/String;)V

    const/4 v0, 0x1

    if-lt p2, v0, :cond_0

    const/16 v0, 0x13

    if-gt p2, v0, :cond_0

    new-instance v0, Llg3/i;

    const/4 v1, 0x4

    invoke-direct {v0, p1, p2, p2, v1}, Llg3/i;-><init>(Lng3/m;III)V

    invoke-virtual {p0, v0}, Llg3/o;->f(Llg3/i;)V

    return-void

    :cond_0
    new-instance p1, Ljava/lang/IllegalArgumentException;

    const-string v0, "The width must be from 1 to 19 inclusive but was "

    invoke-static {p2, v0}, Lb9/y;->h(ILjava/lang/String;)Ljava/lang/String;

    move-result-object p2

    invoke-direct {p1, p2}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw p1
.end method

.method public final h(Lng3/m;III)V
    .locals 2

    if-ne p2, p3, :cond_0

    const/4 v0, 0x4

    if-ne p4, v0, :cond_0

    invoke-virtual {p0, p1, p3}, Llg3/o;->g(Lng3/m;I)V

    return-void

    :cond_0
    const-string v0, "field"

    invoke-static {p1, v0}, Lcom/squareup/wire/n;->V(Ljava/lang/Object;Ljava/lang/String;)V

    if-eqz p4, :cond_4

    const/4 v0, 0x1

    if-lt p2, v0, :cond_3

    const/16 v1, 0x13

    if-gt p2, v1, :cond_3

    if-lt p3, v0, :cond_2

    if-gt p3, v1, :cond_2

    if-lt p3, p2, :cond_1

    new-instance v0, Llg3/i;

    invoke-direct {v0, p1, p2, p3, p4}, Llg3/i;-><init>(Lng3/m;III)V

    invoke-virtual {p0, v0}, Llg3/o;->f(Llg3/i;)V

    return-void

    :cond_1
    new-instance p1, Ljava/lang/IllegalArgumentException;

    const-string p4, "The maximum width must exceed or equal the minimum width but "

    const-string v0, " < "

    invoke-static {p3, p2, p4, v0}, Lb9/y;->g(IILjava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object p2

    invoke-direct {p1, p2}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_2
    new-instance p1, Ljava/lang/IllegalArgumentException;

    const-string p2, "The maximum width must be from 1 to 19 inclusive but was "

    invoke-static {p3, p2}, Lb9/y;->h(ILjava/lang/String;)Ljava/lang/String;

    move-result-object p2

    invoke-direct {p1, p2}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_3
    new-instance p1, Ljava/lang/IllegalArgumentException;

    const-string p3, "The minimum width must be from 1 to 19 inclusive but was "

    invoke-static {p2, p3}, Lb9/y;->h(ILjava/lang/String;)Ljava/lang/String;

    move-result-object p2

    invoke-direct {p1, p2}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_4
    new-instance p1, Ljava/lang/NullPointerException;

    const-string p2, " must not be null"

    const-string p3, "signStyle"

    invoke-static {p3, p2}, Lb9/y;->l(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object p2

    invoke-direct {p1, p2}, Ljava/lang/NullPointerException;-><init>(Ljava/lang/String;)V

    throw p1
.end method

.method public final i()V
    .locals 3

    iget-object v0, p0, Llg3/o;->a:Llg3/o;

    iget-object v1, v0, Llg3/o;->b:Llg3/o;

    if-eqz v1, :cond_1

    iget-object v0, v0, Llg3/o;->c:Ljava/util/ArrayList;

    invoke-virtual {v0}, Ljava/util/ArrayList;->size()I

    move-result v0

    if-lez v0, :cond_0

    new-instance v0, Llg3/e;

    iget-object v1, p0, Llg3/o;->a:Llg3/o;

    iget-object v2, v1, Llg3/o;->c:Ljava/util/ArrayList;

    iget-boolean v1, v1, Llg3/o;->d:Z

    invoke-direct {v0, v1, v2}, Llg3/e;-><init>(ZLjava/util/ArrayList;)V

    iget-object v1, p0, Llg3/o;->a:Llg3/o;

    iget-object v1, v1, Llg3/o;->b:Llg3/o;

    iput-object v1, p0, Llg3/o;->a:Llg3/o;

    invoke-virtual {p0, v0}, Llg3/o;->b(Llg3/f;)I

    return-void

    :cond_0
    iget-object v0, p0, Llg3/o;->a:Llg3/o;

    iget-object v0, v0, Llg3/o;->b:Llg3/o;

    iput-object v0, p0, Llg3/o;->a:Llg3/o;

    return-void

    :cond_1
    new-instance v0, Ljava/lang/IllegalStateException;

    const-string v1, "Cannot call optionalEnd() as there was no previous call to optionalStart()"

    invoke-direct {v0, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v0
.end method

.method public final j()V
    .locals 2

    iget-object v0, p0, Llg3/o;->a:Llg3/o;

    const/4 v1, -0x1

    iput v1, v0, Llg3/o;->e:I

    new-instance v1, Llg3/o;

    invoke-direct {v1, v0}, Llg3/o;-><init>(Llg3/o;)V

    iput-object v1, p0, Llg3/o;->a:Llg3/o;

    return-void
.end method

.method public final k()Llg3/b;
    .locals 6

    invoke-static {}, Ljava/util/Locale;->getDefault()Ljava/util/Locale;

    move-result-object v2

    const-string v0, "locale"

    invoke-static {v2, v0}, Lcom/squareup/wire/n;->V(Ljava/lang/Object;Ljava/lang/String;)V

    :goto_0
    iget-object v0, p0, Llg3/o;->a:Llg3/o;

    iget-object v0, v0, Llg3/o;->b:Llg3/o;

    if-eqz v0, :cond_0

    invoke-virtual {p0}, Llg3/o;->i()V

    goto :goto_0

    :cond_0
    new-instance v1, Llg3/e;

    iget-object v0, p0, Llg3/o;->c:Ljava/util/ArrayList;

    const/4 v3, 0x0

    invoke-direct {v1, v3, v0}, Llg3/e;-><init>(ZLjava/util/ArrayList;)V

    new-instance v0, Llg3/b;

    sget-object v3, Llg3/t;->a:Llg3/t;

    sget-object v4, Llg3/u;->x:Llg3/u;

    const/4 v5, 0x0

    invoke-direct/range {v0 .. v5}, Llg3/b;-><init>(Llg3/e;Ljava/util/Locale;Llg3/t;Llg3/u;Lkg3/d;)V

    return-object v0
.end method

.method public final l(Llg3/u;)Llg3/b;
    .locals 8

    invoke-virtual {p0}, Llg3/o;->k()Llg3/b;

    move-result-object v0

    iget-object v1, v0, Llg3/b;->d:Llg3/u;

    if-nez v1, :cond_0

    const/4 v1, 0x0

    goto :goto_0

    :cond_0
    invoke-virtual {v1, p1}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    move-result v1

    :goto_0
    if-eqz v1, :cond_1

    return-object v0

    :cond_1
    new-instance v2, Llg3/b;

    iget-object v3, v0, Llg3/b;->a:Llg3/e;

    iget-object v4, v0, Llg3/b;->b:Ljava/util/Locale;

    iget-object v5, v0, Llg3/b;->c:Llg3/t;

    iget-object v7, v0, Llg3/b;->e:Lkg3/d;

    move-object v6, p1

    invoke-direct/range {v2 .. v7}, Llg3/b;-><init>(Llg3/e;Ljava/util/Locale;Llg3/t;Llg3/u;Lkg3/d;)V

    return-object v2
.end method
