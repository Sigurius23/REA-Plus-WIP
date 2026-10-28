.class public Lm4/e;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field public A:F

.field public B:I

.field public C:F

.field public final D:[I

.field public E:F

.field public F:Z

.field public G:Z

.field public H:I

.field public I:I

.field public final J:Lm4/d;

.field public final K:Lm4/d;

.field public final L:Lm4/d;

.field public final M:Lm4/d;

.field public final N:Lm4/d;

.field public final O:Lm4/d;

.field public final P:Lm4/d;

.field public final Q:Lm4/d;

.field public final R:[Lm4/d;

.field public final S:Ljava/util/ArrayList;

.field public final T:[Z

.field public U:Lm4/f;

.field public V:I

.field public W:I

.field public X:F

.field public Y:I

.field public Z:I

.field public a:Z

.field public a0:I

.field public b:Ln4/d;

.field public b0:I

.field public c:Ln4/d;

.field public c0:I

.field public d:Ln4/l;

.field public d0:I

.field public e:Ln4/n;

.field public e0:F

.field public final f:[Z

.field public f0:F

.field public g:Z

.field public g0:Ljava/lang/Object;

.field public h:I

.field public h0:I

.field public i:I

.field public i0:Ljava/lang/String;

.field public final j:Lj4/k;

.field public j0:I

.field public k:Ljava/lang/String;

.field public k0:I

.field public l:Z

.field public final l0:[F

.field public m:Z

.field public final m0:[Lm4/e;

.field public n:Z

.field public final n0:[Lm4/e;

.field public o:Z

.field public o0:I

.field public p:I

.field public p0:I

.field public q:I

.field public final q0:[I

.field public r:I

.field public s:I

.field public t:I

.field public final u:[I

.field public v:I

.field public w:I

.field public x:F

.field public y:I

.field public z:I


# direct methods
.method public constructor <init>()V
    .locals 12

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    const/4 v0, 0x0

    .line 2
    iput-boolean v0, p0, Lm4/e;->a:Z

    const/4 v1, 0x0

    .line 3
    iput-object v1, p0, Lm4/e;->d:Ln4/l;

    .line 4
    iput-object v1, p0, Lm4/e;->e:Ln4/n;

    const/4 v2, 0x2

    .line 5
    new-array v3, v2, [Z

    fill-array-data v3, :array_0

    iput-object v3, p0, Lm4/e;->f:[Z

    const/4 v3, 0x1

    .line 6
    iput-boolean v3, p0, Lm4/e;->g:Z

    const/4 v4, -0x1

    .line 7
    iput v4, p0, Lm4/e;->h:I

    .line 8
    iput v4, p0, Lm4/e;->i:I

    .line 9
    new-instance v5, Lj4/k;

    invoke-direct {v5, p0}, Lj4/k;-><init>(Lm4/e;)V

    iput-object v5, p0, Lm4/e;->j:Lj4/k;

    .line 10
    iput-boolean v0, p0, Lm4/e;->l:Z

    .line 11
    iput-boolean v0, p0, Lm4/e;->m:Z

    .line 12
    iput-boolean v0, p0, Lm4/e;->n:Z

    .line 13
    iput-boolean v0, p0, Lm4/e;->o:Z

    .line 14
    iput v4, p0, Lm4/e;->p:I

    .line 15
    iput v4, p0, Lm4/e;->q:I

    .line 16
    iput v0, p0, Lm4/e;->r:I

    .line 17
    iput v0, p0, Lm4/e;->s:I

    .line 18
    iput v0, p0, Lm4/e;->t:I

    .line 19
    new-array v5, v2, [I

    iput-object v5, p0, Lm4/e;->u:[I

    .line 20
    iput v0, p0, Lm4/e;->v:I

    .line 21
    iput v0, p0, Lm4/e;->w:I

    const/high16 v5, 0x3f800000    # 1.0f

    .line 22
    iput v5, p0, Lm4/e;->x:F

    .line 23
    iput v0, p0, Lm4/e;->y:I

    .line 24
    iput v0, p0, Lm4/e;->z:I

    .line 25
    iput v5, p0, Lm4/e;->A:F

    .line 26
    iput v4, p0, Lm4/e;->B:I

    .line 27
    iput v5, p0, Lm4/e;->C:F

    const v5, 0x7fffffff

    .line 28
    filled-new-array {v5, v5}, [I

    move-result-object v5

    iput-object v5, p0, Lm4/e;->D:[I

    const/high16 v5, 0x7fc00000    # Float.NaN

    .line 29
    iput v5, p0, Lm4/e;->E:F

    .line 30
    iput-boolean v0, p0, Lm4/e;->F:Z

    .line 31
    iput-boolean v0, p0, Lm4/e;->G:Z

    .line 32
    iput v0, p0, Lm4/e;->H:I

    .line 33
    iput v0, p0, Lm4/e;->I:I

    .line 34
    new-instance v6, Lm4/d;

    invoke-direct {v6, p0, v2}, Lm4/d;-><init>(Lm4/e;I)V

    iput-object v6, p0, Lm4/e;->J:Lm4/d;

    .line 35
    new-instance v8, Lm4/d;

    const/4 v5, 0x3

    invoke-direct {v8, p0, v5}, Lm4/d;-><init>(Lm4/e;I)V

    iput-object v8, p0, Lm4/e;->K:Lm4/d;

    .line 36
    new-instance v7, Lm4/d;

    const/4 v5, 0x4

    invoke-direct {v7, p0, v5}, Lm4/d;-><init>(Lm4/e;I)V

    iput-object v7, p0, Lm4/e;->L:Lm4/d;

    .line 37
    new-instance v9, Lm4/d;

    const/4 v5, 0x5

    invoke-direct {v9, p0, v5}, Lm4/d;-><init>(Lm4/e;I)V

    iput-object v9, p0, Lm4/e;->M:Lm4/d;

    .line 38
    new-instance v10, Lm4/d;

    const/4 v5, 0x6

    invoke-direct {v10, p0, v5}, Lm4/d;-><init>(Lm4/e;I)V

    iput-object v10, p0, Lm4/e;->N:Lm4/d;

    .line 39
    new-instance v5, Lm4/d;

    const/16 v11, 0x8

    invoke-direct {v5, p0, v11}, Lm4/d;-><init>(Lm4/e;I)V

    iput-object v5, p0, Lm4/e;->O:Lm4/d;

    .line 40
    new-instance v5, Lm4/d;

    const/16 v11, 0x9

    invoke-direct {v5, p0, v11}, Lm4/d;-><init>(Lm4/e;I)V

    iput-object v5, p0, Lm4/e;->P:Lm4/d;

    .line 41
    new-instance v11, Lm4/d;

    const/4 v5, 0x7

    invoke-direct {v11, p0, v5}, Lm4/d;-><init>(Lm4/e;I)V

    iput-object v11, p0, Lm4/e;->Q:Lm4/d;

    .line 42
    filled-new-array/range {v6 .. v11}, [Lm4/d;

    move-result-object v5

    iput-object v5, p0, Lm4/e;->R:[Lm4/d;

    .line 43
    new-instance v5, Ljava/util/ArrayList;

    invoke-direct {v5}, Ljava/util/ArrayList;-><init>()V

    iput-object v5, p0, Lm4/e;->S:Ljava/util/ArrayList;

    .line 44
    new-array v5, v2, [Z

    iput-object v5, p0, Lm4/e;->T:[Z

    .line 45
    filled-new-array {v3, v3}, [I

    move-result-object v3

    iput-object v3, p0, Lm4/e;->q0:[I

    .line 46
    iput-object v1, p0, Lm4/e;->U:Lm4/f;

    .line 47
    iput v0, p0, Lm4/e;->V:I

    .line 48
    iput v0, p0, Lm4/e;->W:I

    const/4 v3, 0x0

    .line 49
    iput v3, p0, Lm4/e;->X:F

    .line 50
    iput v4, p0, Lm4/e;->Y:I

    .line 51
    iput v0, p0, Lm4/e;->Z:I

    .line 52
    iput v0, p0, Lm4/e;->a0:I

    .line 53
    iput v0, p0, Lm4/e;->b0:I

    const/high16 v3, 0x3f000000    # 0.5f

    .line 54
    iput v3, p0, Lm4/e;->e0:F

    .line 55
    iput v3, p0, Lm4/e;->f0:F

    .line 56
    iput v0, p0, Lm4/e;->h0:I

    .line 57
    iput-object v1, p0, Lm4/e;->i0:Ljava/lang/String;

    .line 58
    iput v0, p0, Lm4/e;->j0:I

    .line 59
    iput v0, p0, Lm4/e;->k0:I

    .line 60
    new-array v0, v2, [F

    fill-array-data v0, :array_1

    iput-object v0, p0, Lm4/e;->l0:[F

    .line 61
    filled-new-array {v1, v1}, [Lm4/e;

    move-result-object v0

    iput-object v0, p0, Lm4/e;->m0:[Lm4/e;

    .line 62
    filled-new-array {v1, v1}, [Lm4/e;

    move-result-object v0

    iput-object v0, p0, Lm4/e;->n0:[Lm4/e;

    .line 63
    iput v4, p0, Lm4/e;->o0:I

    .line 64
    iput v4, p0, Lm4/e;->p0:I

    .line 65
    invoke-virtual {p0}, Lm4/e;->a()V

    return-void

    nop

    :array_0
    .array-data 1
        0x1t
        0x1t
    .end array-data

    nop

    :array_1
    .array-data 4
        -0x40800000    # -1.0f
        -0x40800000    # -1.0f
    .end array-data
.end method

.method public constructor <init>(II)V
    .locals 12

    .line 66
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    const/4 v0, 0x0

    .line 67
    iput-boolean v0, p0, Lm4/e;->a:Z

    const/4 v1, 0x0

    .line 68
    iput-object v1, p0, Lm4/e;->d:Ln4/l;

    .line 69
    iput-object v1, p0, Lm4/e;->e:Ln4/n;

    const/4 v2, 0x2

    .line 70
    new-array v3, v2, [Z

    fill-array-data v3, :array_0

    iput-object v3, p0, Lm4/e;->f:[Z

    const/4 v3, 0x1

    .line 71
    iput-boolean v3, p0, Lm4/e;->g:Z

    const/4 v4, -0x1

    .line 72
    iput v4, p0, Lm4/e;->h:I

    .line 73
    iput v4, p0, Lm4/e;->i:I

    .line 74
    new-instance v5, Lj4/k;

    invoke-direct {v5, p0}, Lj4/k;-><init>(Lm4/e;)V

    iput-object v5, p0, Lm4/e;->j:Lj4/k;

    .line 75
    iput-boolean v0, p0, Lm4/e;->l:Z

    .line 76
    iput-boolean v0, p0, Lm4/e;->m:Z

    .line 77
    iput-boolean v0, p0, Lm4/e;->n:Z

    .line 78
    iput-boolean v0, p0, Lm4/e;->o:Z

    .line 79
    iput v4, p0, Lm4/e;->p:I

    .line 80
    iput v4, p0, Lm4/e;->q:I

    .line 81
    iput v0, p0, Lm4/e;->r:I

    .line 82
    iput v0, p0, Lm4/e;->s:I

    .line 83
    iput v0, p0, Lm4/e;->t:I

    .line 84
    new-array v5, v2, [I

    iput-object v5, p0, Lm4/e;->u:[I

    .line 85
    iput v0, p0, Lm4/e;->v:I

    .line 86
    iput v0, p0, Lm4/e;->w:I

    const/high16 v5, 0x3f800000    # 1.0f

    .line 87
    iput v5, p0, Lm4/e;->x:F

    .line 88
    iput v0, p0, Lm4/e;->y:I

    .line 89
    iput v0, p0, Lm4/e;->z:I

    .line 90
    iput v5, p0, Lm4/e;->A:F

    .line 91
    iput v4, p0, Lm4/e;->B:I

    .line 92
    iput v5, p0, Lm4/e;->C:F

    const v5, 0x7fffffff

    .line 93
    filled-new-array {v5, v5}, [I

    move-result-object v5

    iput-object v5, p0, Lm4/e;->D:[I

    const/high16 v5, 0x7fc00000    # Float.NaN

    .line 94
    iput v5, p0, Lm4/e;->E:F

    .line 95
    iput-boolean v0, p0, Lm4/e;->F:Z

    .line 96
    iput-boolean v0, p0, Lm4/e;->G:Z

    .line 97
    iput v0, p0, Lm4/e;->H:I

    .line 98
    iput v0, p0, Lm4/e;->I:I

    .line 99
    new-instance v6, Lm4/d;

    invoke-direct {v6, p0, v2}, Lm4/d;-><init>(Lm4/e;I)V

    iput-object v6, p0, Lm4/e;->J:Lm4/d;

    .line 100
    new-instance v8, Lm4/d;

    const/4 v5, 0x3

    invoke-direct {v8, p0, v5}, Lm4/d;-><init>(Lm4/e;I)V

    iput-object v8, p0, Lm4/e;->K:Lm4/d;

    .line 101
    new-instance v7, Lm4/d;

    const/4 v5, 0x4

    invoke-direct {v7, p0, v5}, Lm4/d;-><init>(Lm4/e;I)V

    iput-object v7, p0, Lm4/e;->L:Lm4/d;

    .line 102
    new-instance v9, Lm4/d;

    const/4 v5, 0x5

    invoke-direct {v9, p0, v5}, Lm4/d;-><init>(Lm4/e;I)V

    iput-object v9, p0, Lm4/e;->M:Lm4/d;

    .line 103
    new-instance v10, Lm4/d;

    const/4 v5, 0x6

    invoke-direct {v10, p0, v5}, Lm4/d;-><init>(Lm4/e;I)V

    iput-object v10, p0, Lm4/e;->N:Lm4/d;

    .line 104
    new-instance v5, Lm4/d;

    const/16 v11, 0x8

    invoke-direct {v5, p0, v11}, Lm4/d;-><init>(Lm4/e;I)V

    iput-object v5, p0, Lm4/e;->O:Lm4/d;

    .line 105
    new-instance v5, Lm4/d;

    const/16 v11, 0x9

    invoke-direct {v5, p0, v11}, Lm4/d;-><init>(Lm4/e;I)V

    iput-object v5, p0, Lm4/e;->P:Lm4/d;

    .line 106
    new-instance v11, Lm4/d;

    const/4 v5, 0x7

    invoke-direct {v11, p0, v5}, Lm4/d;-><init>(Lm4/e;I)V

    iput-object v11, p0, Lm4/e;->Q:Lm4/d;

    .line 107
    filled-new-array/range {v6 .. v11}, [Lm4/d;

    move-result-object v5

    iput-object v5, p0, Lm4/e;->R:[Lm4/d;

    .line 108
    new-instance v5, Ljava/util/ArrayList;

    invoke-direct {v5}, Ljava/util/ArrayList;-><init>()V

    iput-object v5, p0, Lm4/e;->S:Ljava/util/ArrayList;

    .line 109
    new-array v5, v2, [Z

    iput-object v5, p0, Lm4/e;->T:[Z

    .line 110
    filled-new-array {v3, v3}, [I

    move-result-object v3

    iput-object v3, p0, Lm4/e;->q0:[I

    .line 111
    iput-object v1, p0, Lm4/e;->U:Lm4/f;

    const/4 v3, 0x0

    .line 112
    iput v3, p0, Lm4/e;->X:F

    .line 113
    iput v4, p0, Lm4/e;->Y:I

    .line 114
    iput v0, p0, Lm4/e;->b0:I

    const/high16 v3, 0x3f000000    # 0.5f

    .line 115
    iput v3, p0, Lm4/e;->e0:F

    .line 116
    iput v3, p0, Lm4/e;->f0:F

    .line 117
    iput v0, p0, Lm4/e;->h0:I

    .line 118
    iput-object v1, p0, Lm4/e;->i0:Ljava/lang/String;

    .line 119
    iput v0, p0, Lm4/e;->j0:I

    .line 120
    iput v0, p0, Lm4/e;->k0:I

    .line 121
    new-array v2, v2, [F

    fill-array-data v2, :array_1

    iput-object v2, p0, Lm4/e;->l0:[F

    .line 122
    filled-new-array {v1, v1}, [Lm4/e;

    move-result-object v2

    iput-object v2, p0, Lm4/e;->m0:[Lm4/e;

    .line 123
    filled-new-array {v1, v1}, [Lm4/e;

    move-result-object v1

    iput-object v1, p0, Lm4/e;->n0:[Lm4/e;

    .line 124
    iput v4, p0, Lm4/e;->o0:I

    .line 125
    iput v4, p0, Lm4/e;->p0:I

    .line 126
    iput v0, p0, Lm4/e;->Z:I

    .line 127
    iput v0, p0, Lm4/e;->a0:I

    .line 128
    iput p1, p0, Lm4/e;->V:I

    .line 129
    iput p2, p0, Lm4/e;->W:I

    .line 130
    invoke-virtual {p0}, Lm4/e;->a()V

    return-void

    nop

    :array_0
    .array-data 1
        0x1t
        0x1t
    .end array-data

    nop

    :array_1
    .array-data 4
        -0x40800000    # -1.0f
        -0x40800000    # -1.0f
    .end array-data
.end method

.method public static H(IILjava/lang/String;Ljava/lang/StringBuilder;)V
    .locals 1

    if-ne p0, p1, :cond_0

    return-void

    :cond_0
    const-string p1, " :   "

    const-string v0, ",\n"

    invoke-static {p0, p2, p1, v0, p3}, Ld;->x(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/StringBuilder;)V

    return-void
.end method

.method public static I(Ljava/lang/StringBuilder;Ljava/lang/String;FF)V
    .locals 0

    cmpl-float p3, p2, p3

    if-nez p3, :cond_0

    return-void

    :cond_0
    invoke-virtual {p0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string p1, " :   "

    invoke-virtual {p0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p0, p2}, Ljava/lang/StringBuilder;->append(F)Ljava/lang/StringBuilder;

    const-string p1, ",\n"

    invoke-virtual {p0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    return-void
.end method

.method public static p(Ljava/lang/StringBuilder;Ljava/lang/String;IIIIIFI)V
    .locals 2

    invoke-virtual {p0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string p1, " :  {\n"

    invoke-virtual {p0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-static {p8}, Ljh3/c;->z(I)Ljava/lang/String;

    move-result-object p1

    const-string p8, "FIXED"

    invoke-virtual {p8, p1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p8

    if-eqz p8, :cond_0

    goto :goto_0

    :cond_0
    const-string p8, " :   "

    const-string v0, ",\n"

    const-string v1, "      behavior"

    invoke-static {p0, v1, p8, p1, v0}, Ld;->B(Ljava/lang/StringBuilder;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    :goto_0
    const-string p1, "      size"

    const/4 p8, 0x0

    invoke-static {p2, p8, p1, p0}, Lm4/e;->H(IILjava/lang/String;Ljava/lang/StringBuilder;)V

    const-string p1, "      min"

    invoke-static {p3, p8, p1, p0}, Lm4/e;->H(IILjava/lang/String;Ljava/lang/StringBuilder;)V

    const-string p1, "      max"

    const p2, 0x7fffffff

    invoke-static {p4, p2, p1, p0}, Lm4/e;->H(IILjava/lang/String;Ljava/lang/StringBuilder;)V

    const-string p1, "      matchMin"

    invoke-static {p5, p8, p1, p0}, Lm4/e;->H(IILjava/lang/String;Ljava/lang/StringBuilder;)V

    const-string p1, "      matchDef"

    invoke-static {p6, p8, p1, p0}, Lm4/e;->H(IILjava/lang/String;Ljava/lang/StringBuilder;)V

    const-string p1, "      matchPercent"

    const/high16 p2, 0x3f800000    # 1.0f

    invoke-static {p0, p1, p7, p2}, Lm4/e;->I(Ljava/lang/StringBuilder;Ljava/lang/String;FF)V

    const-string p1, "    },\n"

    invoke-virtual {p0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    return-void
.end method

.method public static q(Ljava/lang/StringBuilder;Ljava/lang/String;Lm4/d;)V
    .locals 2

    iget-object v0, p2, Lm4/d;->f:Lm4/d;

    if-nez v0, :cond_0

    return-void

    :cond_0
    const-string v0, "    "

    invoke-virtual {p0, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string p1, " : [ \'"

    invoke-virtual {p0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object p1, p2, Lm4/d;->f:Lm4/d;

    invoke-virtual {p0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string p1, "\'"

    invoke-virtual {p0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget p1, p2, Lm4/d;->h:I

    const/high16 v0, -0x80000000

    if-ne p1, v0, :cond_1

    iget p1, p2, Lm4/d;->g:I

    if-eqz p1, :cond_2

    :cond_1
    const-string p1, ","

    invoke-virtual {p0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget v1, p2, Lm4/d;->g:I

    invoke-virtual {p0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    iget v1, p2, Lm4/d;->h:I

    if-eq v1, v0, :cond_2

    invoke-virtual {p0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget p2, p2, Lm4/d;->h:I

    invoke-virtual {p0, p2}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {p0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    :cond_2
    const-string p1, " ] ,\n"

    invoke-virtual {p0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    return-void
.end method


# virtual methods
.method public final A()Z
    .locals 2

    iget-boolean v0, p0, Lm4/e;->g:Z

    if-eqz v0, :cond_0

    iget v0, p0, Lm4/e;->h0:I

    const/16 v1, 0x8

    if-eq v0, v1, :cond_0

    const/4 v0, 0x1

    return v0

    :cond_0
    const/4 v0, 0x0

    return v0
.end method

.method public B()Z
    .locals 1

    iget-boolean v0, p0, Lm4/e;->l:Z

    if-nez v0, :cond_1

    iget-object v0, p0, Lm4/e;->J:Lm4/d;

    iget-boolean v0, v0, Lm4/d;->c:Z

    if-eqz v0, :cond_0

    iget-object v0, p0, Lm4/e;->L:Lm4/d;

    iget-boolean v0, v0, Lm4/d;->c:Z

    if-eqz v0, :cond_0

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    return v0

    :cond_1
    :goto_0
    const/4 v0, 0x1

    return v0
.end method

.method public C()Z
    .locals 1

    iget-boolean v0, p0, Lm4/e;->m:Z

    if-nez v0, :cond_1

    iget-object v0, p0, Lm4/e;->K:Lm4/d;

    iget-boolean v0, v0, Lm4/d;->c:Z

    if-eqz v0, :cond_0

    iget-object v0, p0, Lm4/e;->M:Lm4/d;

    iget-boolean v0, v0, Lm4/d;->c:Z

    if-eqz v0, :cond_0

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    return v0

    :cond_1
    :goto_0
    const/4 v0, 0x1

    return v0
.end method

.method public D()V
    .locals 5

    iget-object v0, p0, Lm4/e;->J:Lm4/d;

    invoke-virtual {v0}, Lm4/d;->j()V

    iget-object v0, p0, Lm4/e;->K:Lm4/d;

    invoke-virtual {v0}, Lm4/d;->j()V

    iget-object v0, p0, Lm4/e;->L:Lm4/d;

    invoke-virtual {v0}, Lm4/d;->j()V

    iget-object v0, p0, Lm4/e;->M:Lm4/d;

    invoke-virtual {v0}, Lm4/d;->j()V

    iget-object v0, p0, Lm4/e;->N:Lm4/d;

    invoke-virtual {v0}, Lm4/d;->j()V

    iget-object v0, p0, Lm4/e;->O:Lm4/d;

    invoke-virtual {v0}, Lm4/d;->j()V

    iget-object v0, p0, Lm4/e;->P:Lm4/d;

    invoke-virtual {v0}, Lm4/d;->j()V

    iget-object v0, p0, Lm4/e;->Q:Lm4/d;

    invoke-virtual {v0}, Lm4/d;->j()V

    const/4 v0, 0x0

    iput-object v0, p0, Lm4/e;->U:Lm4/f;

    const/high16 v1, 0x7fc00000    # Float.NaN

    iput v1, p0, Lm4/e;->E:F

    const/4 v1, 0x0

    iput v1, p0, Lm4/e;->V:I

    iput v1, p0, Lm4/e;->W:I

    const/4 v2, 0x0

    iput v2, p0, Lm4/e;->X:F

    const/4 v2, -0x1

    iput v2, p0, Lm4/e;->Y:I

    iput v1, p0, Lm4/e;->Z:I

    iput v1, p0, Lm4/e;->a0:I

    iput v1, p0, Lm4/e;->b0:I

    iput v1, p0, Lm4/e;->c0:I

    iput v1, p0, Lm4/e;->d0:I

    const/high16 v3, 0x3f000000    # 0.5f

    iput v3, p0, Lm4/e;->e0:F

    iput v3, p0, Lm4/e;->f0:F

    iget-object v3, p0, Lm4/e;->q0:[I

    const/4 v4, 0x1

    aput v4, v3, v1

    aput v4, v3, v4

    iput-object v0, p0, Lm4/e;->g0:Ljava/lang/Object;

    iput v1, p0, Lm4/e;->h0:I

    iput v1, p0, Lm4/e;->j0:I

    iput v1, p0, Lm4/e;->k0:I

    iget-object v0, p0, Lm4/e;->l0:[F

    const/high16 v3, -0x40800000    # -1.0f

    aput v3, v0, v1

    aput v3, v0, v4

    iput v2, p0, Lm4/e;->p:I

    iput v2, p0, Lm4/e;->q:I

    iget-object v0, p0, Lm4/e;->D:[I

    const v3, 0x7fffffff

    aput v3, v0, v1

    aput v3, v0, v4

    iput v1, p0, Lm4/e;->s:I

    iput v1, p0, Lm4/e;->t:I

    const/high16 v0, 0x3f800000    # 1.0f

    iput v0, p0, Lm4/e;->x:F

    iput v0, p0, Lm4/e;->A:F

    iput v3, p0, Lm4/e;->w:I

    iput v3, p0, Lm4/e;->z:I

    iput v1, p0, Lm4/e;->v:I

    iput v1, p0, Lm4/e;->y:I

    iput v2, p0, Lm4/e;->B:I

    iput v0, p0, Lm4/e;->C:F

    iget-object v0, p0, Lm4/e;->f:[Z

    aput-boolean v4, v0, v1

    aput-boolean v4, v0, v4

    iput-boolean v1, p0, Lm4/e;->G:Z

    iget-object v0, p0, Lm4/e;->T:[Z

    aput-boolean v1, v0, v1

    aput-boolean v1, v0, v4

    iput-boolean v4, p0, Lm4/e;->g:Z

    iget-object v0, p0, Lm4/e;->u:[I

    aput v1, v0, v1

    aput v1, v0, v4

    iput v2, p0, Lm4/e;->h:I

    iput v2, p0, Lm4/e;->i:I

    return-void
.end method

.method public final E()V
    .locals 4

    iget-object v0, p0, Lm4/e;->S:Ljava/util/ArrayList;

    invoke-virtual {v0}, Ljava/util/ArrayList;->size()I

    move-result v1

    const/4 v2, 0x0

    :goto_0
    if-ge v2, v1, :cond_0

    invoke-virtual {v0, v2}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Lm4/d;

    invoke-virtual {v3}, Lm4/d;->j()V

    add-int/lit8 v2, v2, 0x1

    goto :goto_0

    :cond_0
    return-void
.end method

.method public final F()V
    .locals 5

    const/4 v0, 0x0

    iput-boolean v0, p0, Lm4/e;->l:Z

    iput-boolean v0, p0, Lm4/e;->m:Z

    iput-boolean v0, p0, Lm4/e;->n:Z

    iput-boolean v0, p0, Lm4/e;->o:Z

    iget-object v1, p0, Lm4/e;->S:Ljava/util/ArrayList;

    invoke-virtual {v1}, Ljava/util/ArrayList;->size()I

    move-result v2

    move v3, v0

    :goto_0
    if-ge v3, v2, :cond_0

    invoke-virtual {v1, v3}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Lm4/d;

    iput-boolean v0, v4, Lm4/d;->c:Z

    iput v0, v4, Lm4/d;->b:I

    add-int/lit8 v3, v3, 0x1

    goto :goto_0

    :cond_0
    return-void
.end method

.method public G(La3/p;)V
    .locals 0

    iget-object p1, p0, Lm4/e;->J:Lm4/d;

    invoke-virtual {p1}, Lm4/d;->k()V

    iget-object p1, p0, Lm4/e;->K:Lm4/d;

    invoke-virtual {p1}, Lm4/d;->k()V

    iget-object p1, p0, Lm4/e;->L:Lm4/d;

    invoke-virtual {p1}, Lm4/d;->k()V

    iget-object p1, p0, Lm4/e;->M:Lm4/d;

    invoke-virtual {p1}, Lm4/d;->k()V

    iget-object p1, p0, Lm4/e;->N:Lm4/d;

    invoke-virtual {p1}, Lm4/d;->k()V

    iget-object p1, p0, Lm4/e;->Q:Lm4/d;

    invoke-virtual {p1}, Lm4/d;->k()V

    iget-object p1, p0, Lm4/e;->O:Lm4/d;

    invoke-virtual {p1}, Lm4/d;->k()V

    iget-object p1, p0, Lm4/e;->P:Lm4/d;

    invoke-virtual {p1}, Lm4/d;->k()V

    return-void
.end method

.method public final J(I)V
    .locals 0

    iput p1, p0, Lm4/e;->b0:I

    if-lez p1, :cond_0

    const/4 p1, 0x1

    goto :goto_0

    :cond_0
    const/4 p1, 0x0

    :goto_0
    iput-boolean p1, p0, Lm4/e;->F:Z

    return-void
.end method

.method public final K(Ljava/lang/String;)V
    .locals 8

    const/4 v0, 0x0

    if-eqz p1, :cond_8

    invoke-virtual {p1}, Ljava/lang/String;->length()I

    move-result v1

    if-nez v1, :cond_0

    goto/16 :goto_2

    :cond_0
    invoke-virtual {p1}, Ljava/lang/String;->length()I

    move-result v1

    const/16 v2, 0x2c

    invoke-virtual {p1, v2}, Ljava/lang/String;->indexOf(I)I

    move-result v2

    const/4 v3, 0x0

    const/4 v4, 0x1

    const/4 v5, -0x1

    if-lez v2, :cond_3

    add-int/lit8 v6, v1, -0x1

    if-ge v2, v6, :cond_3

    invoke-virtual {p1, v3, v2}, Ljava/lang/String;->substring(II)Ljava/lang/String;

    move-result-object v6

    const-string v7, "W"

    invoke-virtual {v6, v7}, Ljava/lang/String;->equalsIgnoreCase(Ljava/lang/String;)Z

    move-result v7

    if-eqz v7, :cond_1

    goto :goto_0

    :cond_1
    const-string v3, "H"

    invoke-virtual {v6, v3}, Ljava/lang/String;->equalsIgnoreCase(Ljava/lang/String;)Z

    move-result v3

    if-eqz v3, :cond_2

    move v3, v4

    goto :goto_0

    :cond_2
    move v3, v5

    :goto_0
    add-int/2addr v2, v4

    move v5, v3

    move v3, v2

    :cond_3
    const/16 v2, 0x3a

    invoke-virtual {p1, v2}, Ljava/lang/String;->indexOf(I)I

    move-result v2

    if-ltz v2, :cond_5

    sub-int/2addr v1, v4

    if-ge v2, v1, :cond_5

    invoke-virtual {p1, v3, v2}, Ljava/lang/String;->substring(II)Ljava/lang/String;

    move-result-object v1

    add-int/2addr v2, v4

    invoke-virtual {p1, v2}, Ljava/lang/String;->substring(I)Ljava/lang/String;

    move-result-object p1

    invoke-virtual {v1}, Ljava/lang/String;->length()I

    move-result v2

    if-lez v2, :cond_6

    invoke-virtual {p1}, Ljava/lang/String;->length()I

    move-result v2

    if-lez v2, :cond_6

    :try_start_0
    invoke-static {v1}, Ljava/lang/Float;->parseFloat(Ljava/lang/String;)F

    move-result v1

    invoke-static {p1}, Ljava/lang/Float;->parseFloat(Ljava/lang/String;)F

    move-result p1

    cmpl-float v2, v1, v0

    if-lez v2, :cond_6

    cmpl-float v2, p1, v0

    if-lez v2, :cond_6

    if-ne v5, v4, :cond_4

    div-float/2addr p1, v1

    invoke-static {p1}, Ljava/lang/Math;->abs(F)F

    move-result p1

    goto :goto_1

    :cond_4
    div-float/2addr v1, p1

    invoke-static {v1}, Ljava/lang/Math;->abs(F)F

    move-result p1
    :try_end_0
    .catch Ljava/lang/NumberFormatException; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_1

    :cond_5
    invoke-virtual {p1, v3}, Ljava/lang/String;->substring(I)Ljava/lang/String;

    move-result-object p1

    invoke-virtual {p1}, Ljava/lang/String;->length()I

    move-result v1

    if-lez v1, :cond_6

    :try_start_1
    invoke-static {p1}, Ljava/lang/Float;->parseFloat(Ljava/lang/String;)F

    move-result p1
    :try_end_1
    .catch Ljava/lang/NumberFormatException; {:try_start_1 .. :try_end_1} :catch_0

    goto :goto_1

    :catch_0
    :cond_6
    move p1, v0

    :goto_1
    cmpl-float v0, p1, v0

    if-lez v0, :cond_7

    iput p1, p0, Lm4/e;->X:F

    iput v5, p0, Lm4/e;->Y:I

    :cond_7
    return-void

    :cond_8
    :goto_2
    iput v0, p0, Lm4/e;->X:F

    return-void
.end method

.method public final L(II)V
    .locals 1

    iget-boolean v0, p0, Lm4/e;->l:Z

    if-eqz v0, :cond_0

    return-void

    :cond_0
    iget-object v0, p0, Lm4/e;->J:Lm4/d;

    invoke-virtual {v0, p1}, Lm4/d;->l(I)V

    iget-object v0, p0, Lm4/e;->L:Lm4/d;

    invoke-virtual {v0, p2}, Lm4/d;->l(I)V

    iput p1, p0, Lm4/e;->Z:I

    sub-int/2addr p2, p1

    iput p2, p0, Lm4/e;->V:I

    const/4 p1, 0x1

    iput-boolean p1, p0, Lm4/e;->l:Z

    return-void
.end method

.method public final M(II)V
    .locals 1

    iget-boolean v0, p0, Lm4/e;->m:Z

    if-eqz v0, :cond_0

    return-void

    :cond_0
    iget-object v0, p0, Lm4/e;->K:Lm4/d;

    invoke-virtual {v0, p1}, Lm4/d;->l(I)V

    iget-object v0, p0, Lm4/e;->M:Lm4/d;

    invoke-virtual {v0, p2}, Lm4/d;->l(I)V

    iput p1, p0, Lm4/e;->a0:I

    sub-int/2addr p2, p1

    iput p2, p0, Lm4/e;->W:I

    iget-boolean p2, p0, Lm4/e;->F:Z

    if-eqz p2, :cond_1

    iget p2, p0, Lm4/e;->b0:I

    add-int/2addr p1, p2

    iget-object p2, p0, Lm4/e;->N:Lm4/d;

    invoke-virtual {p2, p1}, Lm4/d;->l(I)V

    :cond_1
    const/4 p1, 0x1

    iput-boolean p1, p0, Lm4/e;->m:Z

    return-void
.end method

.method public final N(I)V
    .locals 1

    iput p1, p0, Lm4/e;->W:I

    iget v0, p0, Lm4/e;->d0:I

    if-ge p1, v0, :cond_0

    iput v0, p0, Lm4/e;->W:I

    :cond_0
    return-void
.end method

.method public final O(I)V
    .locals 2

    iget-object v0, p0, Lm4/e;->q0:[I

    const/4 v1, 0x0

    aput p1, v0, v1

    return-void
.end method

.method public final P(FIII)V
    .locals 0

    iput p2, p0, Lm4/e;->s:I

    iput p3, p0, Lm4/e;->v:I

    const p3, 0x7fffffff

    if-ne p4, p3, :cond_0

    const/4 p4, 0x0

    :cond_0
    iput p4, p0, Lm4/e;->w:I

    iput p1, p0, Lm4/e;->x:F

    const/4 p3, 0x0

    cmpl-float p3, p1, p3

    if-lez p3, :cond_1

    const/high16 p3, 0x3f800000    # 1.0f

    cmpg-float p1, p1, p3

    if-gez p1, :cond_1

    if-nez p2, :cond_1

    const/4 p1, 0x2

    iput p1, p0, Lm4/e;->s:I

    :cond_1
    return-void
.end method

.method public final Q(I)V
    .locals 2

    iget-object v0, p0, Lm4/e;->q0:[I

    const/4 v1, 0x1

    aput p1, v0, v1

    return-void
.end method

.method public final R(FIII)V
    .locals 0

    iput p2, p0, Lm4/e;->t:I

    iput p3, p0, Lm4/e;->y:I

    const p3, 0x7fffffff

    if-ne p4, p3, :cond_0

    const/4 p4, 0x0

    :cond_0
    iput p4, p0, Lm4/e;->z:I

    iput p1, p0, Lm4/e;->A:F

    const/4 p3, 0x0

    cmpl-float p3, p1, p3

    if-lez p3, :cond_1

    const/high16 p3, 0x3f800000    # 1.0f

    cmpg-float p1, p1, p3

    if-gez p1, :cond_1

    if-nez p2, :cond_1

    const/4 p1, 0x2

    iput p1, p0, Lm4/e;->t:I

    :cond_1
    return-void
.end method

.method public final S(I)V
    .locals 1

    iput p1, p0, Lm4/e;->V:I

    iget v0, p0, Lm4/e;->c0:I

    if-ge p1, v0, :cond_0

    iput v0, p0, Lm4/e;->V:I

    :cond_0
    return-void
.end method

.method public T(ZZ)V
    .locals 7

    iget-object v0, p0, Lm4/e;->d:Ln4/l;

    iget-boolean v1, v0, Ln4/p;->g:Z

    and-int/2addr p1, v1

    iget-object v1, p0, Lm4/e;->e:Ln4/n;

    iget-boolean v2, v1, Ln4/p;->g:Z

    and-int/2addr p2, v2

    iget-object v2, v0, Ln4/p;->h:Ln4/g;

    iget v2, v2, Ln4/g;->g:I

    iget-object v3, v1, Ln4/p;->h:Ln4/g;

    iget v3, v3, Ln4/g;->g:I

    iget-object v0, v0, Ln4/p;->i:Ln4/g;

    iget v0, v0, Ln4/g;->g:I

    iget-object v1, v1, Ln4/p;->i:Ln4/g;

    iget v1, v1, Ln4/g;->g:I

    sub-int v4, v0, v2

    sub-int v5, v1, v3

    const/4 v6, 0x0

    if-ltz v4, :cond_0

    if-ltz v5, :cond_0

    const/high16 v4, -0x80000000

    if-eq v2, v4, :cond_0

    const v5, 0x7fffffff

    if-eq v2, v5, :cond_0

    if-eq v3, v4, :cond_0

    if-eq v3, v5, :cond_0

    if-eq v0, v4, :cond_0

    if-eq v0, v5, :cond_0

    if-eq v1, v4, :cond_0

    if-ne v1, v5, :cond_1

    :cond_0
    move v0, v6

    move v1, v0

    move v2, v1

    move v3, v2

    :cond_1
    sub-int/2addr v0, v2

    sub-int/2addr v1, v3

    if-eqz p1, :cond_2

    iput v2, p0, Lm4/e;->Z:I

    :cond_2
    if-eqz p2, :cond_3

    iput v3, p0, Lm4/e;->a0:I

    :cond_3
    iget v2, p0, Lm4/e;->h0:I

    const/16 v3, 0x8

    if-ne v2, v3, :cond_4

    iput v6, p0, Lm4/e;->V:I

    iput v6, p0, Lm4/e;->W:I

    return-void

    :cond_4
    const/4 v2, 0x1

    iget-object v3, p0, Lm4/e;->q0:[I

    if-eqz p1, :cond_6

    aget p1, v3, v6

    if-ne p1, v2, :cond_5

    iget p1, p0, Lm4/e;->V:I

    if-ge v0, p1, :cond_5

    move v0, p1

    :cond_5
    iput v0, p0, Lm4/e;->V:I

    iget p1, p0, Lm4/e;->c0:I

    if-ge v0, p1, :cond_6

    iput p1, p0, Lm4/e;->V:I

    :cond_6
    if-eqz p2, :cond_8

    aget p1, v3, v2

    if-ne p1, v2, :cond_7

    iget p1, p0, Lm4/e;->W:I

    if-ge v1, p1, :cond_7

    move v1, p1

    :cond_7
    iput v1, p0, Lm4/e;->W:I

    iget p1, p0, Lm4/e;->d0:I

    if-ge v1, p1, :cond_8

    iput p1, p0, Lm4/e;->W:I

    :cond_8
    return-void
.end method

.method public U(Lf4/c;Z)V
    .locals 6

    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    iget-object p1, p0, Lm4/e;->J:Lm4/d;

    invoke-static {p1}, Lf4/c;->n(Ljava/lang/Object;)I

    move-result p1

    iget-object v0, p0, Lm4/e;->K:Lm4/d;

    invoke-static {v0}, Lf4/c;->n(Ljava/lang/Object;)I

    move-result v0

    iget-object v1, p0, Lm4/e;->L:Lm4/d;

    invoke-static {v1}, Lf4/c;->n(Ljava/lang/Object;)I

    move-result v1

    iget-object v2, p0, Lm4/e;->M:Lm4/d;

    invoke-static {v2}, Lf4/c;->n(Ljava/lang/Object;)I

    move-result v2

    if-eqz p2, :cond_0

    iget-object v3, p0, Lm4/e;->d:Ln4/l;

    if-eqz v3, :cond_0

    iget-object v4, v3, Ln4/p;->h:Ln4/g;

    iget-boolean v5, v4, Ln4/g;->j:Z

    if-eqz v5, :cond_0

    iget-object v3, v3, Ln4/p;->i:Ln4/g;

    iget-boolean v5, v3, Ln4/g;->j:Z

    if-eqz v5, :cond_0

    iget p1, v4, Ln4/g;->g:I

    iget v1, v3, Ln4/g;->g:I

    :cond_0
    if-eqz p2, :cond_1

    iget-object p2, p0, Lm4/e;->e:Ln4/n;

    if-eqz p2, :cond_1

    iget-object v3, p2, Ln4/p;->h:Ln4/g;

    iget-boolean v4, v3, Ln4/g;->j:Z

    if-eqz v4, :cond_1

    iget-object p2, p2, Ln4/p;->i:Ln4/g;

    iget-boolean v4, p2, Ln4/g;->j:Z

    if-eqz v4, :cond_1

    iget v0, v3, Ln4/g;->g:I

    iget v2, p2, Ln4/g;->g:I

    :cond_1
    sub-int p2, v1, p1

    sub-int v3, v2, v0

    const/4 v4, 0x0

    if-ltz p2, :cond_2

    if-ltz v3, :cond_2

    const/high16 p2, -0x80000000

    if-eq p1, p2, :cond_2

    const v3, 0x7fffffff

    if-eq p1, v3, :cond_2

    if-eq v0, p2, :cond_2

    if-eq v0, v3, :cond_2

    if-eq v1, p2, :cond_2

    if-eq v1, v3, :cond_2

    if-eq v2, p2, :cond_2

    if-ne v2, v3, :cond_3

    :cond_2
    move p1, v4

    move v0, p1

    move v1, v0

    move v2, v1

    :cond_3
    sub-int/2addr v1, p1

    sub-int/2addr v2, v0

    iput p1, p0, Lm4/e;->Z:I

    iput v0, p0, Lm4/e;->a0:I

    iget p1, p0, Lm4/e;->h0:I

    const/16 p2, 0x8

    if-ne p1, p2, :cond_4

    iput v4, p0, Lm4/e;->V:I

    iput v4, p0, Lm4/e;->W:I

    return-void

    :cond_4
    iget-object p1, p0, Lm4/e;->q0:[I

    aget p2, p1, v4

    const/4 v0, 0x1

    if-ne p2, v0, :cond_5

    iget v3, p0, Lm4/e;->V:I

    if-ge v1, v3, :cond_5

    move v1, v3

    :cond_5
    aget v3, p1, v0

    if-ne v3, v0, :cond_6

    iget v3, p0, Lm4/e;->W:I

    if-ge v2, v3, :cond_6

    move v2, v3

    :cond_6
    iput v1, p0, Lm4/e;->V:I

    iput v2, p0, Lm4/e;->W:I

    iget v3, p0, Lm4/e;->d0:I

    if-ge v2, v3, :cond_7

    iput v3, p0, Lm4/e;->W:I

    :cond_7
    iget v3, p0, Lm4/e;->c0:I

    if-ge v1, v3, :cond_8

    iput v3, p0, Lm4/e;->V:I

    :cond_8
    iget v3, p0, Lm4/e;->w:I

    const/4 v4, 0x3

    if-lez v3, :cond_9

    if-ne p2, v4, :cond_9

    iget p2, p0, Lm4/e;->V:I

    invoke-static {p2, v3}, Ljava/lang/Math;->min(II)I

    move-result p2

    iput p2, p0, Lm4/e;->V:I

    :cond_9
    iget p2, p0, Lm4/e;->z:I

    if-lez p2, :cond_a

    aget p1, p1, v0

    if-ne p1, v4, :cond_a

    iget p1, p0, Lm4/e;->W:I

    invoke-static {p1, p2}, Ljava/lang/Math;->min(II)I

    move-result p1

    iput p1, p0, Lm4/e;->W:I

    :cond_a
    iget p1, p0, Lm4/e;->V:I

    if-eq v1, p1, :cond_b

    iput p1, p0, Lm4/e;->h:I

    :cond_b
    iget p1, p0, Lm4/e;->W:I

    if-eq v2, p1, :cond_c

    iput p1, p0, Lm4/e;->i:I

    :cond_c
    return-void
.end method

.method public final a()V
    .locals 2

    iget-object v0, p0, Lm4/e;->J:Lm4/d;

    iget-object v1, p0, Lm4/e;->S:Ljava/util/ArrayList;

    invoke-virtual {v1, v0}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    iget-object v0, p0, Lm4/e;->K:Lm4/d;

    invoke-virtual {v1, v0}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    iget-object v0, p0, Lm4/e;->L:Lm4/d;

    invoke-virtual {v1, v0}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    iget-object v0, p0, Lm4/e;->M:Lm4/d;

    invoke-virtual {v1, v0}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    iget-object v0, p0, Lm4/e;->O:Lm4/d;

    invoke-virtual {v1, v0}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    iget-object v0, p0, Lm4/e;->P:Lm4/d;

    invoke-virtual {v1, v0}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    iget-object v0, p0, Lm4/e;->Q:Lm4/d;

    invoke-virtual {v1, v0}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    iget-object v0, p0, Lm4/e;->N:Lm4/d;

    invoke-virtual {v1, v0}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    return-void
.end method

.method public final b(Lm4/f;Lf4/c;Ljava/util/HashSet;IZ)V
    .locals 7

    if-eqz p5, :cond_1

    invoke-virtual {p3, p0}, Ljava/util/HashSet;->contains(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_0

    goto/16 :goto_5

    :cond_0
    invoke-static {p1, p2, p0}, Lm4/k;->b(Lm4/f;Lf4/c;Lm4/e;)V

    invoke-virtual {p3, p0}, Ljava/util/HashSet;->remove(Ljava/lang/Object;)Z

    const/16 v0, 0x40

    invoke-virtual {p1, v0}, Lm4/f;->c0(I)Z

    move-result v0

    invoke-virtual {p0, p2, v0}, Lm4/e;->c(Lf4/c;Z)V

    :cond_1
    if-nez p4, :cond_3

    iget-object v0, p0, Lm4/e;->J:Lm4/d;

    iget-object v0, v0, Lm4/d;->a:Ljava/util/HashSet;

    if-eqz v0, :cond_2

    invoke-virtual {v0}, Ljava/util/HashSet;->iterator()Ljava/util/Iterator;

    move-result-object v6

    :goto_0
    invoke-interface {v6}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_2

    invoke-interface {v6}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lm4/d;

    iget-object v0, v0, Lm4/d;->d:Lm4/e;

    const/4 v5, 0x1

    move-object v1, p1

    move-object v2, p2

    move-object v3, p3

    move v4, p4

    invoke-virtual/range {v0 .. v5}, Lm4/e;->b(Lm4/f;Lf4/c;Ljava/util/HashSet;IZ)V

    goto :goto_0

    :cond_2
    iget-object v0, p0, Lm4/e;->L:Lm4/d;

    iget-object v0, v0, Lm4/d;->a:Ljava/util/HashSet;

    if-eqz v0, :cond_6

    invoke-virtual {v0}, Ljava/util/HashSet;->iterator()Ljava/util/Iterator;

    move-result-object v6

    :goto_1
    invoke-interface {v6}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_6

    invoke-interface {v6}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lm4/d;

    iget-object v0, v0, Lm4/d;->d:Lm4/e;

    const/4 v5, 0x1

    move-object v1, p1

    move-object v2, p2

    move-object v3, p3

    move v4, p4

    invoke-virtual/range {v0 .. v5}, Lm4/e;->b(Lm4/f;Lf4/c;Ljava/util/HashSet;IZ)V

    goto :goto_1

    :cond_3
    iget-object v0, p0, Lm4/e;->K:Lm4/d;

    iget-object v0, v0, Lm4/d;->a:Ljava/util/HashSet;

    if-eqz v0, :cond_4

    invoke-virtual {v0}, Ljava/util/HashSet;->iterator()Ljava/util/Iterator;

    move-result-object v6

    :goto_2
    invoke-interface {v6}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_4

    invoke-interface {v6}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lm4/d;

    iget-object v0, v0, Lm4/d;->d:Lm4/e;

    const/4 v5, 0x1

    move-object v1, p1

    move-object v2, p2

    move-object v3, p3

    move v4, p4

    invoke-virtual/range {v0 .. v5}, Lm4/e;->b(Lm4/f;Lf4/c;Ljava/util/HashSet;IZ)V

    goto :goto_2

    :cond_4
    iget-object v0, p0, Lm4/e;->M:Lm4/d;

    iget-object v0, v0, Lm4/d;->a:Ljava/util/HashSet;

    if-eqz v0, :cond_5

    invoke-virtual {v0}, Ljava/util/HashSet;->iterator()Ljava/util/Iterator;

    move-result-object v6

    :goto_3
    invoke-interface {v6}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_5

    invoke-interface {v6}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lm4/d;

    iget-object v0, v0, Lm4/d;->d:Lm4/e;

    const/4 v5, 0x1

    move-object v1, p1

    move-object v2, p2

    move-object v3, p3

    move v4, p4

    invoke-virtual/range {v0 .. v5}, Lm4/e;->b(Lm4/f;Lf4/c;Ljava/util/HashSet;IZ)V

    goto :goto_3

    :cond_5
    iget-object v0, p0, Lm4/e;->N:Lm4/d;

    iget-object v0, v0, Lm4/d;->a:Ljava/util/HashSet;

    if-eqz v0, :cond_6

    invoke-virtual {v0}, Ljava/util/HashSet;->iterator()Ljava/util/Iterator;

    move-result-object v6

    :goto_4
    invoke-interface {v6}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_6

    invoke-interface {v6}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lm4/d;

    iget-object v0, v0, Lm4/d;->d:Lm4/e;

    const/4 v5, 0x1

    move-object v1, p1

    move-object v2, p2

    move-object v3, p3

    move v4, p4

    invoke-virtual/range {v0 .. v5}, Lm4/e;->b(Lm4/f;Lf4/c;Ljava/util/HashSet;IZ)V

    goto :goto_4

    :cond_6
    :goto_5
    return-void
.end method

.method public c(Lf4/c;Z)V
    .locals 58

    move-object/from16 v0, p0

    move-object/from16 v1, p1

    iget-object v2, v0, Lm4/e;->J:Lm4/d;

    invoke-virtual {v1, v2}, Lf4/c;->k(Ljava/lang/Object;)Lf4/f;

    move-result-object v3

    iget-object v4, v0, Lm4/e;->L:Lm4/d;

    invoke-virtual {v1, v4}, Lf4/c;->k(Ljava/lang/Object;)Lf4/f;

    move-result-object v5

    iget-object v6, v0, Lm4/e;->K:Lm4/d;

    invoke-virtual {v1, v6}, Lf4/c;->k(Ljava/lang/Object;)Lf4/f;

    move-result-object v7

    iget-object v8, v0, Lm4/e;->M:Lm4/d;

    invoke-virtual {v1, v8}, Lf4/c;->k(Ljava/lang/Object;)Lf4/f;

    move-result-object v9

    iget-object v10, v0, Lm4/e;->N:Lm4/d;

    invoke-virtual {v1, v10}, Lf4/c;->k(Ljava/lang/Object;)Lf4/f;

    move-result-object v11

    iget-object v12, v0, Lm4/e;->U:Lm4/f;

    const/4 v13, 0x2

    const/4 v15, 0x1

    if-eqz v12, :cond_5

    iget-object v12, v12, Lm4/e;->q0:[I

    const/16 v17, 0x0

    aget v14, v12, v17

    if-ne v14, v13, :cond_0

    move v14, v15

    goto :goto_0

    :cond_0
    move/from16 v14, v17

    :goto_0
    aget v12, v12, v15

    if-ne v12, v13, :cond_1

    move/from16 v18, v15

    goto :goto_1

    :cond_1
    move/from16 v18, v17

    :goto_1
    iget v12, v0, Lm4/e;->r:I

    if-eq v12, v15, :cond_4

    if-eq v12, v13, :cond_3

    const/4 v13, 0x3

    if-eq v12, v13, :cond_2

    :goto_2
    move/from16 v12, v18

    goto :goto_4

    :cond_2
    :goto_3
    move/from16 v12, v17

    move v14, v12

    goto :goto_4

    :cond_3
    move/from16 v14, v17

    goto :goto_2

    :cond_4
    move/from16 v12, v17

    goto :goto_4

    :cond_5
    const/16 v17, 0x0

    goto :goto_3

    :goto_4
    iget v13, v0, Lm4/e;->h0:I

    move/from16 v18, v15

    iget-object v15, v0, Lm4/e;->T:[Z

    move/from16 v20, v12

    const/16 v12, 0x8

    if-ne v13, v12, :cond_9

    iget-object v13, v0, Lm4/e;->S:Ljava/util/ArrayList;

    invoke-virtual {v13}, Ljava/util/ArrayList;->size()I

    move-result v12

    move/from16 v22, v14

    move/from16 v14, v17

    :goto_5
    if-ge v14, v12, :cond_8

    invoke-virtual {v13, v14}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v23

    move/from16 v24, v12

    move-object/from16 v12, v23

    check-cast v12, Lm4/d;

    iget-object v12, v12, Lm4/d;->a:Ljava/util/HashSet;

    if-nez v12, :cond_6

    goto :goto_6

    :cond_6
    invoke-virtual {v12}, Ljava/util/HashSet;->size()I

    move-result v12

    if-lez v12, :cond_7

    goto :goto_7

    :cond_7
    :goto_6
    add-int/lit8 v14, v14, 0x1

    move/from16 v12, v24

    goto :goto_5

    :cond_8
    aget-boolean v12, v15, v17

    if-nez v12, :cond_a

    aget-boolean v12, v15, v18

    if-nez v12, :cond_a

    return-void

    :cond_9
    move/from16 v22, v14

    :cond_a
    :goto_7
    iget-boolean v12, v0, Lm4/e;->l:Z

    if-nez v12, :cond_b

    iget-boolean v13, v0, Lm4/e;->m:Z

    if-eqz v13, :cond_16

    :cond_b
    if-eqz v12, :cond_f

    iget v12, v0, Lm4/e;->Z:I

    invoke-virtual {v1, v3, v12}, Lf4/c;->d(Lf4/f;I)V

    iget v12, v0, Lm4/e;->Z:I

    iget v13, v0, Lm4/e;->V:I

    add-int/2addr v12, v13

    invoke-virtual {v1, v5, v12}, Lf4/c;->d(Lf4/f;I)V

    if-eqz v22, :cond_f

    iget-object v12, v0, Lm4/e;->U:Lm4/f;

    if-eqz v12, :cond_f

    iget-object v13, v12, Lm4/f;->I0:Ljava/lang/ref/WeakReference;

    if-eqz v13, :cond_c

    invoke-virtual {v13}, Ljava/lang/ref/Reference;->get()Ljava/lang/Object;

    move-result-object v13

    if-eqz v13, :cond_c

    invoke-virtual {v2}, Lm4/d;->d()I

    move-result v13

    iget-object v14, v12, Lm4/f;->I0:Ljava/lang/ref/WeakReference;

    invoke-virtual {v14}, Ljava/lang/ref/Reference;->get()Ljava/lang/Object;

    move-result-object v14

    check-cast v14, Lm4/d;

    invoke-virtual {v14}, Lm4/d;->d()I

    move-result v14

    if-le v13, v14, :cond_d

    :cond_c
    new-instance v13, Ljava/lang/ref/WeakReference;

    invoke-direct {v13, v2}, Ljava/lang/ref/WeakReference;-><init>(Ljava/lang/Object;)V

    iput-object v13, v12, Lm4/f;->I0:Ljava/lang/ref/WeakReference;

    :cond_d
    iget-object v13, v12, Lm4/f;->K0:Ljava/lang/ref/WeakReference;

    if-eqz v13, :cond_e

    invoke-virtual {v13}, Ljava/lang/ref/Reference;->get()Ljava/lang/Object;

    move-result-object v13

    if-eqz v13, :cond_e

    invoke-virtual {v4}, Lm4/d;->d()I

    move-result v13

    iget-object v14, v12, Lm4/f;->K0:Ljava/lang/ref/WeakReference;

    invoke-virtual {v14}, Ljava/lang/ref/Reference;->get()Ljava/lang/Object;

    move-result-object v14

    check-cast v14, Lm4/d;

    invoke-virtual {v14}, Lm4/d;->d()I

    move-result v14

    if-le v13, v14, :cond_f

    :cond_e
    new-instance v13, Ljava/lang/ref/WeakReference;

    invoke-direct {v13, v4}, Ljava/lang/ref/WeakReference;-><init>(Ljava/lang/Object;)V

    iput-object v13, v12, Lm4/f;->K0:Ljava/lang/ref/WeakReference;

    :cond_f
    iget-boolean v12, v0, Lm4/e;->m:Z

    if-eqz v12, :cond_15

    iget v12, v0, Lm4/e;->a0:I

    invoke-virtual {v1, v7, v12}, Lf4/c;->d(Lf4/f;I)V

    iget v12, v0, Lm4/e;->a0:I

    iget v13, v0, Lm4/e;->W:I

    add-int/2addr v12, v13

    invoke-virtual {v1, v9, v12}, Lf4/c;->d(Lf4/f;I)V

    iget-object v12, v10, Lm4/d;->a:Ljava/util/HashSet;

    if-nez v12, :cond_10

    goto :goto_8

    :cond_10
    invoke-virtual {v12}, Ljava/util/HashSet;->size()I

    move-result v12

    if-lez v12, :cond_11

    iget v12, v0, Lm4/e;->a0:I

    iget v13, v0, Lm4/e;->b0:I

    add-int/2addr v12, v13

    invoke-virtual {v1, v11, v12}, Lf4/c;->d(Lf4/f;I)V

    :cond_11
    :goto_8
    if-eqz v20, :cond_15

    iget-object v12, v0, Lm4/e;->U:Lm4/f;

    if-eqz v12, :cond_15

    iget-object v13, v12, Lm4/f;->H0:Ljava/lang/ref/WeakReference;

    if-eqz v13, :cond_12

    invoke-virtual {v13}, Ljava/lang/ref/Reference;->get()Ljava/lang/Object;

    move-result-object v13

    if-eqz v13, :cond_12

    invoke-virtual {v6}, Lm4/d;->d()I

    move-result v13

    iget-object v14, v12, Lm4/f;->H0:Ljava/lang/ref/WeakReference;

    invoke-virtual {v14}, Ljava/lang/ref/Reference;->get()Ljava/lang/Object;

    move-result-object v14

    check-cast v14, Lm4/d;

    invoke-virtual {v14}, Lm4/d;->d()I

    move-result v14

    if-le v13, v14, :cond_13

    :cond_12
    new-instance v13, Ljava/lang/ref/WeakReference;

    invoke-direct {v13, v6}, Ljava/lang/ref/WeakReference;-><init>(Ljava/lang/Object;)V

    iput-object v13, v12, Lm4/f;->H0:Ljava/lang/ref/WeakReference;

    :cond_13
    iget-object v13, v12, Lm4/f;->J0:Ljava/lang/ref/WeakReference;

    if-eqz v13, :cond_14

    invoke-virtual {v13}, Ljava/lang/ref/Reference;->get()Ljava/lang/Object;

    move-result-object v13

    if-eqz v13, :cond_14

    invoke-virtual {v8}, Lm4/d;->d()I

    move-result v13

    iget-object v14, v12, Lm4/f;->J0:Ljava/lang/ref/WeakReference;

    invoke-virtual {v14}, Ljava/lang/ref/Reference;->get()Ljava/lang/Object;

    move-result-object v14

    check-cast v14, Lm4/d;

    invoke-virtual {v14}, Lm4/d;->d()I

    move-result v14

    if-le v13, v14, :cond_15

    :cond_14
    new-instance v13, Ljava/lang/ref/WeakReference;

    invoke-direct {v13, v8}, Ljava/lang/ref/WeakReference;-><init>(Ljava/lang/Object;)V

    iput-object v13, v12, Lm4/f;->J0:Ljava/lang/ref/WeakReference;

    :cond_15
    iget-boolean v12, v0, Lm4/e;->l:Z

    if-eqz v12, :cond_16

    iget-boolean v12, v0, Lm4/e;->m:Z

    if-eqz v12, :cond_16

    move/from16 v12, v17

    iput-boolean v12, v0, Lm4/e;->l:Z

    iput-boolean v12, v0, Lm4/e;->m:Z

    return-void

    :cond_16
    iget-object v12, v0, Lm4/e;->f:[Z

    if-eqz p2, :cond_1a

    iget-object v13, v0, Lm4/e;->d:Ln4/l;

    if-eqz v13, :cond_1a

    iget-object v14, v0, Lm4/e;->e:Ln4/n;

    if-eqz v14, :cond_1a

    move-object/from16 v23, v10

    iget-object v10, v13, Ln4/p;->h:Ln4/g;

    move-object/from16 v24, v12

    iget-boolean v12, v10, Ln4/g;->j:Z

    if-eqz v12, :cond_19

    iget-object v12, v13, Ln4/p;->i:Ln4/g;

    iget-boolean v12, v12, Ln4/g;->j:Z

    if-eqz v12, :cond_19

    iget-object v12, v14, Ln4/p;->h:Ln4/g;

    iget-boolean v12, v12, Ln4/g;->j:Z

    if-eqz v12, :cond_19

    iget-object v12, v14, Ln4/p;->i:Ln4/g;

    iget-boolean v12, v12, Ln4/g;->j:Z

    if-eqz v12, :cond_19

    iget v2, v10, Ln4/g;->g:I

    invoke-virtual {v1, v3, v2}, Lf4/c;->d(Lf4/f;I)V

    iget-object v2, v0, Lm4/e;->d:Ln4/l;

    iget-object v2, v2, Ln4/p;->i:Ln4/g;

    iget v2, v2, Ln4/g;->g:I

    invoke-virtual {v1, v5, v2}, Lf4/c;->d(Lf4/f;I)V

    iget-object v2, v0, Lm4/e;->e:Ln4/n;

    iget-object v2, v2, Ln4/p;->h:Ln4/g;

    iget v2, v2, Ln4/g;->g:I

    invoke-virtual {v1, v7, v2}, Lf4/c;->d(Lf4/f;I)V

    iget-object v2, v0, Lm4/e;->e:Ln4/n;

    iget-object v2, v2, Ln4/p;->i:Ln4/g;

    iget v2, v2, Ln4/g;->g:I

    invoke-virtual {v1, v9, v2}, Lf4/c;->d(Lf4/f;I)V

    iget-object v2, v0, Lm4/e;->e:Ln4/n;

    iget-object v2, v2, Ln4/n;->k:Ln4/g;

    iget v2, v2, Ln4/g;->g:I

    invoke-virtual {v1, v11, v2}, Lf4/c;->d(Lf4/f;I)V

    iget-object v2, v0, Lm4/e;->U:Lm4/f;

    if-eqz v2, :cond_18

    if-eqz v22, :cond_17

    const/4 v12, 0x0

    aget-boolean v2, v24, v12

    if-eqz v2, :cond_17

    invoke-virtual {v0}, Lm4/e;->y()Z

    move-result v2

    if-nez v2, :cond_17

    iget-object v2, v0, Lm4/e;->U:Lm4/f;

    iget-object v2, v2, Lm4/e;->L:Lm4/d;

    invoke-virtual {v1, v2}, Lf4/c;->k(Ljava/lang/Object;)Lf4/f;

    move-result-object v2

    const/16 v3, 0x8

    invoke-virtual {v1, v2, v5, v12, v3}, Lf4/c;->f(Lf4/f;Lf4/f;II)V

    :cond_17
    if-eqz v20, :cond_18

    aget-boolean v2, v24, v18

    if-eqz v2, :cond_18

    invoke-virtual {v0}, Lm4/e;->z()Z

    move-result v2

    if-nez v2, :cond_18

    iget-object v2, v0, Lm4/e;->U:Lm4/f;

    iget-object v2, v2, Lm4/e;->M:Lm4/d;

    invoke-virtual {v1, v2}, Lf4/c;->k(Ljava/lang/Object;)Lf4/f;

    move-result-object v2

    const/16 v3, 0x8

    const/4 v12, 0x0

    invoke-virtual {v1, v2, v9, v12, v3}, Lf4/c;->f(Lf4/f;Lf4/f;II)V

    goto :goto_9

    :cond_18
    const/4 v12, 0x0

    :goto_9
    iput-boolean v12, v0, Lm4/e;->l:Z

    iput-boolean v12, v0, Lm4/e;->m:Z

    return-void

    :cond_19
    :goto_a
    const/4 v12, 0x0

    goto :goto_b

    :cond_1a
    move-object/from16 v23, v10

    move-object/from16 v24, v12

    goto :goto_a

    :goto_b
    iget-object v10, v0, Lm4/e;->U:Lm4/f;

    if-eqz v10, :cond_1f

    invoke-virtual {v0, v12}, Lm4/e;->x(I)Z

    move-result v10

    if-eqz v10, :cond_1b

    iget-object v10, v0, Lm4/e;->U:Lm4/f;

    invoke-virtual {v10, v0, v12}, Lm4/f;->W(Lm4/e;I)V

    move/from16 v10, v18

    move v12, v10

    goto :goto_c

    :cond_1b
    invoke-virtual {v0}, Lm4/e;->y()Z

    move-result v10

    move/from16 v12, v18

    :goto_c
    invoke-virtual {v0, v12}, Lm4/e;->x(I)Z

    move-result v13

    if-eqz v13, :cond_1c

    iget-object v13, v0, Lm4/e;->U:Lm4/f;

    invoke-virtual {v13, v0, v12}, Lm4/f;->W(Lm4/e;I)V

    const/4 v12, 0x1

    goto :goto_d

    :cond_1c
    invoke-virtual {v0}, Lm4/e;->z()Z

    move-result v12

    :goto_d
    if-nez v10, :cond_1d

    if-eqz v22, :cond_1d

    iget v13, v0, Lm4/e;->h0:I

    const/16 v14, 0x8

    if-eq v13, v14, :cond_1d

    iget-object v13, v2, Lm4/d;->f:Lm4/d;

    if-nez v13, :cond_1d

    iget-object v13, v4, Lm4/d;->f:Lm4/d;

    if-nez v13, :cond_1d

    iget-object v13, v0, Lm4/e;->U:Lm4/f;

    iget-object v13, v13, Lm4/e;->L:Lm4/d;

    invoke-virtual {v1, v13}, Lf4/c;->k(Ljava/lang/Object;)Lf4/f;

    move-result-object v13

    move-object/from16 v25, v2

    const/4 v2, 0x0

    const/4 v14, 0x1

    invoke-virtual {v1, v13, v5, v2, v14}, Lf4/c;->f(Lf4/f;Lf4/f;II)V

    goto :goto_e

    :cond_1d
    move-object/from16 v25, v2

    :goto_e
    if-nez v12, :cond_1e

    if-eqz v20, :cond_1e

    iget v2, v0, Lm4/e;->h0:I

    const/16 v14, 0x8

    if-eq v2, v14, :cond_1e

    iget-object v2, v6, Lm4/d;->f:Lm4/d;

    if-nez v2, :cond_1e

    iget-object v2, v8, Lm4/d;->f:Lm4/d;

    if-nez v2, :cond_1e

    if-nez v23, :cond_1e

    iget-object v2, v0, Lm4/e;->U:Lm4/f;

    iget-object v2, v2, Lm4/e;->M:Lm4/d;

    invoke-virtual {v1, v2}, Lf4/c;->k(Ljava/lang/Object;)Lf4/f;

    move-result-object v2

    const/4 v13, 0x0

    const/4 v14, 0x1

    invoke-virtual {v1, v2, v9, v13, v14}, Lf4/c;->f(Lf4/f;Lf4/f;II)V

    :cond_1e
    move-object v2, v4

    move/from16 v4, v20

    move/from16 v20, v12

    move v12, v10

    goto :goto_f

    :cond_1f
    move-object/from16 v25, v2

    move-object v2, v4

    move/from16 v4, v20

    const/4 v12, 0x0

    const/16 v20, 0x0

    :goto_f
    iget v10, v0, Lm4/e;->V:I

    iget v13, v0, Lm4/e;->c0:I

    if-ge v10, v13, :cond_20

    goto :goto_10

    :cond_20
    move v13, v10

    :goto_10
    iget v14, v0, Lm4/e;->W:I

    move-object/from16 v26, v2

    iget v2, v0, Lm4/e;->d0:I

    if-ge v14, v2, :cond_21

    move/from16 v27, v2

    goto :goto_11

    :cond_21
    move/from16 v27, v14

    :goto_11
    iget-object v2, v0, Lm4/e;->q0:[I

    move-object/from16 v28, v2

    const/16 v17, 0x0

    aget v2, v28, v17

    move/from16 v29, v4

    const/4 v4, 0x3

    if-eq v2, v4, :cond_22

    const/16 v30, 0x1

    :goto_12
    move-object/from16 v31, v6

    const/16 v18, 0x1

    goto :goto_13

    :cond_22
    const/16 v30, 0x0

    goto :goto_12

    :goto_13
    aget v6, v28, v18

    if-eq v6, v4, :cond_23

    const/16 v32, 0x1

    goto :goto_14

    :cond_23
    const/16 v32, 0x0

    :goto_14
    iget v4, v0, Lm4/e;->Y:I

    iput v4, v0, Lm4/e;->B:I

    move-object/from16 v33, v7

    iget v7, v0, Lm4/e;->X:F

    iput v7, v0, Lm4/e;->C:F

    move/from16 v34, v7

    iget v7, v0, Lm4/e;->s:I

    move/from16 v35, v7

    iget v7, v0, Lm4/e;->t:I

    const/16 v36, 0x0

    cmpl-float v36, v34, v36

    move/from16 v37, v7

    const/high16 v38, 0x3f800000    # 1.0f

    if-lez v36, :cond_36

    iget v7, v0, Lm4/e;->h0:I

    move-object/from16 v39, v8

    const/16 v8, 0x8

    if-eq v7, v8, :cond_35

    const/4 v7, 0x3

    if-ne v2, v7, :cond_24

    if-nez v35, :cond_24

    move v8, v7

    goto :goto_15

    :cond_24
    move/from16 v8, v35

    :goto_15
    if-ne v6, v7, :cond_25

    if-nez v37, :cond_25

    move-object/from16 v40, v9

    move v9, v7

    goto :goto_16

    :cond_25
    move-object/from16 v40, v9

    move/from16 v9, v37

    :goto_16
    if-ne v2, v7, :cond_30

    if-ne v6, v7, :cond_30

    if-ne v8, v7, :cond_30

    if-ne v9, v7, :cond_30

    const/4 v7, -0x1

    if-ne v4, v7, :cond_27

    if-eqz v30, :cond_26

    if-nez v32, :cond_26

    const/4 v2, 0x0

    iput v2, v0, Lm4/e;->B:I

    goto :goto_17

    :cond_26
    if-nez v30, :cond_27

    if-eqz v32, :cond_27

    const/4 v14, 0x1

    iput v14, v0, Lm4/e;->B:I

    if-ne v4, v7, :cond_27

    div-float v7, v38, v34

    iput v7, v0, Lm4/e;->C:F

    :cond_27
    :goto_17
    iget v2, v0, Lm4/e;->B:I

    if-nez v2, :cond_29

    invoke-virtual/range {v31 .. v31}, Lm4/d;->h()Z

    move-result v2

    if-eqz v2, :cond_28

    invoke-virtual/range {v39 .. v39}, Lm4/d;->h()Z

    move-result v2

    if-nez v2, :cond_29

    :cond_28
    const/4 v14, 0x1

    goto :goto_18

    :cond_29
    const/4 v14, 0x1

    goto :goto_19

    :goto_18
    iput v14, v0, Lm4/e;->B:I

    goto :goto_1a

    :goto_19
    iget v2, v0, Lm4/e;->B:I

    if-ne v2, v14, :cond_2b

    invoke-virtual/range {v25 .. v25}, Lm4/d;->h()Z

    move-result v2

    if-eqz v2, :cond_2a

    invoke-virtual/range {v26 .. v26}, Lm4/d;->h()Z

    move-result v2

    if-nez v2, :cond_2b

    :cond_2a
    const/4 v2, 0x0

    iput v2, v0, Lm4/e;->B:I

    :cond_2b
    :goto_1a
    iget v2, v0, Lm4/e;->B:I

    const/4 v7, -0x1

    if-ne v2, v7, :cond_2e

    invoke-virtual/range {v31 .. v31}, Lm4/d;->h()Z

    move-result v2

    if-eqz v2, :cond_2c

    invoke-virtual/range {v39 .. v39}, Lm4/d;->h()Z

    move-result v2

    if-eqz v2, :cond_2c

    invoke-virtual/range {v25 .. v25}, Lm4/d;->h()Z

    move-result v2

    if-eqz v2, :cond_2c

    invoke-virtual/range {v26 .. v26}, Lm4/d;->h()Z

    move-result v2

    if-nez v2, :cond_2e

    :cond_2c
    invoke-virtual/range {v31 .. v31}, Lm4/d;->h()Z

    move-result v2

    if-eqz v2, :cond_2d

    invoke-virtual/range {v39 .. v39}, Lm4/d;->h()Z

    move-result v2

    if-eqz v2, :cond_2d

    const/4 v2, 0x0

    iput v2, v0, Lm4/e;->B:I

    goto :goto_1b

    :cond_2d
    invoke-virtual/range {v25 .. v25}, Lm4/d;->h()Z

    move-result v2

    if-eqz v2, :cond_2e

    invoke-virtual/range {v26 .. v26}, Lm4/d;->h()Z

    move-result v2

    if-eqz v2, :cond_2e

    iget v2, v0, Lm4/e;->C:F

    div-float v7, v38, v2

    iput v7, v0, Lm4/e;->C:F

    const/4 v14, 0x1

    iput v14, v0, Lm4/e;->B:I

    :cond_2e
    :goto_1b
    iget v2, v0, Lm4/e;->B:I

    const/4 v7, -0x1

    if-ne v2, v7, :cond_31

    iget v2, v0, Lm4/e;->v:I

    if-lez v2, :cond_2f

    iget v4, v0, Lm4/e;->y:I

    if-nez v4, :cond_2f

    const/4 v4, 0x0

    iput v4, v0, Lm4/e;->B:I

    goto :goto_1d

    :cond_2f
    if-nez v2, :cond_31

    iget v2, v0, Lm4/e;->y:I

    if-lez v2, :cond_31

    iget v2, v0, Lm4/e;->C:F

    div-float v7, v38, v2

    iput v7, v0, Lm4/e;->C:F

    const/4 v14, 0x1

    iput v14, v0, Lm4/e;->B:I

    goto :goto_1d

    :cond_30
    if-ne v2, v7, :cond_32

    if-ne v8, v7, :cond_32

    const/4 v7, 0x0

    iput v7, v0, Lm4/e;->B:I

    int-to-float v2, v14

    mul-float v7, v34, v2

    float-to-int v2, v7

    const/4 v7, 0x3

    move v13, v2

    if-eq v6, v7, :cond_31

    move-object/from16 v2, v23

    move/from16 v30, v27

    const/4 v7, 0x4

    const/16 v31, 0x0

    :goto_1c
    move/from16 v23, v9

    goto :goto_22

    :cond_31
    :goto_1d
    move v7, v8

    move-object/from16 v2, v23

    move/from16 v30, v27

    :goto_1e
    const/16 v31, 0x1

    goto :goto_1c

    :cond_32
    if-ne v6, v7, :cond_31

    if-ne v9, v7, :cond_31

    const/4 v14, 0x1

    iput v14, v0, Lm4/e;->B:I

    const/4 v6, -0x1

    if-ne v4, v6, :cond_33

    div-float v4, v38, v34

    iput v4, v0, Lm4/e;->C:F

    :cond_33
    iget v4, v0, Lm4/e;->C:F

    int-to-float v6, v10

    mul-float/2addr v4, v6

    float-to-int v4, v4

    move/from16 v30, v4

    if-eq v2, v7, :cond_34

    move v7, v8

    move-object/from16 v2, v23

    const/16 v23, 0x4

    :goto_1f
    const/16 v31, 0x0

    goto :goto_22

    :cond_34
    move v7, v8

    move-object/from16 v2, v23

    goto :goto_1e

    :cond_35
    :goto_20
    move-object/from16 v40, v9

    goto :goto_21

    :cond_36
    move-object/from16 v39, v8

    goto :goto_20

    :goto_21
    move-object/from16 v2, v23

    move/from16 v30, v27

    move/from16 v7, v35

    move/from16 v23, v37

    goto :goto_1f

    :goto_22
    iget-object v4, v0, Lm4/e;->u:[I

    const/16 v17, 0x0

    aput v7, v4, v17

    const/16 v18, 0x1

    aput v23, v4, v18

    if-eqz v31, :cond_38

    iget v4, v0, Lm4/e;->B:I

    const/4 v6, -0x1

    if-eqz v4, :cond_37

    if-ne v4, v6, :cond_39

    :cond_37
    const/4 v4, 0x1

    goto :goto_23

    :cond_38
    const/4 v6, -0x1

    :cond_39
    const/4 v4, 0x0

    :goto_23
    if-eqz v31, :cond_3b

    iget v8, v0, Lm4/e;->B:I

    const/4 v14, 0x1

    if-eq v8, v14, :cond_3a

    if-ne v8, v6, :cond_3b

    :cond_3a
    const/16 v32, 0x1

    :goto_24
    const/16 v17, 0x0

    goto :goto_25

    :cond_3b
    const/16 v32, 0x0

    goto :goto_24

    :goto_25
    aget v6, v28, v17

    const/4 v8, 0x2

    if-ne v6, v8, :cond_3c

    instance-of v6, v0, Lm4/f;

    if-eqz v6, :cond_3c

    const/4 v9, 0x1

    goto :goto_26

    :cond_3c
    const/4 v9, 0x0

    :goto_26
    if-eqz v9, :cond_3d

    const/4 v13, 0x0

    :cond_3d
    iget-object v6, v0, Lm4/e;->Q:Lm4/d;

    invoke-virtual {v6}, Lm4/d;->h()Z

    move-result v8

    const/16 v18, 0x1

    xor-int/lit8 v27, v8, 0x1

    const/16 v14, 0x8

    const/16 v17, 0x0

    aget-boolean v21, v15, v17

    aget-boolean v34, v15, v18

    iget v8, v0, Lm4/e;->p:I

    iget-object v10, v0, Lm4/e;->D:[I

    const/16 v35, 0x0

    const/4 v15, 0x2

    if-eq v8, v15, :cond_40

    iget-boolean v8, v0, Lm4/e;->l:Z

    if-nez v8, :cond_40

    if-eqz p2, :cond_41

    iget-object v8, v0, Lm4/e;->d:Ln4/l;

    if-eqz v8, :cond_41

    iget-object v14, v8, Ln4/p;->h:Ln4/g;

    iget-boolean v15, v14, Ln4/g;->j:Z

    if-eqz v15, :cond_3e

    iget-object v8, v8, Ln4/p;->i:Ln4/g;

    iget-boolean v8, v8, Ln4/g;->j:Z

    if-nez v8, :cond_3f

    :cond_3e
    const/16 v14, 0x8

    goto :goto_27

    :cond_3f
    if-eqz p2, :cond_40

    iget v4, v14, Ln4/g;->g:I

    invoke-virtual {v1, v3, v4}, Lf4/c;->d(Lf4/f;I)V

    iget-object v4, v0, Lm4/e;->d:Ln4/l;

    iget-object v4, v4, Ln4/p;->i:Ln4/g;

    iget v4, v4, Ln4/g;->g:I

    invoke-virtual {v1, v5, v4}, Lf4/c;->d(Lf4/f;I)V

    iget-object v4, v0, Lm4/e;->U:Lm4/f;

    if-eqz v4, :cond_40

    if-eqz v22, :cond_40

    const/4 v13, 0x0

    aget-boolean v4, v24, v13

    if-eqz v4, :cond_40

    invoke-virtual {v0}, Lm4/e;->y()Z

    move-result v4

    if-nez v4, :cond_40

    iget-object v4, v0, Lm4/e;->U:Lm4/f;

    iget-object v4, v4, Lm4/e;->L:Lm4/d;

    invoke-virtual {v1, v4}, Lf4/c;->k(Ljava/lang/Object;)Lf4/f;

    move-result-object v4

    const/16 v14, 0x8

    invoke-virtual {v1, v4, v5, v13, v14}, Lf4/c;->f(Lf4/f;Lf4/f;II)V

    :cond_40
    move-object/from16 v55, v2

    move-object/from16 v49, v3

    move-object/from16 v50, v5

    move-object/from16 v41, v6

    move-object/from16 v46, v10

    move-object/from16 v53, v11

    move/from16 v19, v12

    move/from16 v3, v22

    move/from16 v4, v29

    move-object/from16 v51, v33

    move-object/from16 v54, v39

    move-object/from16 v52, v40

    move/from16 v22, v7

    move-object/from16 v29, v24

    goto/16 :goto_2c

    :cond_41
    :goto_27
    iget-object v8, v0, Lm4/e;->U:Lm4/f;

    if-eqz v8, :cond_42

    iget-object v8, v8, Lm4/e;->L:Lm4/d;

    invoke-virtual {v1, v8}, Lf4/c;->k(Ljava/lang/Object;)Lf4/f;

    move-result-object v8

    goto :goto_28

    :cond_42
    move-object/from16 v8, v35

    :goto_28
    iget-object v15, v0, Lm4/e;->U:Lm4/f;

    if-eqz v15, :cond_43

    iget-object v15, v15, Lm4/e;->J:Lm4/d;

    invoke-virtual {v1, v15}, Lf4/c;->k(Ljava/lang/Object;)Lf4/f;

    move-result-object v15

    :goto_29
    move-object/from16 v19, v5

    const/16 v17, 0x0

    goto :goto_2a

    :cond_43
    move-object/from16 v15, v35

    goto :goto_29

    :goto_2a
    aget-boolean v5, v24, v17

    move-object/from16 v26, v3

    move/from16 v3, v22

    move/from16 v22, v7

    move-object v7, v8

    aget v8, v28, v17

    move-object/from16 v36, v19

    move/from16 v19, v12

    iget v12, v0, Lm4/e;->Z:I

    move/from16 v37, v14

    iget v14, v0, Lm4/e;->c0:I

    move-object/from16 v41, v6

    move-object v6, v15

    aget v15, v10, v17

    iget v1, v0, Lm4/e;->e0:F

    move/from16 v42, v1

    const/16 v18, 0x1

    aget v1, v28, v18

    move-object/from16 v43, v2

    const/4 v2, 0x3

    if-ne v1, v2, :cond_44

    goto :goto_2b

    :cond_44
    move/from16 v18, v17

    :goto_2b
    iget v1, v0, Lm4/e;->v:I

    iget v2, v0, Lm4/e;->w:I

    move/from16 v44, v1

    iget v1, v0, Lm4/e;->x:F

    move/from16 v25, v2

    const/16 v45, 0x2

    const/4 v2, 0x1

    move-object/from16 v46, v10

    iget-object v10, v0, Lm4/e;->J:Lm4/d;

    move-object/from16 v47, v11

    iget-object v11, v0, Lm4/e;->L:Lm4/d;

    move/from16 v17, v4

    move-object/from16 v49, v26

    move/from16 v4, v29

    move-object/from16 v51, v33

    move-object/from16 v50, v36

    move-object/from16 v54, v39

    move-object/from16 v52, v40

    move/from16 v16, v42

    move-object/from16 v55, v43

    move-object/from16 v53, v47

    move/from16 v26, v1

    move-object/from16 v29, v24

    move/from16 v24, v44

    move-object/from16 v1, p1

    invoke-virtual/range {v0 .. v27}, Lm4/e;->e(Lf4/c;ZZZZLf4/f;Lf4/f;IZLm4/d;Lm4/d;IIIIFZZZZZIIIIFZ)V

    :goto_2c
    if-eqz p2, :cond_47

    iget-object v2, v0, Lm4/e;->e:Ln4/n;

    if-eqz v2, :cond_47

    iget-object v5, v2, Ln4/p;->h:Ln4/g;

    iget-boolean v6, v5, Ln4/g;->j:Z

    if-eqz v6, :cond_47

    iget-object v2, v2, Ln4/p;->i:Ln4/g;

    iget-boolean v2, v2, Ln4/g;->j:Z

    if-eqz v2, :cond_47

    iget v2, v5, Ln4/g;->g:I

    move-object/from16 v5, v51

    invoke-virtual {v1, v5, v2}, Lf4/c;->d(Lf4/f;I)V

    iget-object v2, v0, Lm4/e;->e:Ln4/n;

    iget-object v2, v2, Ln4/p;->i:Ln4/g;

    iget v2, v2, Ln4/g;->g:I

    move-object/from16 v6, v52

    invoke-virtual {v1, v6, v2}, Lf4/c;->d(Lf4/f;I)V

    iget-object v2, v0, Lm4/e;->e:Ln4/n;

    iget-object v2, v2, Ln4/n;->k:Ln4/g;

    iget v2, v2, Ln4/g;->g:I

    move-object/from16 v7, v53

    invoke-virtual {v1, v7, v2}, Lf4/c;->d(Lf4/f;I)V

    iget-object v2, v0, Lm4/e;->U:Lm4/f;

    if-eqz v2, :cond_46

    if-nez v20, :cond_46

    if-eqz v4, :cond_46

    const/16 v18, 0x1

    aget-boolean v8, v29, v18

    if-eqz v8, :cond_45

    iget-object v2, v2, Lm4/e;->M:Lm4/d;

    invoke-virtual {v1, v2}, Lf4/c;->k(Ljava/lang/Object;)Lf4/f;

    move-result-object v2

    const/4 v8, 0x0

    const/16 v14, 0x8

    invoke-virtual {v1, v2, v6, v8, v14}, Lf4/c;->f(Lf4/f;Lf4/f;II)V

    goto :goto_2d

    :cond_45
    const/4 v8, 0x0

    const/16 v14, 0x8

    goto :goto_2d

    :cond_46
    const/4 v8, 0x0

    const/16 v14, 0x8

    const/16 v18, 0x1

    :goto_2d
    move v15, v8

    goto :goto_2e

    :cond_47
    move-object/from16 v5, v51

    move-object/from16 v6, v52

    move-object/from16 v7, v53

    const/4 v8, 0x0

    const/16 v14, 0x8

    const/16 v18, 0x1

    move/from16 v15, v18

    :goto_2e
    iget v2, v0, Lm4/e;->q:I

    const/4 v9, 0x2

    if-ne v2, v9, :cond_48

    move v15, v8

    :cond_48
    const/4 v2, 0x5

    if-eqz v15, :cond_53

    iget-boolean v10, v0, Lm4/e;->m:Z

    if-nez v10, :cond_53

    aget v10, v28, v18

    if-ne v10, v9, :cond_49

    instance-of v10, v0, Lm4/f;

    if-eqz v10, :cond_49

    move/from16 v15, v18

    goto :goto_2f

    :cond_49
    move v15, v8

    :goto_2f
    if-eqz v15, :cond_4a

    move v13, v8

    goto :goto_30

    :cond_4a
    move/from16 v13, v30

    :goto_30
    iget-object v10, v0, Lm4/e;->U:Lm4/f;

    if-eqz v10, :cond_4b

    iget-object v10, v10, Lm4/e;->M:Lm4/d;

    invoke-virtual {v1, v10}, Lf4/c;->k(Ljava/lang/Object;)Lf4/f;

    move-result-object v10

    goto :goto_31

    :cond_4b
    move-object/from16 v10, v35

    :goto_31
    iget-object v11, v0, Lm4/e;->U:Lm4/f;

    if-eqz v11, :cond_4c

    iget-object v11, v11, Lm4/e;->K:Lm4/d;

    invoke-virtual {v1, v11}, Lf4/c;->k(Ljava/lang/Object;)Lf4/f;

    move-result-object v35

    :cond_4c
    iget v11, v0, Lm4/e;->b0:I

    if-gtz v11, :cond_4d

    iget v12, v0, Lm4/e;->h0:I

    if-ne v12, v14, :cond_51

    :cond_4d
    move-object/from16 v12, v55

    iget-object v9, v12, Lm4/d;->f:Lm4/d;

    if-eqz v9, :cond_4f

    invoke-virtual {v1, v7, v5, v11, v14}, Lf4/c;->e(Lf4/f;Lf4/f;II)V

    iget-object v9, v12, Lm4/d;->f:Lm4/d;

    invoke-virtual {v1, v9}, Lf4/c;->k(Ljava/lang/Object;)Lf4/f;

    move-result-object v9

    invoke-virtual {v12}, Lm4/d;->e()I

    move-result v11

    invoke-virtual {v1, v7, v9, v11, v14}, Lf4/c;->e(Lf4/f;Lf4/f;II)V

    if-eqz v4, :cond_4e

    move-object/from16 v7, v54

    invoke-virtual {v1, v7}, Lf4/c;->k(Ljava/lang/Object;)Lf4/f;

    move-result-object v7

    invoke-virtual {v1, v10, v7, v8, v2}, Lf4/c;->f(Lf4/f;Lf4/f;II)V

    :cond_4e
    move/from16 v27, v8

    goto :goto_32

    :cond_4f
    iget v9, v0, Lm4/e;->h0:I

    if-ne v9, v14, :cond_50

    invoke-virtual {v12}, Lm4/d;->e()I

    move-result v9

    invoke-virtual {v1, v7, v5, v9, v14}, Lf4/c;->e(Lf4/f;Lf4/f;II)V

    goto :goto_32

    :cond_50
    invoke-virtual {v1, v7, v5, v11, v14}, Lf4/c;->e(Lf4/f;Lf4/f;II)V

    :cond_51
    :goto_32
    aget-boolean v7, v29, v18

    move/from16 v17, v8

    aget v8, v28, v18

    iget v12, v0, Lm4/e;->a0:I

    iget v14, v0, Lm4/e;->d0:I

    aget v9, v46, v18

    iget v11, v0, Lm4/e;->f0:F

    aget v2, v28, v17

    const/4 v1, 0x3

    move/from16 v16, v18

    if-ne v2, v1, :cond_52

    goto :goto_33

    :cond_52
    move/from16 v18, v17

    :goto_33
    iget v2, v0, Lm4/e;->y:I

    iget v1, v0, Lm4/e;->z:I

    move/from16 v21, v1

    iget v1, v0, Lm4/e;->A:F

    move/from16 v24, v2

    const/4 v2, 0x0

    move-object/from16 v33, v5

    move v5, v7

    move-object v7, v10

    iget-object v10, v0, Lm4/e;->K:Lm4/d;

    move/from16 v48, v16

    move/from16 v16, v11

    iget-object v11, v0, Lm4/e;->M:Lm4/d;

    move/from16 v17, v4

    move v4, v3

    move/from16 v3, v17

    move/from16 v17, v15

    move v15, v9

    move/from16 v9, v17

    move/from16 v17, v20

    move/from16 v20, v19

    move/from16 v19, v17

    move/from16 v17, v23

    move/from16 v23, v22

    move/from16 v22, v17

    move/from16 v26, v1

    move-object/from16 v57, v6

    move/from16 v25, v21

    move/from16 v17, v32

    move-object/from16 v56, v33

    move/from16 v21, v34

    move-object/from16 v6, v35

    move-object/from16 v1, p1

    invoke-virtual/range {v0 .. v27}, Lm4/e;->e(Lf4/c;ZZZZLf4/f;Lf4/f;IZLm4/d;Lm4/d;IIIIFZZZZZIIIIFZ)V

    goto :goto_34

    :cond_53
    move-object/from16 v56, v5

    move-object/from16 v57, v6

    :goto_34
    if-eqz v31, :cond_55

    iget v2, v0, Lm4/e;->B:I

    const/high16 v3, -0x40800000    # -1.0f

    const/4 v14, 0x1

    if-ne v2, v14, :cond_54

    iget v2, v0, Lm4/e;->C:F

    invoke-virtual {v1}, Lf4/c;->l()Lf4/b;

    move-result-object v4

    iget-object v5, v4, Lf4/b;->d:Lf4/a;

    move-object/from16 v6, v57

    invoke-virtual {v5, v6, v3}, Lf4/a;->g(Lf4/f;F)V

    iget-object v3, v4, Lf4/b;->d:Lf4/a;

    move-object/from16 v5, v56

    const/high16 v7, 0x3f800000    # 1.0f

    invoke-virtual {v3, v5, v7}, Lf4/a;->g(Lf4/f;F)V

    iget-object v3, v4, Lf4/b;->d:Lf4/a;

    move-object/from16 v8, v50

    invoke-virtual {v3, v8, v2}, Lf4/a;->g(Lf4/f;F)V

    iget-object v3, v4, Lf4/b;->d:Lf4/a;

    neg-float v2, v2

    move-object/from16 v9, v49

    invoke-virtual {v3, v9, v2}, Lf4/a;->g(Lf4/f;F)V

    invoke-virtual {v1, v4}, Lf4/c;->c(Lf4/b;)V

    goto :goto_35

    :cond_54
    move-object/from16 v9, v49

    move-object/from16 v8, v50

    move-object/from16 v5, v56

    move-object/from16 v6, v57

    const/high16 v7, 0x3f800000    # 1.0f

    iget v2, v0, Lm4/e;->C:F

    invoke-virtual {v1}, Lf4/c;->l()Lf4/b;

    move-result-object v4

    iget-object v10, v4, Lf4/b;->d:Lf4/a;

    invoke-virtual {v10, v8, v3}, Lf4/a;->g(Lf4/f;F)V

    iget-object v3, v4, Lf4/b;->d:Lf4/a;

    invoke-virtual {v3, v9, v7}, Lf4/a;->g(Lf4/f;F)V

    iget-object v3, v4, Lf4/b;->d:Lf4/a;

    invoke-virtual {v3, v6, v2}, Lf4/a;->g(Lf4/f;F)V

    iget-object v3, v4, Lf4/b;->d:Lf4/a;

    neg-float v2, v2

    invoke-virtual {v3, v5, v2}, Lf4/a;->g(Lf4/f;F)V

    invoke-virtual {v1, v4}, Lf4/c;->c(Lf4/b;)V

    :cond_55
    :goto_35
    invoke-virtual/range {v41 .. v41}, Lm4/d;->h()Z

    move-result v2

    if-eqz v2, :cond_56

    move-object/from16 v2, v41

    iget-object v3, v2, Lm4/d;->f:Lm4/d;

    iget-object v3, v3, Lm4/d;->d:Lm4/e;

    iget v4, v0, Lm4/e;->E:F

    const/high16 v5, 0x42b40000    # 90.0f

    add-float/2addr v4, v5

    float-to-double v4, v4

    invoke-static {v4, v5}, Ljava/lang/Math;->toRadians(D)D

    move-result-wide v4

    double-to-float v4, v4

    invoke-virtual {v2}, Lm4/d;->e()I

    move-result v2

    const/4 v15, 0x2

    invoke-virtual {v0, v15}, Lm4/e;->j(I)Lm4/d;

    move-result-object v5

    invoke-virtual {v1, v5}, Lf4/c;->k(Ljava/lang/Object;)Lf4/f;

    move-result-object v5

    const/4 v7, 0x3

    invoke-virtual {v0, v7}, Lm4/e;->j(I)Lm4/d;

    move-result-object v6

    invoke-virtual {v1, v6}, Lf4/c;->k(Ljava/lang/Object;)Lf4/f;

    move-result-object v6

    const/4 v8, 0x4

    invoke-virtual {v0, v8}, Lm4/e;->j(I)Lm4/d;

    move-result-object v9

    invoke-virtual {v1, v9}, Lf4/c;->k(Ljava/lang/Object;)Lf4/f;

    move-result-object v9

    const/4 v10, 0x5

    invoke-virtual {v0, v10}, Lm4/e;->j(I)Lm4/d;

    move-result-object v11

    invoke-virtual {v1, v11}, Lf4/c;->k(Ljava/lang/Object;)Lf4/f;

    move-result-object v11

    invoke-virtual {v3, v15}, Lm4/e;->j(I)Lm4/d;

    move-result-object v12

    invoke-virtual {v1, v12}, Lf4/c;->k(Ljava/lang/Object;)Lf4/f;

    move-result-object v12

    invoke-virtual {v3, v7}, Lm4/e;->j(I)Lm4/d;

    move-result-object v7

    invoke-virtual {v1, v7}, Lf4/c;->k(Ljava/lang/Object;)Lf4/f;

    move-result-object v7

    invoke-virtual {v3, v8}, Lm4/e;->j(I)Lm4/d;

    move-result-object v8

    invoke-virtual {v1, v8}, Lf4/c;->k(Ljava/lang/Object;)Lf4/f;

    move-result-object v8

    invoke-virtual {v3, v10}, Lm4/e;->j(I)Lm4/d;

    move-result-object v3

    invoke-virtual {v1, v3}, Lf4/c;->k(Ljava/lang/Object;)Lf4/f;

    move-result-object v3

    invoke-virtual {v1}, Lf4/c;->l()Lf4/b;

    move-result-object v10

    float-to-double v13, v4

    invoke-static {v13, v14}, Ljava/lang/Math;->sin(D)D

    move-result-wide v15

    move-wide/from16 v17, v13

    int-to-double v13, v2

    move-wide/from16 v19, v13

    mul-double v13, v15, v19

    double-to-float v2, v13

    iget-object v4, v10, Lf4/b;->d:Lf4/a;

    const/high16 v13, 0x3f000000    # 0.5f

    invoke-virtual {v4, v7, v13}, Lf4/a;->g(Lf4/f;F)V

    iget-object v4, v10, Lf4/b;->d:Lf4/a;

    invoke-virtual {v4, v3, v13}, Lf4/a;->g(Lf4/f;F)V

    iget-object v3, v10, Lf4/b;->d:Lf4/a;

    const/high16 v4, -0x41000000    # -0.5f

    invoke-virtual {v3, v6, v4}, Lf4/a;->g(Lf4/f;F)V

    iget-object v3, v10, Lf4/b;->d:Lf4/a;

    invoke-virtual {v3, v11, v4}, Lf4/a;->g(Lf4/f;F)V

    neg-float v2, v2

    iput v2, v10, Lf4/b;->b:F

    invoke-virtual {v1, v10}, Lf4/c;->c(Lf4/b;)V

    invoke-virtual {v1}, Lf4/c;->l()Lf4/b;

    move-result-object v2

    invoke-static/range {v17 .. v18}, Ljava/lang/Math;->cos(D)D

    move-result-wide v6

    mul-double v6, v6, v19

    double-to-float v3, v6

    iget-object v6, v2, Lf4/b;->d:Lf4/a;

    invoke-virtual {v6, v12, v13}, Lf4/a;->g(Lf4/f;F)V

    iget-object v6, v2, Lf4/b;->d:Lf4/a;

    invoke-virtual {v6, v8, v13}, Lf4/a;->g(Lf4/f;F)V

    iget-object v6, v2, Lf4/b;->d:Lf4/a;

    invoke-virtual {v6, v5, v4}, Lf4/a;->g(Lf4/f;F)V

    iget-object v5, v2, Lf4/b;->d:Lf4/a;

    invoke-virtual {v5, v9, v4}, Lf4/a;->g(Lf4/f;F)V

    neg-float v3, v3

    iput v3, v2, Lf4/b;->b:F

    invoke-virtual {v1, v2}, Lf4/c;->c(Lf4/b;)V

    :cond_56
    const/4 v2, 0x0

    iput-boolean v2, v0, Lm4/e;->l:Z

    iput-boolean v2, v0, Lm4/e;->m:Z

    return-void
.end method

.method public d()Z
    .locals 2

    iget v0, p0, Lm4/e;->h0:I

    const/16 v1, 0x8

    if-eq v0, v1, :cond_0

    const/4 v0, 0x1

    return v0

    :cond_0
    const/4 v0, 0x0

    return v0
.end method

.method public final e(Lf4/c;ZZZZLf4/f;Lf4/f;IZLm4/d;Lm4/d;IIIIFZZZZZIIIIFZ)V
    .locals 29

    move-object/from16 v0, p0

    move-object/from16 v1, p1

    move-object/from16 v12, p10

    move-object/from16 v13, p11

    move/from16 v14, p14

    move/from16 v2, p15

    move/from16 v4, p24

    move/from16 v5, p25

    move/from16 v6, p26

    invoke-virtual {v1, v12}, Lf4/c;->k(Ljava/lang/Object;)Lf4/f;

    move-result-object v7

    invoke-virtual {v1, v13}, Lf4/c;->k(Ljava/lang/Object;)Lf4/f;

    move-result-object v8

    iget-object v9, v12, Lm4/d;->f:Lm4/d;

    invoke-virtual {v1, v9}, Lf4/c;->k(Ljava/lang/Object;)Lf4/f;

    move-result-object v9

    iget-object v15, v13, Lm4/d;->f:Lm4/d;

    invoke-virtual {v1, v15}, Lf4/c;->k(Ljava/lang/Object;)Lf4/f;

    move-result-object v15

    invoke-virtual {v12}, Lm4/d;->h()Z

    move-result v16

    invoke-virtual {v13}, Lm4/d;->h()Z

    move-result v17

    iget-object v11, v0, Lm4/e;->Q:Lm4/d;

    invoke-virtual {v11}, Lm4/d;->h()Z

    move-result v11

    if-eqz v17, :cond_0

    add-int/lit8 v18, v16, 0x1

    goto :goto_0

    :cond_0
    move/from16 v18, v16

    :goto_0
    if-eqz v11, :cond_1

    add-int/lit8 v18, v18, 0x1

    :cond_1
    move/from16 v19, v11

    move/from16 v11, v18

    if-eqz p17, :cond_2

    const/4 v3, 0x3

    goto :goto_1

    :cond_2
    move/from16 v3, p22

    :goto_1
    invoke-static/range {p8 .. p8}, Le4/p;->e(I)I

    move-result v13

    const/4 v10, 0x1

    move-object/from16 v20, v15

    if-eqz v13, :cond_3

    if-eq v13, v10, :cond_3

    const/4 v10, 0x2

    if-eq v13, v10, :cond_4

    :cond_3
    const/4 v10, 0x0

    goto :goto_2

    :cond_4
    const/4 v10, 0x4

    if-eq v3, v10, :cond_3

    const/4 v10, 0x1

    :goto_2
    iget v13, v0, Lm4/e;->h:I

    const/4 v15, -0x1

    if-eq v13, v15, :cond_5

    if-eqz p2, :cond_5

    iput v15, v0, Lm4/e;->h:I

    const/16 p13, 0x0

    goto :goto_3

    :cond_5
    move/from16 v13, p13

    move/from16 p13, v10

    :goto_3
    iget v10, v0, Lm4/e;->i:I

    if-eq v10, v15, :cond_6

    if-nez p2, :cond_6

    iput v15, v0, Lm4/e;->i:I

    move v13, v10

    const/4 v10, 0x0

    goto :goto_4

    :cond_6
    move/from16 v10, p13

    :goto_4
    iget v15, v0, Lm4/e;->h0:I

    move/from16 p13, v10

    const/16 v10, 0x8

    if-ne v15, v10, :cond_7

    const/4 v13, 0x0

    const/4 v15, 0x0

    goto :goto_5

    :cond_7
    move v15, v13

    move/from16 v13, p13

    :goto_5
    if-eqz p27, :cond_a

    if-nez v16, :cond_9

    if-nez v17, :cond_9

    if-nez v19, :cond_9

    move/from16 v10, p12

    invoke-virtual {v1, v7, v10}, Lf4/c;->d(Lf4/f;I)V

    :cond_8
    move/from16 v24, v13

    const/16 v13, 0x8

    goto :goto_6

    :cond_9
    if-eqz v16, :cond_8

    if-nez v17, :cond_8

    invoke-virtual {v12}, Lm4/d;->e()I

    move-result v10

    move/from16 v24, v13

    const/16 v13, 0x8

    invoke-virtual {v1, v7, v9, v10, v13}, Lf4/c;->e(Lf4/f;Lf4/f;II)V

    goto :goto_6

    :cond_a
    move/from16 v24, v13

    move v13, v10

    :goto_6
    if-nez v24, :cond_e

    if-eqz p9, :cond_c

    const/4 v6, 0x3

    const/4 v10, 0x0

    invoke-virtual {v1, v8, v7, v10, v6}, Lf4/c;->e(Lf4/f;Lf4/f;II)V

    if-lez v14, :cond_b

    invoke-virtual {v1, v8, v7, v14, v13}, Lf4/c;->f(Lf4/f;Lf4/f;II)V

    :cond_b
    const v6, 0x7fffffff

    if-ge v2, v6, :cond_d

    invoke-virtual {v1, v8, v7, v2, v13}, Lf4/c;->g(Lf4/f;Lf4/f;II)V

    goto :goto_7

    :cond_c
    invoke-virtual {v1, v8, v7, v15, v13}, Lf4/c;->e(Lf4/f;Lf4/f;II)V

    :cond_d
    :goto_7
    move/from16 v10, p5

    move v13, v4

    goto/16 :goto_b

    :cond_e
    const/4 v10, 0x2

    if-eq v11, v10, :cond_11

    if-nez p17, :cond_11

    const/4 v2, 0x1

    if-eq v3, v2, :cond_f

    if-nez v3, :cond_11

    :cond_f
    invoke-static {v4, v15}, Ljava/lang/Math;->max(II)I

    move-result v2

    if-lez v5, :cond_10

    invoke-static {v5, v2}, Ljava/lang/Math;->min(II)I

    move-result v2

    :cond_10
    const/16 v13, 0x8

    invoke-virtual {v1, v8, v7, v2, v13}, Lf4/c;->e(Lf4/f;Lf4/f;II)V

    move/from16 v10, p5

    move v13, v4

    const/16 v24, 0x0

    goto/16 :goto_b

    :cond_11
    const/4 v2, -0x2

    if-ne v4, v2, :cond_12

    move v4, v15

    :cond_12
    if-ne v5, v2, :cond_13

    move v5, v15

    :cond_13
    if-lez v15, :cond_14

    const/4 v2, 0x1

    if-eq v3, v2, :cond_14

    const/4 v15, 0x0

    :cond_14
    const/16 v13, 0x8

    if-lez v4, :cond_15

    invoke-virtual {v1, v8, v7, v4, v13}, Lf4/c;->f(Lf4/f;Lf4/f;II)V

    invoke-static {v15, v4}, Ljava/lang/Math;->max(II)I

    move-result v15

    :cond_15
    const/4 v2, 0x1

    if-lez v5, :cond_17

    if-eqz p3, :cond_16

    if-ne v3, v2, :cond_16

    goto :goto_8

    :cond_16
    invoke-virtual {v1, v8, v7, v5, v13}, Lf4/c;->g(Lf4/f;Lf4/f;II)V

    :goto_8
    invoke-static {v15, v5}, Ljava/lang/Math;->min(II)I

    move-result v15

    :cond_17
    if-ne v3, v2, :cond_1a

    if-eqz p3, :cond_18

    invoke-virtual {v1, v8, v7, v15, v13}, Lf4/c;->e(Lf4/f;Lf4/f;II)V

    const/4 v2, 0x5

    goto :goto_7

    :cond_18
    if-eqz p19, :cond_19

    const/4 v2, 0x5

    invoke-virtual {v1, v8, v7, v15, v2}, Lf4/c;->e(Lf4/f;Lf4/f;II)V

    invoke-virtual {v1, v8, v7, v15, v13}, Lf4/c;->g(Lf4/f;Lf4/f;II)V

    goto :goto_7

    :cond_19
    const/4 v2, 0x5

    invoke-virtual {v1, v8, v7, v15, v2}, Lf4/c;->e(Lf4/f;Lf4/f;II)V

    invoke-virtual {v1, v8, v7, v15, v13}, Lf4/c;->g(Lf4/f;Lf4/f;II)V

    goto :goto_7

    :cond_1a
    const/4 v2, 0x5

    const/4 v10, 0x2

    if-ne v3, v10, :cond_1e

    iget v13, v12, Lm4/d;->e:I

    const/4 v15, 0x3

    if-eq v13, v15, :cond_1b

    if-ne v13, v2, :cond_1c

    :cond_1b
    const/4 v13, 0x4

    goto :goto_9

    :cond_1c
    iget-object v2, v0, Lm4/e;->U:Lm4/f;

    invoke-virtual {v2, v10}, Lm4/e;->j(I)Lm4/d;

    move-result-object v2

    invoke-virtual {v1, v2}, Lf4/c;->k(Ljava/lang/Object;)Lf4/f;

    move-result-object v2

    iget-object v10, v0, Lm4/e;->U:Lm4/f;

    const/4 v13, 0x4

    invoke-virtual {v10, v13}, Lm4/e;->j(I)Lm4/d;

    move-result-object v10

    invoke-virtual {v1, v10}, Lf4/c;->k(Ljava/lang/Object;)Lf4/f;

    move-result-object v10

    goto :goto_a

    :goto_9
    iget-object v2, v0, Lm4/e;->U:Lm4/f;

    const/4 v15, 0x3

    invoke-virtual {v2, v15}, Lm4/e;->j(I)Lm4/d;

    move-result-object v2

    invoke-virtual {v1, v2}, Lf4/c;->k(Ljava/lang/Object;)Lf4/f;

    move-result-object v2

    iget-object v10, v0, Lm4/e;->U:Lm4/f;

    const/4 v15, 0x5

    invoke-virtual {v10, v15}, Lm4/e;->j(I)Lm4/d;

    move-result-object v10

    invoke-virtual {v1, v10}, Lf4/c;->k(Ljava/lang/Object;)Lf4/f;

    move-result-object v10

    :goto_a
    invoke-virtual {v1}, Lf4/c;->l()Lf4/b;

    move-result-object v15

    iget-object v13, v15, Lf4/b;->d:Lf4/a;

    move/from16 p9, v4

    const/high16 v4, -0x40800000    # -1.0f

    invoke-virtual {v13, v8, v4}, Lf4/a;->g(Lf4/f;F)V

    iget-object v4, v15, Lf4/b;->d:Lf4/a;

    const/high16 v13, 0x3f800000    # 1.0f

    invoke-virtual {v4, v7, v13}, Lf4/a;->g(Lf4/f;F)V

    iget-object v4, v15, Lf4/b;->d:Lf4/a;

    invoke-virtual {v4, v10, v6}, Lf4/a;->g(Lf4/f;F)V

    iget-object v4, v15, Lf4/b;->d:Lf4/a;

    neg-float v6, v6

    invoke-virtual {v4, v2, v6}, Lf4/a;->g(Lf4/f;F)V

    invoke-virtual {v1, v15}, Lf4/c;->c(Lf4/b;)V

    if-eqz p3, :cond_1d

    const/16 v24, 0x0

    :cond_1d
    move/from16 v10, p5

    move/from16 v13, p9

    goto :goto_b

    :cond_1e
    move/from16 p9, v4

    move/from16 v13, p9

    const/4 v10, 0x1

    :goto_b
    if-eqz p27, :cond_1f

    if-eqz p19, :cond_20

    :cond_1f
    move-object/from16 v15, p6

    move-object/from16 v4, p7

    move-object v2, v7

    move-object v7, v8

    move/from16 p5, v10

    const/4 v3, 0x3

    const/4 v10, 0x2

    goto/16 :goto_2c

    :cond_20
    if-nez v16, :cond_21

    if-nez v17, :cond_21

    if-nez v19, :cond_21

    move-object/from16 v13, p11

    move-object v7, v8

    move/from16 p5, v10

    move-object/from16 v6, v20

    :goto_c
    const/4 v4, 0x5

    goto/16 :goto_28

    :cond_21
    if-eqz v16, :cond_23

    if-nez v17, :cond_23

    iget-object v2, v12, Lm4/d;->f:Lm4/d;

    iget-object v2, v2, Lm4/d;->d:Lm4/e;

    if-eqz p3, :cond_22

    instance-of v2, v2, Lm4/b;

    if-eqz v2, :cond_22

    const/16 v2, 0x8

    goto :goto_d

    :cond_22
    const/4 v2, 0x5

    :goto_d
    move-object/from16 v13, p11

    move-object v7, v8

    move/from16 p5, v10

    move-object/from16 v6, v20

    move/from16 v20, p3

    move v10, v2

    goto/16 :goto_29

    :cond_23
    if-nez v16, :cond_25

    if-eqz v17, :cond_25

    invoke-virtual/range {p11 .. p11}, Lm4/d;->e()I

    move-result v2

    neg-int v2, v2

    move-object/from16 v6, v20

    const/16 v13, 0x8

    invoke-virtual {v1, v8, v6, v2, v13}, Lf4/c;->e(Lf4/f;Lf4/f;II)V

    if-eqz p3, :cond_24

    move-object/from16 v15, p6

    const/4 v2, 0x5

    const/4 v3, 0x0

    invoke-virtual {v1, v7, v15, v3, v2}, Lf4/c;->f(Lf4/f;Lf4/f;II)V

    move-object/from16 v13, p11

    move v4, v2

    move-object v7, v8

    move/from16 p5, v10

    goto/16 :goto_28

    :cond_24
    move-object/from16 v13, p11

    move-object v7, v8

    move/from16 p5, v10

    goto :goto_c

    :cond_25
    move-object/from16 v15, p6

    move-object/from16 v6, v20

    if-eqz v16, :cond_24

    if-eqz v17, :cond_24

    iget-object v2, v12, Lm4/d;->f:Lm4/d;

    iget-object v11, v2, Lm4/d;->d:Lm4/e;

    move-object/from16 v2, p11

    iget-object v4, v2, Lm4/d;->f:Lm4/d;

    iget-object v4, v4, Lm4/d;->d:Lm4/e;

    move/from16 p5, v10

    iget-object v10, v0, Lm4/e;->U:Lm4/f;

    const/16 v16, 0x6

    if-eqz v24, :cond_3a

    if-nez v3, :cond_2a

    if-nez v5, :cond_27

    if-nez v13, :cond_27

    iget-boolean v5, v9, Lf4/f;->F:Z

    if-eqz v5, :cond_26

    iget-boolean v5, v6, Lf4/f;->F:Z

    if-eqz v5, :cond_26

    invoke-virtual {v12}, Lm4/d;->e()I

    move-result v3

    const/16 v13, 0x8

    invoke-virtual {v1, v7, v9, v3, v13}, Lf4/c;->e(Lf4/f;Lf4/f;II)V

    invoke-virtual {v2}, Lm4/d;->e()I

    move-result v2

    neg-int v2, v2

    invoke-virtual {v1, v8, v6, v2, v13}, Lf4/c;->e(Lf4/f;Lf4/f;II)V

    return-void

    :cond_26
    const/16 v5, 0x8

    const/16 v17, 0x8

    const/16 v19, 0x0

    const/16 v20, 0x1

    const/16 v23, 0x0

    goto :goto_e

    :cond_27
    const/4 v5, 0x5

    const/16 v17, 0x5

    const/16 v19, 0x1

    const/16 v20, 0x0

    const/16 v23, 0x1

    :goto_e
    instance-of v1, v11, Lm4/b;

    if-nez v1, :cond_29

    instance-of v1, v4, Lm4/b;

    if-eqz v1, :cond_28

    goto :goto_10

    :cond_28
    move-object/from16 v1, p1

    move-object v2, v7

    move-object v7, v8

    move/from16 v25, v20

    move v8, v5

    move-object v5, v9

    move/from16 v9, v16

    move/from16 v20, v19

    move/from16 v19, v17

    move/from16 v17, v3

    :goto_f
    move-object/from16 v3, p7

    goto/16 :goto_1d

    :cond_29
    :goto_10
    move-object/from16 v1, p1

    move/from16 v17, v3

    move-object v2, v7

    move-object v7, v8

    move/from16 v25, v20

    move-object/from16 v3, p7

    move v8, v5

    move-object v5, v9

    move/from16 v9, v16

    move/from16 v20, v19

    const/16 v19, 0x4

    goto/16 :goto_1d

    :cond_2a
    const/4 v1, 0x2

    if-ne v3, v1, :cond_2d

    instance-of v1, v11, Lm4/b;

    if-nez v1, :cond_2c

    instance-of v1, v4, Lm4/b;

    if-eqz v1, :cond_2b

    goto :goto_12

    :cond_2b
    move-object/from16 v1, p1

    move/from16 v17, v3

    move-object v2, v7

    move-object v7, v8

    move-object v5, v9

    move/from16 v9, v16

    const/4 v8, 0x5

    const/16 v19, 0x5

    :goto_11
    const/16 v20, 0x1

    const/16 v23, 0x1

    const/16 v25, 0x0

    goto :goto_f

    :cond_2c
    :goto_12
    move-object/from16 v1, p1

    move/from16 v17, v3

    move-object v2, v7

    move-object v7, v8

    move-object v5, v9

    move/from16 v9, v16

    const/4 v8, 0x5

    :goto_13
    const/16 v19, 0x4

    goto :goto_11

    :cond_2d
    const/4 v1, 0x1

    if-ne v3, v1, :cond_2e

    move-object/from16 v1, p1

    move/from16 v17, v3

    move-object v2, v7

    move-object v7, v8

    move-object v5, v9

    move/from16 v9, v16

    const/16 v8, 0x8

    goto :goto_13

    :cond_2e
    const/4 v1, 0x3

    if-ne v3, v1, :cond_39

    iget v1, v0, Lm4/e;->B:I

    move/from16 v17, v3

    const/4 v3, -0x1

    if-ne v1, v3, :cond_31

    if-eqz p20, :cond_30

    move-object/from16 v1, p1

    move-object/from16 v3, p7

    move-object v2, v7

    move-object v7, v8

    move-object v5, v9

    const/16 v8, 0x8

    if-eqz p3, :cond_2f

    const/4 v9, 0x5

    :goto_14
    const/16 v19, 0x5

    :goto_15
    const/16 v20, 0x1

    const/16 v23, 0x1

    const/16 v25, 0x1

    goto/16 :goto_1d

    :cond_2f
    const/4 v9, 0x4

    goto :goto_14

    :cond_30
    move-object/from16 v1, p1

    move-object/from16 v3, p7

    move-object v2, v7

    move-object v7, v8

    move-object v5, v9

    const/16 v8, 0x8

    const/16 v9, 0x8

    goto :goto_14

    :cond_31
    if-eqz p17, :cond_34

    move/from16 v3, p23

    const/4 v1, 0x2

    if-eq v3, v1, :cond_33

    const/4 v1, 0x1

    if-ne v3, v1, :cond_32

    goto :goto_16

    :cond_32
    const/16 v1, 0x8

    const/4 v3, 0x5

    goto :goto_17

    :cond_33
    :goto_16
    const/4 v1, 0x5

    const/4 v3, 0x4

    :goto_17
    move/from16 v19, v3

    move-object v2, v7

    move-object v7, v8

    move-object v5, v9

    move/from16 v9, v16

    const/16 v20, 0x1

    const/16 v23, 0x1

    const/16 v25, 0x1

    move-object/from16 v3, p7

    :goto_18
    move v8, v1

    move-object/from16 v1, p1

    goto/16 :goto_1d

    :cond_34
    if-lez v5, :cond_35

    move-object/from16 v1, p1

    move-object/from16 v3, p7

    move-object v2, v7

    move-object v7, v8

    move-object v5, v9

    move/from16 v9, v16

    const/4 v8, 0x5

    goto :goto_14

    :cond_35
    if-nez v5, :cond_38

    if-nez v13, :cond_38

    if-nez p20, :cond_36

    move-object/from16 v1, p1

    move-object/from16 v3, p7

    move-object v2, v7

    move-object v7, v8

    move-object v5, v9

    move/from16 v9, v16

    const/4 v8, 0x5

    const/16 v19, 0x8

    goto :goto_15

    :cond_36
    if-eq v11, v10, :cond_37

    if-eq v4, v10, :cond_37

    const/4 v1, 0x4

    goto :goto_19

    :cond_37
    const/4 v1, 0x5

    :goto_19
    move-object/from16 v3, p7

    move-object v2, v7

    move-object v7, v8

    move-object v5, v9

    move/from16 v9, v16

    const/16 v19, 0x4

    const/16 v20, 0x1

    const/16 v23, 0x1

    const/16 v25, 0x1

    goto :goto_18

    :cond_38
    move-object/from16 v1, p1

    move-object/from16 v3, p7

    move-object v2, v7

    move-object v7, v8

    move-object v5, v9

    move/from16 v9, v16

    const/4 v8, 0x5

    const/16 v19, 0x4

    goto :goto_15

    :cond_39
    move/from16 v17, v3

    move-object/from16 v1, p1

    move-object/from16 v3, p7

    move-object v2, v7

    move-object v7, v8

    move-object v5, v9

    move/from16 v9, v16

    const/4 v8, 0x5

    const/16 v19, 0x4

    const/16 v20, 0x0

    const/16 v23, 0x0

    :goto_1a
    const/16 v25, 0x0

    goto :goto_1d

    :cond_3a
    move/from16 v17, v3

    iget-boolean v1, v9, Lf4/f;->F:Z

    if-eqz v1, :cond_3c

    iget-boolean v1, v6, Lf4/f;->F:Z

    if-eqz v1, :cond_3c

    invoke-virtual {v12}, Lm4/d;->e()I

    move-result v1

    invoke-virtual {v2}, Lm4/d;->e()I

    move-result v3

    const/16 v4, 0x8

    move-object/from16 p17, p1

    move/from16 p21, p16

    move/from16 p20, v1

    move/from16 p24, v3

    move/from16 p25, v4

    move-object/from16 p22, v6

    move-object/from16 p18, v7

    move-object/from16 p23, v8

    move-object/from16 p19, v9

    invoke-virtual/range {p17 .. p25}, Lf4/c;->b(Lf4/f;Lf4/f;IFLf4/f;Lf4/f;II)V

    move-object/from16 v1, p17

    move-object/from16 v7, p23

    if-eqz p3, :cond_5b

    if-eqz p5, :cond_5b

    iget-object v3, v2, Lm4/d;->f:Lm4/d;

    if-eqz v3, :cond_3b

    invoke-virtual {v2}, Lm4/d;->e()I

    move-result v15

    :goto_1b
    move-object/from16 v3, p7

    goto :goto_1c

    :cond_3b
    const/4 v15, 0x0

    goto :goto_1b

    :goto_1c
    if-eq v6, v3, :cond_5b

    const/4 v2, 0x5

    invoke-virtual {v1, v3, v7, v15, v2}, Lf4/c;->f(Lf4/f;Lf4/f;II)V

    return-void

    :cond_3c
    move-object/from16 v1, p1

    move-object/from16 v3, p7

    move-object v2, v7

    move-object v7, v8

    move-object v5, v9

    move/from16 v9, v16

    const/4 v8, 0x5

    const/16 v19, 0x4

    const/16 v20, 0x1

    const/16 v23, 0x1

    goto :goto_1a

    :goto_1d
    if-eqz v23, :cond_3d

    if-ne v5, v6, :cond_3d

    if-eq v11, v10, :cond_3d

    const/16 v23, 0x0

    const/16 v26, 0x0

    goto :goto_1e

    :cond_3d
    const/16 v26, 0x1

    :goto_1e
    if-eqz v20, :cond_3f

    if-nez v24, :cond_3e

    if-nez p18, :cond_3e

    if-nez p20, :cond_3e

    if-ne v5, v15, :cond_3e

    if-ne v6, v3, :cond_3e

    const/16 v9, 0x8

    const/16 v20, 0x0

    const/16 v26, 0x8

    const/16 v27, 0x0

    :goto_1f
    move-object v8, v4

    goto :goto_20

    :cond_3e
    move/from16 v20, p3

    move/from16 v27, v26

    move/from16 v26, v8

    goto :goto_1f

    :goto_20
    invoke-virtual {v12}, Lm4/d;->e()I

    move-result v4

    move-object/from16 v28, v8

    invoke-virtual/range {p11 .. p11}, Lm4/d;->e()I

    move-result v8

    move-object v3, v5

    move/from16 p8, v13

    move/from16 v14, v17

    move-object/from16 v12, v28

    move-object/from16 v13, p11

    move/from16 v5, p16

    invoke-virtual/range {v1 .. v9}, Lf4/c;->b(Lf4/f;Lf4/f;IFLf4/f;Lf4/f;II)V

    move-object v5, v3

    move/from16 v8, v26

    move/from16 v26, v27

    goto :goto_21

    :cond_3f
    move-object v12, v4

    move/from16 p8, v13

    move/from16 v14, v17

    move-object/from16 v13, p11

    move/from16 v20, p3

    :goto_21
    iget v3, v0, Lm4/e;->h0:I

    const/16 v4, 0x8

    if-ne v3, v4, :cond_41

    iget-object v3, v13, Lm4/d;->a:Ljava/util/HashSet;

    if-nez v3, :cond_40

    goto/16 :goto_30

    :cond_40
    invoke-virtual {v3}, Ljava/util/HashSet;->size()I

    move-result v3

    if-lez v3, :cond_5b

    :cond_41
    if-eqz v23, :cond_44

    if-eqz v20, :cond_43

    if-eq v5, v6, :cond_43

    if-nez v24, :cond_43

    instance-of v3, v11, Lm4/b;

    if-nez v3, :cond_42

    instance-of v3, v12, Lm4/b;

    if-eqz v3, :cond_43

    :cond_42
    move/from16 v8, v16

    :cond_43
    invoke-virtual/range {p10 .. p10}, Lm4/d;->e()I

    move-result v3

    invoke-virtual {v1, v2, v5, v3, v8}, Lf4/c;->f(Lf4/f;Lf4/f;II)V

    invoke-virtual {v13}, Lm4/d;->e()I

    move-result v3

    neg-int v3, v3

    invoke-virtual {v1, v7, v6, v3, v8}, Lf4/c;->g(Lf4/f;Lf4/f;II)V

    :cond_44
    if-eqz v20, :cond_45

    if-eqz p21, :cond_45

    instance-of v3, v11, Lm4/b;

    if-nez v3, :cond_45

    instance-of v3, v12, Lm4/b;

    if-nez v3, :cond_45

    if-eq v12, v10, :cond_45

    move/from16 v3, v16

    move v8, v3

    const/16 v21, 0x1

    goto :goto_22

    :cond_45
    move/from16 v3, v19

    move/from16 v21, v26

    :goto_22
    if-eqz v21, :cond_51

    if-eqz v25, :cond_4e

    if-eqz p20, :cond_46

    if-eqz p4, :cond_4e

    :cond_46
    if-eq v11, v10, :cond_48

    if-ne v12, v10, :cond_47

    goto :goto_23

    :cond_47
    move/from16 v16, v3

    :cond_48
    :goto_23
    instance-of v4, v11, Lm4/i;

    if-nez v4, :cond_49

    instance-of v4, v12, Lm4/i;

    if-eqz v4, :cond_4a

    :cond_49
    const/16 v16, 0x5

    :cond_4a
    instance-of v4, v11, Lm4/b;

    if-nez v4, :cond_4b

    instance-of v4, v12, Lm4/b;

    if-eqz v4, :cond_4c

    :cond_4b
    const/16 v16, 0x5

    :cond_4c
    if-eqz p20, :cond_4d

    const/4 v4, 0x5

    goto :goto_24

    :cond_4d
    move/from16 v4, v16

    :goto_24
    invoke-static {v4, v3}, Ljava/lang/Math;->max(II)I

    move-result v3

    :cond_4e
    if-eqz v20, :cond_50

    invoke-static {v8, v3}, Ljava/lang/Math;->min(II)I

    move-result v3

    if-eqz p17, :cond_50

    if-nez p20, :cond_50

    if-eq v11, v10, :cond_4f

    if-ne v12, v10, :cond_50

    :cond_4f
    const/4 v10, 0x4

    goto :goto_25

    :cond_50
    move v10, v3

    :goto_25
    invoke-virtual/range {p10 .. p10}, Lm4/d;->e()I

    move-result v3

    invoke-virtual {v1, v2, v5, v3, v10}, Lf4/c;->e(Lf4/f;Lf4/f;II)V

    invoke-virtual {v13}, Lm4/d;->e()I

    move-result v3

    neg-int v3, v3

    invoke-virtual {v1, v7, v6, v3, v10}, Lf4/c;->e(Lf4/f;Lf4/f;II)V

    :cond_51
    if-eqz v20, :cond_53

    if-ne v15, v5, :cond_52

    invoke-virtual/range {p10 .. p10}, Lm4/d;->e()I

    move-result v3

    goto :goto_26

    :cond_52
    const/4 v3, 0x0

    :goto_26
    if-eq v5, v15, :cond_53

    const/4 v4, 0x5

    invoke-virtual {v1, v2, v15, v3, v4}, Lf4/c;->f(Lf4/f;Lf4/f;II)V

    :cond_53
    if-eqz v20, :cond_54

    if-eqz v24, :cond_54

    if-nez p14, :cond_54

    if-nez p8, :cond_54

    if-eqz v24, :cond_55

    const/4 v3, 0x3

    if-ne v14, v3, :cond_55

    const/16 v4, 0x8

    const/4 v10, 0x0

    invoke-virtual {v1, v7, v2, v10, v4}, Lf4/c;->f(Lf4/f;Lf4/f;II)V

    :cond_54
    const/4 v4, 0x5

    goto :goto_27

    :cond_55
    const/4 v10, 0x0

    const/4 v4, 0x5

    invoke-virtual {v1, v7, v2, v10, v4}, Lf4/c;->f(Lf4/f;Lf4/f;II)V

    :goto_27
    move v10, v4

    goto :goto_29

    :goto_28
    move/from16 v20, p3

    goto :goto_27

    :goto_29
    if-eqz v20, :cond_5b

    if-eqz p5, :cond_5b

    iget-object v2, v13, Lm4/d;->f:Lm4/d;

    if-eqz v2, :cond_56

    invoke-virtual {v13}, Lm4/d;->e()I

    move-result v15

    :goto_2a
    move-object/from16 v4, p7

    goto :goto_2b

    :cond_56
    const/4 v15, 0x0

    goto :goto_2a

    :goto_2b
    if-eq v6, v4, :cond_5b

    invoke-virtual {v1, v4, v7, v15, v10}, Lf4/c;->f(Lf4/f;Lf4/f;II)V

    return-void

    :goto_2c
    if-ge v11, v10, :cond_5b

    if-eqz p3, :cond_5b

    if-eqz p5, :cond_5b

    const/4 v10, 0x0

    const/16 v13, 0x8

    invoke-virtual {v1, v2, v15, v10, v13}, Lf4/c;->f(Lf4/f;Lf4/f;II)V

    iget-object v2, v0, Lm4/e;->N:Lm4/d;

    if-nez p2, :cond_58

    iget-object v5, v2, Lm4/d;->f:Lm4/d;

    if-nez v5, :cond_57

    goto :goto_2d

    :cond_57
    const/4 v10, 0x0

    goto :goto_2e

    :cond_58
    :goto_2d
    const/4 v10, 0x1

    :goto_2e
    if-nez p2, :cond_5a

    iget-object v2, v2, Lm4/d;->f:Lm4/d;

    if-eqz v2, :cond_5a

    iget-object v2, v2, Lm4/d;->d:Lm4/e;

    iget v5, v2, Lm4/e;->X:F

    const/4 v6, 0x0

    cmpl-float v5, v5, v6

    if-eqz v5, :cond_59

    iget-object v2, v2, Lm4/e;->q0:[I

    const/16 v22, 0x0

    aget v5, v2, v22

    if-ne v5, v3, :cond_59

    const/16 v21, 0x1

    aget v2, v2, v21

    if-ne v2, v3, :cond_59

    move/from16 v10, v21

    goto :goto_2f

    :cond_59
    const/4 v10, 0x0

    :cond_5a
    :goto_2f
    if-eqz v10, :cond_5b

    const/4 v10, 0x0

    const/16 v13, 0x8

    invoke-virtual {v1, v4, v7, v10, v13}, Lf4/c;->f(Lf4/f;Lf4/f;II)V

    :cond_5b
    :goto_30
    return-void
.end method

.method public final f(ILm4/e;II)V
    .locals 10

    const/16 v0, 0x9

    const/16 v1, 0x8

    const/4 v2, 0x2

    const/4 v3, 0x3

    const/4 v4, 0x4

    const/4 v5, 0x5

    const/4 v6, 0x0

    const/4 v7, 0x7

    if-ne p1, v7, :cond_c

    if-ne p3, v7, :cond_8

    invoke-virtual {p0, v2}, Lm4/e;->j(I)Lm4/d;

    move-result-object p1

    invoke-virtual {p0, v4}, Lm4/e;->j(I)Lm4/d;

    move-result-object p3

    invoke-virtual {p0, v3}, Lm4/e;->j(I)Lm4/d;

    move-result-object p4

    invoke-virtual {p0, v5}, Lm4/e;->j(I)Lm4/d;

    move-result-object v8

    const/4 v9, 0x1

    if-eqz p1, :cond_0

    invoke-virtual {p1}, Lm4/d;->h()Z

    move-result p1

    if-nez p1, :cond_1

    :cond_0
    if-eqz p3, :cond_2

    invoke-virtual {p3}, Lm4/d;->h()Z

    move-result p1

    if-eqz p1, :cond_2

    :cond_1
    move p1, v6

    goto :goto_0

    :cond_2
    invoke-virtual {p0, v2, p2, v2, v6}, Lm4/e;->f(ILm4/e;II)V

    invoke-virtual {p0, v4, p2, v4, v6}, Lm4/e;->f(ILm4/e;II)V

    move p1, v9

    :goto_0
    if-eqz p4, :cond_3

    invoke-virtual {p4}, Lm4/d;->h()Z

    move-result p3

    if-nez p3, :cond_4

    :cond_3
    if-eqz v8, :cond_5

    invoke-virtual {v8}, Lm4/d;->h()Z

    move-result p3

    if-eqz p3, :cond_5

    :cond_4
    move v9, v6

    goto :goto_1

    :cond_5
    invoke-virtual {p0, v3, p2, v3, v6}, Lm4/e;->f(ILm4/e;II)V

    invoke-virtual {p0, v5, p2, v5, v6}, Lm4/e;->f(ILm4/e;II)V

    :goto_1
    if-eqz p1, :cond_6

    if-eqz v9, :cond_6

    invoke-virtual {p0, v7}, Lm4/e;->j(I)Lm4/d;

    move-result-object p1

    invoke-virtual {p2, v7}, Lm4/e;->j(I)Lm4/d;

    move-result-object p2

    invoke-virtual {p1, p2, v6}, Lm4/d;->a(Lm4/d;I)V

    return-void

    :cond_6
    if-eqz p1, :cond_7

    invoke-virtual {p0, v1}, Lm4/e;->j(I)Lm4/d;

    move-result-object p1

    invoke-virtual {p2, v1}, Lm4/e;->j(I)Lm4/d;

    move-result-object p2

    invoke-virtual {p1, p2, v6}, Lm4/d;->a(Lm4/d;I)V

    return-void

    :cond_7
    if-eqz v9, :cond_1c

    invoke-virtual {p0, v0}, Lm4/e;->j(I)Lm4/d;

    move-result-object p1

    invoke-virtual {p2, v0}, Lm4/e;->j(I)Lm4/d;

    move-result-object p2

    invoke-virtual {p1, p2, v6}, Lm4/d;->a(Lm4/d;I)V

    return-void

    :cond_8
    if-eq p3, v2, :cond_b

    if-ne p3, v4, :cond_9

    goto :goto_2

    :cond_9
    if-eq p3, v3, :cond_a

    if-ne p3, v5, :cond_1c

    :cond_a
    invoke-virtual {p0, v3, p2, p3, v6}, Lm4/e;->f(ILm4/e;II)V

    invoke-virtual {p0, v5, p2, p3, v6}, Lm4/e;->f(ILm4/e;II)V

    invoke-virtual {p0, v7}, Lm4/e;->j(I)Lm4/d;

    move-result-object p1

    invoke-virtual {p2, p3}, Lm4/e;->j(I)Lm4/d;

    move-result-object p2

    invoke-virtual {p1, p2, v6}, Lm4/d;->a(Lm4/d;I)V

    return-void

    :cond_b
    :goto_2
    invoke-virtual {p0, v2, p2, p3, v6}, Lm4/e;->f(ILm4/e;II)V

    invoke-virtual {p0, v4, p2, p3, v6}, Lm4/e;->f(ILm4/e;II)V

    invoke-virtual {p0, v7}, Lm4/e;->j(I)Lm4/d;

    move-result-object p1

    invoke-virtual {p2, p3}, Lm4/e;->j(I)Lm4/d;

    move-result-object p2

    invoke-virtual {p1, p2, v6}, Lm4/d;->a(Lm4/d;I)V

    return-void

    :cond_c
    if-ne p1, v1, :cond_e

    if-eq p3, v2, :cond_d

    if-ne p3, v4, :cond_e

    :cond_d
    invoke-virtual {p0, v2}, Lm4/e;->j(I)Lm4/d;

    move-result-object p1

    invoke-virtual {p2, p3}, Lm4/e;->j(I)Lm4/d;

    move-result-object p2

    invoke-virtual {p0, v4}, Lm4/e;->j(I)Lm4/d;

    move-result-object p3

    invoke-virtual {p1, p2, v6}, Lm4/d;->a(Lm4/d;I)V

    invoke-virtual {p3, p2, v6}, Lm4/d;->a(Lm4/d;I)V

    invoke-virtual {p0, v1}, Lm4/e;->j(I)Lm4/d;

    move-result-object p1

    invoke-virtual {p1, p2, v6}, Lm4/d;->a(Lm4/d;I)V

    return-void

    :cond_e
    if-ne p1, v0, :cond_10

    if-eq p3, v3, :cond_f

    if-ne p3, v5, :cond_10

    :cond_f
    invoke-virtual {p2, p3}, Lm4/e;->j(I)Lm4/d;

    move-result-object p1

    invoke-virtual {p0, v3}, Lm4/e;->j(I)Lm4/d;

    move-result-object p2

    invoke-virtual {p2, p1, v6}, Lm4/d;->a(Lm4/d;I)V

    invoke-virtual {p0, v5}, Lm4/e;->j(I)Lm4/d;

    move-result-object p2

    invoke-virtual {p2, p1, v6}, Lm4/d;->a(Lm4/d;I)V

    invoke-virtual {p0, v0}, Lm4/e;->j(I)Lm4/d;

    move-result-object p2

    invoke-virtual {p2, p1, v6}, Lm4/d;->a(Lm4/d;I)V

    return-void

    :cond_10
    if-ne p1, v1, :cond_11

    if-ne p3, v1, :cond_11

    invoke-virtual {p0, v2}, Lm4/e;->j(I)Lm4/d;

    move-result-object p1

    invoke-virtual {p2, v2}, Lm4/e;->j(I)Lm4/d;

    move-result-object p4

    invoke-virtual {p1, p4, v6}, Lm4/d;->a(Lm4/d;I)V

    invoke-virtual {p0, v4}, Lm4/e;->j(I)Lm4/d;

    move-result-object p1

    invoke-virtual {p2, v4}, Lm4/e;->j(I)Lm4/d;

    move-result-object p4

    invoke-virtual {p1, p4, v6}, Lm4/d;->a(Lm4/d;I)V

    invoke-virtual {p0, v1}, Lm4/e;->j(I)Lm4/d;

    move-result-object p1

    invoke-virtual {p2, p3}, Lm4/e;->j(I)Lm4/d;

    move-result-object p2

    invoke-virtual {p1, p2, v6}, Lm4/d;->a(Lm4/d;I)V

    return-void

    :cond_11
    if-ne p1, v0, :cond_12

    if-ne p3, v0, :cond_12

    invoke-virtual {p0, v3}, Lm4/e;->j(I)Lm4/d;

    move-result-object p1

    invoke-virtual {p2, v3}, Lm4/e;->j(I)Lm4/d;

    move-result-object p4

    invoke-virtual {p1, p4, v6}, Lm4/d;->a(Lm4/d;I)V

    invoke-virtual {p0, v5}, Lm4/e;->j(I)Lm4/d;

    move-result-object p1

    invoke-virtual {p2, v5}, Lm4/e;->j(I)Lm4/d;

    move-result-object p4

    invoke-virtual {p1, p4, v6}, Lm4/d;->a(Lm4/d;I)V

    invoke-virtual {p0, v0}, Lm4/e;->j(I)Lm4/d;

    move-result-object p1

    invoke-virtual {p2, p3}, Lm4/e;->j(I)Lm4/d;

    move-result-object p2

    invoke-virtual {p1, p2, v6}, Lm4/d;->a(Lm4/d;I)V

    return-void

    :cond_12
    invoke-virtual {p0, p1}, Lm4/e;->j(I)Lm4/d;

    move-result-object v6

    invoke-virtual {p2, p3}, Lm4/e;->j(I)Lm4/d;

    move-result-object p2

    invoke-virtual {v6, p2}, Lm4/d;->i(Lm4/d;)Z

    move-result p3

    if-eqz p3, :cond_1c

    const/4 p3, 0x6

    if-ne p1, p3, :cond_14

    invoke-virtual {p0, v3}, Lm4/e;->j(I)Lm4/d;

    move-result-object p1

    invoke-virtual {p0, v5}, Lm4/e;->j(I)Lm4/d;

    move-result-object p3

    if-eqz p1, :cond_13

    invoke-virtual {p1}, Lm4/d;->j()V

    :cond_13
    if-eqz p3, :cond_1b

    invoke-virtual {p3}, Lm4/d;->j()V

    goto :goto_4

    :cond_14
    if-eq p1, v3, :cond_18

    if-ne p1, v5, :cond_15

    goto :goto_3

    :cond_15
    if-eq p1, v2, :cond_16

    if-ne p1, v4, :cond_1b

    :cond_16
    invoke-virtual {p0, v7}, Lm4/e;->j(I)Lm4/d;

    move-result-object p3

    iget-object v0, p3, Lm4/d;->f:Lm4/d;

    if-eq v0, p2, :cond_17

    invoke-virtual {p3}, Lm4/d;->j()V

    :cond_17
    invoke-virtual {p0, p1}, Lm4/e;->j(I)Lm4/d;

    move-result-object p1

    invoke-virtual {p1}, Lm4/d;->f()Lm4/d;

    move-result-object p1

    invoke-virtual {p0, v1}, Lm4/e;->j(I)Lm4/d;

    move-result-object p3

    invoke-virtual {p3}, Lm4/d;->h()Z

    move-result v0

    if-eqz v0, :cond_1b

    invoke-virtual {p1}, Lm4/d;->j()V

    invoke-virtual {p3}, Lm4/d;->j()V

    goto :goto_4

    :cond_18
    :goto_3
    invoke-virtual {p0, p3}, Lm4/e;->j(I)Lm4/d;

    move-result-object p3

    if-eqz p3, :cond_19

    invoke-virtual {p3}, Lm4/d;->j()V

    :cond_19
    invoke-virtual {p0, v7}, Lm4/e;->j(I)Lm4/d;

    move-result-object p3

    iget-object v1, p3, Lm4/d;->f:Lm4/d;

    if-eq v1, p2, :cond_1a

    invoke-virtual {p3}, Lm4/d;->j()V

    :cond_1a
    invoke-virtual {p0, p1}, Lm4/e;->j(I)Lm4/d;

    move-result-object p1

    invoke-virtual {p1}, Lm4/d;->f()Lm4/d;

    move-result-object p1

    invoke-virtual {p0, v0}, Lm4/e;->j(I)Lm4/d;

    move-result-object p3

    invoke-virtual {p3}, Lm4/d;->h()Z

    move-result v0

    if-eqz v0, :cond_1b

    invoke-virtual {p1}, Lm4/d;->j()V

    invoke-virtual {p3}, Lm4/d;->j()V

    :cond_1b
    :goto_4
    invoke-virtual {v6, p2, p4}, Lm4/d;->a(Lm4/d;I)V

    :cond_1c
    return-void
.end method

.method public final g(Lm4/d;Lm4/d;I)V
    .locals 1

    iget-object v0, p1, Lm4/d;->d:Lm4/e;

    if-ne v0, p0, :cond_0

    iget p1, p1, Lm4/d;->e:I

    iget-object v0, p2, Lm4/d;->d:Lm4/e;

    iget p2, p2, Lm4/d;->e:I

    invoke-virtual {p0, p1, v0, p2, p3}, Lm4/e;->f(ILm4/e;II)V

    :cond_0
    return-void
.end method

.method public final h(Lf4/c;)V
    .locals 1

    iget-object v0, p0, Lm4/e;->J:Lm4/d;

    invoke-virtual {p1, v0}, Lf4/c;->k(Ljava/lang/Object;)Lf4/f;

    iget-object v0, p0, Lm4/e;->K:Lm4/d;

    invoke-virtual {p1, v0}, Lf4/c;->k(Ljava/lang/Object;)Lf4/f;

    iget-object v0, p0, Lm4/e;->L:Lm4/d;

    invoke-virtual {p1, v0}, Lf4/c;->k(Ljava/lang/Object;)Lf4/f;

    iget-object v0, p0, Lm4/e;->M:Lm4/d;

    invoke-virtual {p1, v0}, Lf4/c;->k(Ljava/lang/Object;)Lf4/f;

    iget v0, p0, Lm4/e;->b0:I

    if-lez v0, :cond_0

    iget-object v0, p0, Lm4/e;->N:Lm4/d;

    invoke-virtual {p1, v0}, Lf4/c;->k(Ljava/lang/Object;)Lf4/f;

    :cond_0
    return-void
.end method

.method public final i()V
    .locals 1

    iget-object v0, p0, Lm4/e;->d:Ln4/l;

    if-nez v0, :cond_0

    new-instance v0, Ln4/l;

    invoke-direct {v0, p0}, Ln4/l;-><init>(Lm4/e;)V

    iput-object v0, p0, Lm4/e;->d:Ln4/l;

    :cond_0
    iget-object v0, p0, Lm4/e;->e:Ln4/n;

    if-nez v0, :cond_1

    new-instance v0, Ln4/n;

    invoke-direct {v0, p0}, Ln4/n;-><init>(Lm4/e;)V

    iput-object v0, p0, Lm4/e;->e:Ln4/n;

    :cond_1
    return-void
.end method

.method public j(I)Lm4/d;
    .locals 1

    invoke-static {p1}, Le4/p;->e(I)I

    move-result v0

    packed-switch v0, :pswitch_data_0

    new-instance v0, Ljava/lang/AssertionError;

    invoke-static {p1}, Lm4/a;->C(I)Ljava/lang/String;

    move-result-object p1

    invoke-direct {v0, p1}, Ljava/lang/AssertionError;-><init>(Ljava/lang/Object;)V

    throw v0

    :pswitch_0
    iget-object p1, p0, Lm4/e;->P:Lm4/d;

    return-object p1

    :pswitch_1
    iget-object p1, p0, Lm4/e;->O:Lm4/d;

    return-object p1

    :pswitch_2
    iget-object p1, p0, Lm4/e;->Q:Lm4/d;

    return-object p1

    :pswitch_3
    iget-object p1, p0, Lm4/e;->N:Lm4/d;

    return-object p1

    :pswitch_4
    iget-object p1, p0, Lm4/e;->M:Lm4/d;

    return-object p1

    :pswitch_5
    iget-object p1, p0, Lm4/e;->L:Lm4/d;

    return-object p1

    :pswitch_6
    iget-object p1, p0, Lm4/e;->K:Lm4/d;

    return-object p1

    :pswitch_7
    iget-object p1, p0, Lm4/e;->J:Lm4/d;

    return-object p1

    :pswitch_8
    const/4 p1, 0x0

    return-object p1

    nop

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_8
        :pswitch_7
        :pswitch_6
        :pswitch_5
        :pswitch_4
        :pswitch_3
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method

.method public final k(I)I
    .locals 3

    const/4 v0, 0x0

    iget-object v1, p0, Lm4/e;->q0:[I

    if-nez p1, :cond_0

    aget p1, v1, v0

    return p1

    :cond_0
    const/4 v2, 0x1

    if-ne p1, v2, :cond_1

    aget p1, v1, v2

    return p1

    :cond_1
    return v0
.end method

.method public final l()I
    .locals 2

    iget v0, p0, Lm4/e;->h0:I

    const/16 v1, 0x8

    if-ne v0, v1, :cond_0

    const/4 v0, 0x0

    return v0

    :cond_0
    iget v0, p0, Lm4/e;->W:I

    return v0
.end method

.method public final m(I)Lm4/e;
    .locals 2

    if-nez p1, :cond_0

    iget-object p1, p0, Lm4/e;->L:Lm4/d;

    iget-object v0, p1, Lm4/d;->f:Lm4/d;

    if-eqz v0, :cond_1

    iget-object v1, v0, Lm4/d;->f:Lm4/d;

    if-ne v1, p1, :cond_1

    iget-object p1, v0, Lm4/d;->d:Lm4/e;

    return-object p1

    :cond_0
    const/4 v0, 0x1

    if-ne p1, v0, :cond_1

    iget-object p1, p0, Lm4/e;->M:Lm4/d;

    iget-object v0, p1, Lm4/d;->f:Lm4/d;

    if-eqz v0, :cond_1

    iget-object v1, v0, Lm4/d;->f:Lm4/d;

    if-ne v1, p1, :cond_1

    iget-object p1, v0, Lm4/d;->d:Lm4/e;

    return-object p1

    :cond_1
    const/4 p1, 0x0

    return-object p1
.end method

.method public final n(I)Lm4/e;
    .locals 2

    if-nez p1, :cond_0

    iget-object p1, p0, Lm4/e;->J:Lm4/d;

    iget-object v0, p1, Lm4/d;->f:Lm4/d;

    if-eqz v0, :cond_1

    iget-object v1, v0, Lm4/d;->f:Lm4/d;

    if-ne v1, p1, :cond_1

    iget-object p1, v0, Lm4/d;->d:Lm4/e;

    return-object p1

    :cond_0
    const/4 v0, 0x1

    if-ne p1, v0, :cond_1

    iget-object p1, p0, Lm4/e;->K:Lm4/d;

    iget-object v0, p1, Lm4/d;->f:Lm4/d;

    if-eqz v0, :cond_1

    iget-object v1, v0, Lm4/d;->f:Lm4/d;

    if-ne v1, p1, :cond_1

    iget-object p1, v0, Lm4/d;->d:Lm4/e;

    return-object p1

    :cond_1
    const/4 p1, 0x0

    return-object p1
.end method

.method public o(Ljava/lang/StringBuilder;)V
    .locals 13

    new-instance v1, Ljava/lang/StringBuilder;

    const-string v2, "  "

    invoke-direct {v1, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    iget-object v2, p0, Lm4/e;->k:Ljava/lang/String;

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v2, ":{\n"

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {p1, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    new-instance v1, Ljava/lang/StringBuilder;

    const-string v2, "    actualWidth:"

    invoke-direct {v1, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    iget v2, p0, Lm4/e;->V:I

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {p1, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v1, "\n"

    invoke-virtual {p1, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    new-instance v2, Ljava/lang/StringBuilder;

    const-string v3, "    actualHeight:"

    invoke-direct {v2, v3}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    iget v3, p0, Lm4/e;->W:I

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {p1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p1, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    new-instance v2, Ljava/lang/StringBuilder;

    const-string v3, "    actualLeft:"

    invoke-direct {v2, v3}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    iget v3, p0, Lm4/e;->Z:I

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {p1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p1, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    new-instance v2, Ljava/lang/StringBuilder;

    const-string v3, "    actualTop:"

    invoke-direct {v2, v3}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    iget v3, p0, Lm4/e;->a0:I

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {p1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p1, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v1, "left"

    iget-object v2, p0, Lm4/e;->J:Lm4/d;

    invoke-static {p1, v1, v2}, Lm4/e;->q(Ljava/lang/StringBuilder;Ljava/lang/String;Lm4/d;)V

    const-string v1, "top"

    iget-object v2, p0, Lm4/e;->K:Lm4/d;

    invoke-static {p1, v1, v2}, Lm4/e;->q(Ljava/lang/StringBuilder;Ljava/lang/String;Lm4/d;)V

    const-string v1, "right"

    iget-object v2, p0, Lm4/e;->L:Lm4/d;

    invoke-static {p1, v1, v2}, Lm4/e;->q(Ljava/lang/StringBuilder;Ljava/lang/String;Lm4/d;)V

    const-string v1, "bottom"

    iget-object v2, p0, Lm4/e;->M:Lm4/d;

    invoke-static {p1, v1, v2}, Lm4/e;->q(Ljava/lang/StringBuilder;Ljava/lang/String;Lm4/d;)V

    const-string v1, "baseline"

    iget-object v2, p0, Lm4/e;->N:Lm4/d;

    invoke-static {p1, v1, v2}, Lm4/e;->q(Ljava/lang/StringBuilder;Ljava/lang/String;Lm4/d;)V

    const-string v1, "centerX"

    iget-object v2, p0, Lm4/e;->O:Lm4/d;

    invoke-static {p1, v1, v2}, Lm4/e;->q(Ljava/lang/StringBuilder;Ljava/lang/String;Lm4/d;)V

    const-string v1, "centerY"

    iget-object v2, p0, Lm4/e;->P:Lm4/d;

    invoke-static {p1, v1, v2}, Lm4/e;->q(Ljava/lang/StringBuilder;Ljava/lang/String;Lm4/d;)V

    iget v2, p0, Lm4/e;->V:I

    iget v3, p0, Lm4/e;->c0:I

    iget-object v9, p0, Lm4/e;->D:[I

    const/4 v10, 0x0

    aget v4, v9, v10

    iget v5, p0, Lm4/e;->v:I

    iget v6, p0, Lm4/e;->s:I

    iget v7, p0, Lm4/e;->x:F

    iget-object v11, p0, Lm4/e;->q0:[I

    aget v8, v11, v10

    iget-object v12, p0, Lm4/e;->l0:[F

    aget v1, v12, v10

    const-string v1, "    width"

    move-object v0, p1

    invoke-static/range {v0 .. v8}, Lm4/e;->p(Ljava/lang/StringBuilder;Ljava/lang/String;IIIIIFI)V

    iget v2, p0, Lm4/e;->W:I

    iget v3, p0, Lm4/e;->d0:I

    const/4 v0, 0x1

    aget v4, v9, v0

    iget v5, p0, Lm4/e;->y:I

    iget v6, p0, Lm4/e;->t:I

    iget v7, p0, Lm4/e;->A:F

    aget v8, v11, v0

    aget v0, v12, v0

    const-string v1, "    height"

    move-object v0, p1

    invoke-static/range {v0 .. v8}, Lm4/e;->p(Ljava/lang/StringBuilder;Ljava/lang/String;IIIIIFI)V

    iget v1, p0, Lm4/e;->X:F

    iget v2, p0, Lm4/e;->Y:I

    const/4 v3, 0x0

    cmpl-float v3, v1, v3

    if-nez v3, :cond_0

    goto :goto_0

    :cond_0
    const-string v3, "    dimensionRatio"

    invoke-virtual {p1, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v3, " :  ["

    invoke-virtual {p1, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p1, v1}, Ljava/lang/StringBuilder;->append(F)Ljava/lang/StringBuilder;

    const-string v1, ","

    invoke-virtual {p1, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p1, v2}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v1, ""

    invoke-virtual {p1, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v1, "],\n"

    invoke-virtual {p1, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    :goto_0
    const-string v1, "    horizontalBias"

    iget v2, p0, Lm4/e;->e0:F

    const/high16 v3, 0x3f000000    # 0.5f

    invoke-static {p1, v1, v2, v3}, Lm4/e;->I(Ljava/lang/StringBuilder;Ljava/lang/String;FF)V

    const-string v1, "    verticalBias"

    iget v2, p0, Lm4/e;->f0:F

    invoke-static {p1, v1, v2, v3}, Lm4/e;->I(Ljava/lang/StringBuilder;Ljava/lang/String;FF)V

    const-string v1, "    horizontalChainStyle"

    iget v2, p0, Lm4/e;->j0:I

    invoke-static {v2, v10, v1, p1}, Lm4/e;->H(IILjava/lang/String;Ljava/lang/StringBuilder;)V

    const-string v1, "    verticalChainStyle"

    iget v2, p0, Lm4/e;->k0:I

    invoke-static {v2, v10, v1, p1}, Lm4/e;->H(IILjava/lang/String;Ljava/lang/StringBuilder;)V

    const-string v1, "  }"

    invoke-virtual {p1, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    return-void
.end method

.method public final r()I
    .locals 2

    iget v0, p0, Lm4/e;->h0:I

    const/16 v1, 0x8

    if-ne v0, v1, :cond_0

    const/4 v0, 0x0

    return v0

    :cond_0
    iget v0, p0, Lm4/e;->V:I

    return v0
.end method

.method public final s()I
    .locals 2

    iget-object v0, p0, Lm4/e;->U:Lm4/f;

    if-eqz v0, :cond_0

    instance-of v1, v0, Lm4/f;

    if-eqz v1, :cond_0

    iget v0, v0, Lm4/f;->y0:I

    iget v1, p0, Lm4/e;->Z:I

    add-int/2addr v0, v1

    return v0

    :cond_0
    iget v0, p0, Lm4/e;->Z:I

    return v0
.end method

.method public final t()I
    .locals 2

    iget-object v0, p0, Lm4/e;->U:Lm4/f;

    if-eqz v0, :cond_0

    instance-of v1, v0, Lm4/f;

    if-eqz v1, :cond_0

    iget v0, v0, Lm4/f;->z0:I

    iget v1, p0, Lm4/e;->a0:I

    add-int/2addr v0, v1

    return v0

    :cond_0
    iget v0, p0, Lm4/e;->a0:I

    return v0
.end method

.method public toString()Ljava/lang/String;
    .locals 4

    const-string v0, ""

    invoke-static {v0}, Lih0/d0;->o(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    iget-object v2, p0, Lm4/e;->i0:Ljava/lang/String;

    if-eqz v2, :cond_0

    new-instance v0, Ljava/lang/StringBuilder;

    const-string v2, "id: "

    invoke-direct {v0, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    iget-object v2, p0, Lm4/e;->i0:Ljava/lang/String;

    const-string v3, " "

    invoke-static {v2, v3, v0}, Lm4/a;->i(Ljava/lang/String;Ljava/lang/String;Ljava/lang/StringBuilder;)Ljava/lang/String;

    move-result-object v0

    :cond_0
    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v0, "("

    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget v0, p0, Lm4/e;->Z:I

    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v0, ", "

    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget v0, p0, Lm4/e;->a0:I

    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v0, ") - ("

    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget v0, p0, Lm4/e;->V:I

    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v0, " x "

    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget v0, p0, Lm4/e;->W:I

    const-string v2, ")"

    invoke-static {v1, v0, v2}, Lih0/d0;->l(Ljava/lang/StringBuilder;ILjava/lang/String;)Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public final u(I)Z
    .locals 4

    const/4 v0, 0x2

    const/4 v1, 0x0

    const/4 v2, 0x1

    if-nez p1, :cond_2

    iget-object p1, p0, Lm4/e;->J:Lm4/d;

    iget-object p1, p1, Lm4/d;->f:Lm4/d;

    if-eqz p1, :cond_0

    move p1, v2

    goto :goto_0

    :cond_0
    move p1, v1

    :goto_0
    iget-object v3, p0, Lm4/e;->L:Lm4/d;

    iget-object v3, v3, Lm4/d;->f:Lm4/d;

    if-eqz v3, :cond_1

    move v3, v2

    goto :goto_1

    :cond_1
    move v3, v1

    :goto_1
    add-int/2addr p1, v3

    if-ge p1, v0, :cond_6

    goto :goto_5

    :cond_2
    iget-object p1, p0, Lm4/e;->K:Lm4/d;

    iget-object p1, p1, Lm4/d;->f:Lm4/d;

    if-eqz p1, :cond_3

    move p1, v2

    goto :goto_2

    :cond_3
    move p1, v1

    :goto_2
    iget-object v3, p0, Lm4/e;->M:Lm4/d;

    iget-object v3, v3, Lm4/d;->f:Lm4/d;

    if-eqz v3, :cond_4

    move v3, v2

    goto :goto_3

    :cond_4
    move v3, v1

    :goto_3
    add-int/2addr p1, v3

    iget-object v3, p0, Lm4/e;->N:Lm4/d;

    iget-object v3, v3, Lm4/d;->f:Lm4/d;

    if-eqz v3, :cond_5

    move v3, v2

    goto :goto_4

    :cond_5
    move v3, v1

    :goto_4
    add-int/2addr p1, v3

    if-ge p1, v0, :cond_6

    :goto_5
    return v2

    :cond_6
    return v1
.end method

.method public final v(II)Z
    .locals 3

    if-nez p1, :cond_0

    iget-object p1, p0, Lm4/e;->J:Lm4/d;

    iget-object v0, p1, Lm4/d;->f:Lm4/d;

    if-eqz v0, :cond_1

    iget-boolean v0, v0, Lm4/d;->c:Z

    if-eqz v0, :cond_1

    iget-object v0, p0, Lm4/e;->L:Lm4/d;

    iget-object v1, v0, Lm4/d;->f:Lm4/d;

    if-eqz v1, :cond_1

    iget-boolean v2, v1, Lm4/d;->c:Z

    if-eqz v2, :cond_1

    invoke-virtual {v1}, Lm4/d;->d()I

    move-result v1

    invoke-virtual {v0}, Lm4/d;->e()I

    move-result v0

    sub-int/2addr v1, v0

    iget-object v0, p1, Lm4/d;->f:Lm4/d;

    invoke-virtual {v0}, Lm4/d;->d()I

    move-result v0

    invoke-virtual {p1}, Lm4/d;->e()I

    move-result p1

    add-int/2addr p1, v0

    sub-int/2addr v1, p1

    if-lt v1, p2, :cond_1

    goto :goto_0

    :cond_0
    iget-object p1, p0, Lm4/e;->K:Lm4/d;

    iget-object v0, p1, Lm4/d;->f:Lm4/d;

    if-eqz v0, :cond_1

    iget-boolean v0, v0, Lm4/d;->c:Z

    if-eqz v0, :cond_1

    iget-object v0, p0, Lm4/e;->M:Lm4/d;

    iget-object v1, v0, Lm4/d;->f:Lm4/d;

    if-eqz v1, :cond_1

    iget-boolean v2, v1, Lm4/d;->c:Z

    if-eqz v2, :cond_1

    invoke-virtual {v1}, Lm4/d;->d()I

    move-result v1

    invoke-virtual {v0}, Lm4/d;->e()I

    move-result v0

    sub-int/2addr v1, v0

    iget-object v0, p1, Lm4/d;->f:Lm4/d;

    invoke-virtual {v0}, Lm4/d;->d()I

    move-result v0

    invoke-virtual {p1}, Lm4/d;->e()I

    move-result p1

    add-int/2addr p1, v0

    sub-int/2addr v1, p1

    if-lt v1, p2, :cond_1

    :goto_0
    const/4 p1, 0x1

    return p1

    :cond_1
    const/4 p1, 0x0

    return p1
.end method

.method public final w(IIIILm4/e;)V
    .locals 0

    invoke-virtual {p0, p1}, Lm4/e;->j(I)Lm4/d;

    move-result-object p1

    invoke-virtual {p5, p2}, Lm4/e;->j(I)Lm4/d;

    move-result-object p2

    const/4 p5, 0x1

    invoke-virtual {p1, p2, p3, p4, p5}, Lm4/d;->b(Lm4/d;IIZ)Z

    return-void
.end method

.method public final x(I)Z
    .locals 3

    mul-int/lit8 p1, p1, 0x2

    iget-object v0, p0, Lm4/e;->R:[Lm4/d;

    aget-object v1, v0, p1

    iget-object v2, v1, Lm4/d;->f:Lm4/d;

    if-eqz v2, :cond_0

    iget-object v2, v2, Lm4/d;->f:Lm4/d;

    if-eq v2, v1, :cond_0

    const/4 v1, 0x1

    add-int/2addr p1, v1

    aget-object p1, v0, p1

    iget-object v0, p1, Lm4/d;->f:Lm4/d;

    if-eqz v0, :cond_0

    iget-object v0, v0, Lm4/d;->f:Lm4/d;

    if-ne v0, p1, :cond_0

    return v1

    :cond_0
    const/4 p1, 0x0

    return p1
.end method

.method public final y()Z
    .locals 2

    iget-object v0, p0, Lm4/e;->J:Lm4/d;

    iget-object v1, v0, Lm4/d;->f:Lm4/d;

    if-eqz v1, :cond_0

    iget-object v1, v1, Lm4/d;->f:Lm4/d;

    if-eq v1, v0, :cond_1

    :cond_0
    iget-object v0, p0, Lm4/e;->L:Lm4/d;

    iget-object v1, v0, Lm4/d;->f:Lm4/d;

    if-eqz v1, :cond_2

    iget-object v1, v1, Lm4/d;->f:Lm4/d;

    if-ne v1, v0, :cond_2

    :cond_1
    const/4 v0, 0x1

    return v0

    :cond_2
    const/4 v0, 0x0

    return v0
.end method

.method public final z()Z
    .locals 2

    iget-object v0, p0, Lm4/e;->K:Lm4/d;

    iget-object v1, v0, Lm4/d;->f:Lm4/d;

    if-eqz v1, :cond_0

    iget-object v1, v1, Lm4/d;->f:Lm4/d;

    if-eq v1, v0, :cond_1

    :cond_0
    iget-object v0, p0, Lm4/e;->M:Lm4/d;

    iget-object v1, v0, Lm4/d;->f:Lm4/d;

    if-eqz v1, :cond_2

    iget-object v1, v1, Lm4/d;->f:Lm4/d;

    if-ne v1, v0, :cond_2

    :cond_1
    const/4 v0, 0x1

    return v0

    :cond_2
    const/4 v0, 0x0

    return v0
.end method
