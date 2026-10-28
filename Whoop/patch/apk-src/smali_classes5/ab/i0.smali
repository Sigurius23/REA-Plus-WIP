.class public final Lab/i0;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lab/e0;
.implements Lfn/u;
.implements Lgg3/c;
.implements Lg40/l3;


# instance fields
.field public E:Ljava/lang/Object;

.field public F:Ljava/lang/Object;

.field public final synthetic w:I

.field public x:I

.field public y:Ljava/lang/Object;

.field public z:Ljava/lang/Object;


# direct methods
.method public constructor <init>(I)V
    .locals 2

    iput p1, p0, Lab/i0;->w:I

    packed-switch p1, :pswitch_data_0

    .line 115
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 116
    new-instance p1, Ljava/util/ArrayList;

    invoke-direct {p1}, Ljava/util/ArrayList;-><init>()V

    iput-object p1, p0, Lab/i0;->y:Ljava/lang/Object;

    .line 117
    new-instance p1, Ljava/util/ArrayList;

    invoke-direct {p1}, Ljava/util/ArrayList;-><init>()V

    iput-object p1, p0, Lab/i0;->z:Ljava/lang/Object;

    .line 118
    new-instance p1, Ljava/util/ArrayList;

    invoke-direct {p1}, Ljava/util/ArrayList;-><init>()V

    iput-object p1, p0, Lab/i0;->E:Ljava/lang/Object;

    .line 119
    sget-object p1, Lxe3/g;->r:Ljava/util/LinkedHashSet;

    .line 120
    iput-object p1, p0, Lab/i0;->F:Ljava/lang/Object;

    const/4 p1, 0x1

    .line 121
    iput p1, p0, Lab/i0;->x:I

    return-void

    .line 122
    :pswitch_0
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    const/4 p1, 0x0

    .line 123
    new-array p1, p1, [Ljava/lang/Object;

    .line 124
    sget-object v0, Lm83/y;->w:Lm83/y;

    const v1, 0x7f140fbb

    .line 125
    invoke-static {v1, p1, v0}, Ls4/i;->s(I[Ljava/lang/Object;Ljava/util/List;)Lzy/b;

    move-result-object p1

    .line 126
    iput-object p1, p0, Lab/i0;->y:Ljava/lang/Object;

    const/16 p1, 0x8

    .line 127
    iput p1, p0, Lab/i0;->x:I

    .line 128
    sget-object p1, Lx30/g;->a:Lx30/g;

    iput-object p1, p0, Lab/i0;->z:Ljava/lang/Object;

    const/4 p1, 0x0

    .line 129
    invoke-static {p1}, Lec3/v;->c(Ljava/lang/Object;)Lec3/h2;

    move-result-object p1

    iput-object p1, p0, Lab/i0;->E:Ljava/lang/Object;

    .line 130
    sget-object p1, Ljava/lang/Boolean;->FALSE:Ljava/lang/Boolean;

    invoke-static {p1}, Lec3/v;->c(Ljava/lang/Object;)Lec3/h2;

    move-result-object p1

    iput-object p1, p0, Lab/i0;->F:Ljava/lang/Object;

    return-void

    .line 131
    :pswitch_1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    const/4 p1, 0x0

    .line 132
    new-array p1, p1, [Ljava/lang/Object;

    .line 133
    sget-object v0, Lm83/y;->w:Lm83/y;

    const v1, 0x7f140fb7

    .line 134
    invoke-static {v1, p1, v0}, Ls4/i;->s(I[Ljava/lang/Object;Ljava/util/List;)Lzy/b;

    move-result-object p1

    .line 135
    iput-object p1, p0, Lab/i0;->y:Ljava/lang/Object;

    const/16 p1, 0x8

    .line 136
    iput p1, p0, Lab/i0;->x:I

    .line 137
    sget-object p1, Lq3/f0;->w:Lg40/h2;

    iput-object p1, p0, Lab/i0;->z:Ljava/lang/Object;

    const/4 p1, 0x0

    .line 138
    invoke-static {p1}, Lec3/v;->c(Ljava/lang/Object;)Lec3/h2;

    move-result-object p1

    iput-object p1, p0, Lab/i0;->E:Ljava/lang/Object;

    .line 139
    sget-object p1, Ljava/lang/Boolean;->FALSE:Ljava/lang/Boolean;

    invoke-static {p1}, Lec3/v;->c(Ljava/lang/Object;)Lec3/h2;

    move-result-object p1

    iput-object p1, p0, Lab/i0;->F:Ljava/lang/Object;

    return-void

    nop

    :pswitch_data_0
    .packed-switch 0x8
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method

.method public synthetic constructor <init>(IZ)V
    .locals 0

    .line 1
    iput p1, p0, Lab/i0;->w:I

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public constructor <init>(Lab/j0;I)V
    .locals 4

    const/4 v0, 0x0

    iput v0, p0, Lab/i0;->w:I

    .line 147
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lab/i0;->F:Ljava/lang/Object;

    .line 148
    new-instance p1, Llo/s;

    const/4 v0, 0x5

    new-array v1, v0, [B

    const/4 v2, 0x5

    const/4 v3, 0x0

    .line 149
    invoke-direct {p1, v1, v0, v2, v3}, Llo/s;-><init>([BIIB)V

    .line 150
    iput-object p1, p0, Lab/i0;->y:Ljava/lang/Object;

    .line 151
    new-instance p1, Landroid/util/SparseArray;

    invoke-direct {p1}, Landroid/util/SparseArray;-><init>()V

    iput-object p1, p0, Lab/i0;->z:Ljava/lang/Object;

    .line 152
    new-instance p1, Landroid/util/SparseIntArray;

    invoke-direct {p1}, Landroid/util/SparseIntArray;-><init>()V

    iput-object p1, p0, Lab/i0;->E:Ljava/lang/Object;

    .line 153
    iput p2, p0, Lab/i0;->x:I

    return-void
.end method

.method public constructor <init>(Lfn/x;I)V
    .locals 4

    const/4 v0, 0x3

    iput v0, p0, Lab/i0;->w:I

    .line 140
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lab/i0;->F:Ljava/lang/Object;

    .line 141
    new-instance p1, Llo/s;

    const/4 v0, 0x5

    new-array v1, v0, [B

    const/4 v2, 0x0

    const/4 v3, 0x0

    .line 142
    invoke-direct {p1, v1, v0, v2, v3}, Llo/s;-><init>([BIIB)V

    .line 143
    iput-object p1, p0, Lab/i0;->y:Ljava/lang/Object;

    .line 144
    new-instance p1, Landroid/util/SparseArray;

    invoke-direct {p1}, Landroid/util/SparseArray;-><init>()V

    iput-object p1, p0, Lab/i0;->z:Ljava/lang/Object;

    .line 145
    new-instance p1, Landroid/util/SparseIntArray;

    invoke-direct {p1}, Landroid/util/SparseIntArray;-><init>()V

    iput-object p1, p0, Lab/i0;->E:Ljava/lang/Object;

    .line 146
    iput p2, p0, Lab/i0;->x:I

    return-void
.end method

.method public synthetic constructor <init>(Ljava/lang/Object;Ljava/lang/Object;[B[Ljava/lang/Object;II)V
    .locals 0

    .line 2
    iput p6, p0, Lab/i0;->w:I

    iput-object p1, p0, Lab/i0;->y:Ljava/lang/Object;

    iput-object p2, p0, Lab/i0;->z:Ljava/lang/Object;

    iput-object p3, p0, Lab/i0;->E:Ljava/lang/Object;

    iput-object p4, p0, Lab/i0;->F:Ljava/lang/Object;

    iput p5, p0, Lab/i0;->x:I

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public constructor <init>(Ljava/lang/String;Ljava/lang/String;I)V
    .locals 12

    iput p3, p0, Lab/i0;->w:I

    packed-switch p3, :pswitch_data_0

    .line 14
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 15
    invoke-static {}, Landroid/opengl/GLES20;->glCreateProgram()I

    move-result p3

    iput p3, p0, Lab/i0;->x:I

    .line 16
    invoke-static {}, Llo/a;->g()V

    const v0, 0x8b31

    .line 17
    invoke-static {p3, v0, p1}, Llo/a;->a(IILjava/lang/String;)V

    const p1, 0x8b30

    .line 18
    invoke-static {p3, p1, p2}, Llo/a;->a(IILjava/lang/String;)V

    .line 19
    invoke-static {p3}, Landroid/opengl/GLES20;->glLinkProgram(I)V

    const/4 p1, 0x0

    .line 20
    filled-new-array {p1}, [I

    move-result-object p2

    const v0, 0x8b82

    .line 21
    invoke-static {p3, v0, p2, p1}, Landroid/opengl/GLES20;->glGetProgramiv(II[II)V

    .line 22
    aget p2, p2, p1

    const/4 v0, 0x1

    if-eq p2, v0, :cond_1

    .line 23
    invoke-static {p3}, Landroid/opengl/GLES20;->glGetProgramInfoLog(I)Ljava/lang/String;

    move-result-object p2

    invoke-static {p2}, Ljava/lang/String;->valueOf(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object p2

    invoke-virtual {p2}, Ljava/lang/String;->length()I

    move-result v1

    const-string v2, "Unable to link shader program: \n"

    if-eqz v1, :cond_0

    invoke-virtual {v2, p2}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    move-result-object p2

    goto :goto_0

    :cond_0
    new-instance p2, Ljava/lang/String;

    invoke-direct {p2, v2}, Ljava/lang/String;-><init>(Ljava/lang/String;)V

    .line 24
    :goto_0
    const-string v1, "GlUtil"

    .line 25
    invoke-static {v1, p2}, Landroid/util/Log;->e(Ljava/lang/String;Ljava/lang/String;)I

    .line 26
    :cond_1
    invoke-static {p3}, Landroid/opengl/GLES20;->glUseProgram(I)V

    .line 27
    new-instance p2, Ljava/util/HashMap;

    invoke-direct {p2}, Ljava/util/HashMap;-><init>()V

    iput-object p2, p0, Lab/i0;->E:Ljava/lang/Object;

    .line 28
    new-array p2, v0, [I

    const v1, 0x8b89

    .line 29
    invoke-static {p3, v1, p2, p1}, Landroid/opengl/GLES20;->glGetProgramiv(II[II)V

    .line 30
    aget p3, p2, p1

    new-array p3, p3, [Lg73/a;

    iput-object p3, p0, Lab/i0;->y:Ljava/lang/Object;

    move v2, p1

    .line 31
    :goto_1
    aget p3, p2, p1

    if-ge v2, p3, :cond_4

    .line 32
    iget v1, p0, Lab/i0;->x:I

    .line 33
    new-array p3, v0, [I

    const v3, 0x8b8a

    .line 34
    invoke-static {v1, v3, p3, p1}, Landroid/opengl/GLES20;->glGetProgramiv(II[II)V

    .line 35
    aget v3, p3, p1

    new-array v10, v3, [B

    .line 36
    new-array v4, v0, [I

    new-array v6, v0, [I

    new-array v8, v0, [I

    const/4 v9, 0x0

    const/4 v11, 0x0

    const/4 v5, 0x0

    const/4 v7, 0x0

    invoke-static/range {v1 .. v11}, Landroid/opengl/GLES20;->glGetActiveAttrib(III[II[II[II[BI)V

    .line 37
    new-instance p3, Ljava/lang/String;

    move v4, p1

    :goto_2
    if-ge v4, v3, :cond_3

    .line 38
    aget-byte v5, v10, v4

    if-nez v5, :cond_2

    move v3, v4

    goto :goto_3

    :cond_2
    add-int/lit8 v4, v4, 0x1

    goto :goto_2

    .line 39
    :cond_3
    :goto_3
    invoke-direct {p3, v10, p1, v3}, Ljava/lang/String;-><init>([BII)V

    .line 40
    invoke-static {v1, p3}, Landroid/opengl/GLES20;->glGetAttribLocation(ILjava/lang/String;)I

    .line 41
    new-instance v1, Lg73/a;

    const/16 v3, 0x16

    .line 42
    invoke-direct {v1, v3}, Lg73/a;-><init>(I)V

    .line 43
    iget-object v3, p0, Lab/i0;->y:Ljava/lang/Object;

    check-cast v3, [Lg73/a;

    aput-object v1, v3, v2

    .line 44
    iget-object v3, p0, Lab/i0;->E:Ljava/lang/Object;

    check-cast v3, Ljava/util/HashMap;

    invoke-virtual {v3, p3, v1}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    add-int/lit8 v2, v2, 0x1

    goto :goto_1

    .line 45
    :cond_4
    new-instance p2, Ljava/util/HashMap;

    invoke-direct {p2}, Ljava/util/HashMap;-><init>()V

    iput-object p2, p0, Lab/i0;->F:Ljava/lang/Object;

    .line 46
    new-array p2, v0, [I

    .line 47
    iget p3, p0, Lab/i0;->x:I

    const v1, 0x8b86

    invoke-static {p3, v1, p2, p1}, Landroid/opengl/GLES20;->glGetProgramiv(II[II)V

    .line 48
    aget p3, p2, p1

    new-array p3, p3, [Lg73/d;

    iput-object p3, p0, Lab/i0;->z:Ljava/lang/Object;

    move v2, p1

    .line 49
    :goto_4
    aget p3, p2, p1

    if-ge v2, p3, :cond_7

    .line 50
    iget v1, p0, Lab/i0;->x:I

    .line 51
    new-array p3, v0, [I

    const v3, 0x8b87

    .line 52
    invoke-static {v1, v3, p3, p1}, Landroid/opengl/GLES20;->glGetProgramiv(II[II)V

    .line 53
    new-array v8, v0, [I

    .line 54
    aget v3, p3, p1

    new-array v10, v3, [B

    .line 55
    new-array v4, v0, [I

    new-array v6, v0, [I

    const/4 v9, 0x0

    const/4 v11, 0x0

    const/4 v5, 0x0

    const/4 v7, 0x0

    invoke-static/range {v1 .. v11}, Landroid/opengl/GLES20;->glGetActiveUniform(III[II[II[II[BI)V

    .line 56
    new-instance p3, Ljava/lang/String;

    move v4, p1

    :goto_5
    if-ge v4, v3, :cond_6

    .line 57
    aget-byte v5, v10, v4

    if-nez v5, :cond_5

    move v3, v4

    goto :goto_6

    :cond_5
    add-int/lit8 v4, v4, 0x1

    goto :goto_5

    .line 58
    :cond_6
    :goto_6
    invoke-direct {p3, v10, p1, v3}, Ljava/lang/String;-><init>([BII)V

    .line 59
    invoke-static {v1, p3}, Landroid/opengl/GLES20;->glGetUniformLocation(ILjava/lang/String;)I

    .line 60
    new-instance v1, Lg73/d;

    const/16 v3, 0x16

    .line 61
    invoke-direct {v1, v3}, Lg73/d;-><init>(I)V

    .line 62
    iget-object v3, p0, Lab/i0;->z:Ljava/lang/Object;

    check-cast v3, [Lg73/d;

    aput-object v1, v3, v2

    .line 63
    iget-object v3, p0, Lab/i0;->F:Ljava/lang/Object;

    check-cast v3, Ljava/util/HashMap;

    invoke-virtual {v3, p3, v1}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    add-int/lit8 v2, v2, 0x1

    goto :goto_4

    .line 64
    :cond_7
    invoke-static {}, Llo/a;->g()V

    return-void

    .line 65
    :pswitch_0
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 66
    invoke-static {}, Landroid/opengl/GLES20;->glCreateProgram()I

    move-result p3

    iput p3, p0, Lab/i0;->x:I

    .line 67
    invoke-static {}, Lx8/a;->c()V

    const v0, 0x8b31

    .line 68
    invoke-static {p3, v0, p1}, Lab/i0;->q(IILjava/lang/String;)V

    const p1, 0x8b30

    .line 69
    invoke-static {p3, p1, p2}, Lab/i0;->q(IILjava/lang/String;)V

    .line 70
    invoke-static {p3}, Landroid/opengl/GLES20;->glLinkProgram(I)V

    const/4 p1, 0x0

    .line 71
    filled-new-array {p1}, [I

    move-result-object p2

    const v0, 0x8b82

    .line 72
    invoke-static {p3, v0, p2, p1}, Landroid/opengl/GLES20;->glGetProgramiv(II[II)V

    .line 73
    aget p2, p2, p1

    const/4 v0, 0x1

    if-ne p2, v0, :cond_8

    move p2, v0

    goto :goto_7

    :cond_8
    move p2, p1

    :goto_7
    new-instance v1, Ljava/lang/StringBuilder;

    const-string v2, "Unable to link shader program: \n"

    invoke-direct {v1, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 74
    invoke-static {p3}, Landroid/opengl/GLES20;->glGetProgramInfoLog(I)Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    .line 75
    invoke-static {v1, p2}, Lx8/a;->d(Ljava/lang/String;Z)V

    .line 76
    invoke-static {p3}, Landroid/opengl/GLES20;->glUseProgram(I)V

    .line 77
    new-instance p2, Ljava/util/HashMap;

    invoke-direct {p2}, Ljava/util/HashMap;-><init>()V

    iput-object p2, p0, Lab/i0;->E:Ljava/lang/Object;

    .line 78
    new-array p2, v0, [I

    const v1, 0x8b89

    .line 79
    invoke-static {p3, v1, p2, p1}, Landroid/opengl/GLES20;->glGetProgramiv(II[II)V

    .line 80
    aget p3, p2, p1

    new-array p3, p3, [Lt9/c0;

    iput-object p3, p0, Lab/i0;->y:Ljava/lang/Object;

    move v2, p1

    .line 81
    :goto_8
    aget p3, p2, p1

    if-ge v2, p3, :cond_b

    .line 82
    iget v1, p0, Lab/i0;->x:I

    .line 83
    new-array p3, v0, [I

    const v3, 0x8b8a

    .line 84
    invoke-static {v1, v3, p3, p1}, Landroid/opengl/GLES20;->glGetProgramiv(II[II)V

    .line 85
    aget v3, p3, p1

    new-array v10, v3, [B

    .line 86
    new-array v4, v0, [I

    new-array v6, v0, [I

    new-array v8, v0, [I

    const/4 v9, 0x0

    const/4 v11, 0x0

    const/4 v5, 0x0

    const/4 v7, 0x0

    invoke-static/range {v1 .. v11}, Landroid/opengl/GLES20;->glGetActiveAttrib(III[II[II[II[BI)V

    .line 87
    new-instance p3, Ljava/lang/String;

    move v4, p1

    :goto_9
    if-ge v4, v3, :cond_a

    .line 88
    aget-byte v5, v10, v4

    if-nez v5, :cond_9

    move v3, v4

    goto :goto_a

    :cond_9
    add-int/lit8 v4, v4, 0x1

    goto :goto_9

    .line 89
    :cond_a
    :goto_a
    invoke-direct {p3, v10, p1, v3}, Ljava/lang/String;-><init>([BII)V

    .line 90
    invoke-static {v1, p3}, Landroid/opengl/GLES20;->glGetAttribLocation(ILjava/lang/String;)I

    .line 91
    new-instance v1, Lt9/c0;

    .line 92
    invoke-direct {v1}, Ljava/lang/Object;-><init>()V

    .line 93
    iget-object v3, p0, Lab/i0;->y:Ljava/lang/Object;

    check-cast v3, [Lt9/c0;

    aput-object v1, v3, v2

    .line 94
    iget-object v3, p0, Lab/i0;->E:Ljava/lang/Object;

    check-cast v3, Ljava/util/HashMap;

    invoke-virtual {v3, p3, v1}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    add-int/lit8 v2, v2, 0x1

    goto :goto_8

    .line 95
    :cond_b
    new-instance p2, Ljava/util/HashMap;

    invoke-direct {p2}, Ljava/util/HashMap;-><init>()V

    iput-object p2, p0, Lab/i0;->F:Ljava/lang/Object;

    .line 96
    new-array p2, v0, [I

    .line 97
    iget p3, p0, Lab/i0;->x:I

    const v1, 0x8b86

    invoke-static {p3, v1, p2, p1}, Landroid/opengl/GLES20;->glGetProgramiv(II[II)V

    .line 98
    aget p3, p2, p1

    new-array p3, p3, [Lt9/p;

    iput-object p3, p0, Lab/i0;->z:Ljava/lang/Object;

    move v2, p1

    .line 99
    :goto_b
    aget p3, p2, p1

    if-ge v2, p3, :cond_e

    .line 100
    iget v1, p0, Lab/i0;->x:I

    .line 101
    new-array p3, v0, [I

    const v3, 0x8b87

    .line 102
    invoke-static {v1, v3, p3, p1}, Landroid/opengl/GLES20;->glGetProgramiv(II[II)V

    .line 103
    new-array v8, v0, [I

    .line 104
    aget v3, p3, p1

    new-array v10, v3, [B

    .line 105
    new-array v4, v0, [I

    new-array v6, v0, [I

    const/4 v9, 0x0

    const/4 v11, 0x0

    const/4 v5, 0x0

    const/4 v7, 0x0

    invoke-static/range {v1 .. v11}, Landroid/opengl/GLES20;->glGetActiveUniform(III[II[II[II[BI)V

    .line 106
    new-instance p3, Ljava/lang/String;

    move v4, p1

    :goto_c
    if-ge v4, v3, :cond_d

    .line 107
    aget-byte v5, v10, v4

    if-nez v5, :cond_c

    move v3, v4

    goto :goto_d

    :cond_c
    add-int/lit8 v4, v4, 0x1

    goto :goto_c

    .line 108
    :cond_d
    :goto_d
    invoke-direct {p3, v10, p1, v3}, Ljava/lang/String;-><init>([BII)V

    .line 109
    invoke-static {v1, p3}, Landroid/opengl/GLES20;->glGetUniformLocation(ILjava/lang/String;)I

    .line 110
    new-instance v1, Lt9/p;

    const/16 v3, 0xf

    .line 111
    invoke-direct {v1, v3}, Lt9/p;-><init>(I)V

    .line 112
    iget-object v3, p0, Lab/i0;->z:Ljava/lang/Object;

    check-cast v3, [Lt9/p;

    aput-object v1, v3, v2

    .line 113
    iget-object v3, p0, Lab/i0;->F:Ljava/lang/Object;

    check-cast v3, Ljava/util/HashMap;

    invoke-virtual {v3, p3, v1}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    add-int/lit8 v2, v2, 0x1

    goto :goto_b

    .line 114
    :cond_e
    invoke-static {}, Lx8/a;->c()V

    return-void

    :pswitch_data_0
    .packed-switch 0xa
        :pswitch_0
    .end packed-switch
.end method

.method public constructor <init>(Lq83/j;Lqy/d;I)V
    .locals 1

    const/16 v0, 0xb

    iput v0, p0, Lab/i0;->w:I

    and-int/lit8 v0, p3, 0x1

    if-eqz v0, :cond_0

    .line 3
    sget-object p1, Lbc3/q0;->a:Lkc3/e;

    .line 4
    sget-object p1, Lkc3/d;->w:Lkc3/d;

    .line 5
    :cond_0
    new-instance v0, Lyy/o;

    invoke-direct {v0}, Lyy/o;-><init>()V

    and-int/lit8 p3, p3, 0x10

    if-eqz p3, :cond_1

    .line 6
    sget-object p2, Lqy/e;->b:Lqy/d;

    .line 7
    :cond_1
    const-string p3, "workContext"

    invoke-static {p1, p3}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string p3, "logger"

    invoke-static {p2, p3}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    .line 8
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 9
    iput-object p1, p0, Lab/i0;->y:Ljava/lang/Object;

    .line 10
    sget-object p1, Lyy/i;->a:Lyy/i;

    iput-object p1, p0, Lab/i0;->z:Ljava/lang/Object;

    .line 11
    iput-object v0, p0, Lab/i0;->E:Ljava/lang/Object;

    const/4 p1, 0x3

    .line 12
    iput p1, p0, Lab/i0;->x:I

    .line 13
    iput-object p2, p0, Lab/i0;->F:Ljava/lang/Object;

    return-void
.end method

.method public static q(IILjava/lang/String;)V
    .locals 3

    invoke-static {p1}, Landroid/opengl/GLES20;->glCreateShader(I)I

    move-result p1

    invoke-static {p1, p2}, Landroid/opengl/GLES20;->glShaderSource(ILjava/lang/String;)V

    invoke-static {p1}, Landroid/opengl/GLES20;->glCompileShader(I)V

    const/4 v0, 0x0

    filled-new-array {v0}, [I

    move-result-object v1

    const v2, 0x8b81

    invoke-static {p1, v2, v1, v0}, Landroid/opengl/GLES20;->glGetShaderiv(II[II)V

    aget v1, v1, v0

    const/4 v2, 0x1

    if-ne v1, v2, :cond_0

    move v0, v2

    :cond_0
    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    invoke-static {p1}, Landroid/opengl/GLES20;->glGetShaderInfoLog(I)Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v2, ", source: \n"

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p2

    invoke-static {p2, v0}, Lx8/a;->d(Ljava/lang/String;Z)V

    invoke-static {p0, p1}, Landroid/opengl/GLES20;->glAttachShader(II)V

    invoke-static {p1}, Landroid/opengl/GLES20;->glDeleteShader(I)V

    invoke-static {}, Lx8/a;->c()V

    return-void
.end method


# virtual methods
.method public a()Lec3/f2;
    .locals 1

    iget v0, p0, Lab/i0;->w:I

    packed-switch v0, :pswitch_data_0

    iget-object v0, p0, Lab/i0;->E:Ljava/lang/Object;

    check-cast v0, Lec3/h2;

    return-object v0

    :pswitch_0
    iget-object v0, p0, Lab/i0;->E:Ljava/lang/Object;

    check-cast v0, Lec3/h2;

    return-object v0

    nop

    :pswitch_data_0
    .packed-switch 0x8
        :pswitch_0
    .end packed-switch
.end method

.method public b(Ljava/lang/String;)Ljava/lang/String;
    .locals 1

    iget v0, p0, Lab/i0;->w:I

    packed-switch v0, :pswitch_data_0

    :pswitch_0
    const-string v0, "rawValue"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    return-object p1

    nop

    :pswitch_data_0
    .packed-switch 0x8
        :pswitch_0
    .end packed-switch
.end method

.method public c(Lx8/n;)V
    .locals 32

    move-object/from16 v0, p0

    move-object/from16 v1, p1

    iget-object v2, v0, Lab/i0;->z:Ljava/lang/Object;

    check-cast v2, Landroid/util/SparseArray;

    iget-object v3, v0, Lab/i0;->E:Ljava/lang/Object;

    check-cast v3, Landroid/util/SparseIntArray;

    iget-object v4, v0, Lab/i0;->y:Ljava/lang/Object;

    check-cast v4, Llo/s;

    iget-object v5, v0, Lab/i0;->F:Ljava/lang/Object;

    check-cast v5, Lab/j0;

    iget-object v6, v5, Lab/j0;->g:Landroid/util/SparseArray;

    iget-object v7, v5, Lab/j0;->h:Landroid/util/SparseBooleanArray;

    invoke-virtual {v1}, Lx8/n;->t()I

    move-result v8

    const/4 v9, 0x2

    if-eq v8, v9, :cond_0

    goto :goto_0

    :cond_0
    iget-object v8, v5, Lab/j0;->b:Ljava/util/List;

    const/4 v10, 0x0

    invoke-interface {v8, v10}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v8

    check-cast v8, Lx8/s;

    invoke-virtual {v1}, Lx8/n;->t()I

    move-result v11

    and-int/lit16 v11, v11, 0x80

    if-nez v11, :cond_1

    :goto_0
    return-void

    :cond_1
    const/4 v11, 0x1

    invoke-virtual {v1, v11}, Lx8/n;->G(I)V

    invoke-virtual {v1}, Lx8/n;->z()I

    move-result v12

    const/4 v13, 0x3

    invoke-virtual {v1, v13}, Lx8/n;->G(I)V

    iget-object v14, v4, Llo/s;->b:[B

    invoke-virtual {v1, v14, v10, v9}, Lx8/n;->e([BII)V

    invoke-virtual {v4, v10}, Llo/s;->q(I)V

    invoke-virtual {v4, v13}, Llo/s;->t(I)V

    const/16 v14, 0xd

    invoke-virtual {v4, v14}, Llo/s;->i(I)I

    move-result v15

    iput v15, v5, Lab/j0;->q:I

    iget-object v15, v4, Llo/s;->b:[B

    invoke-virtual {v1, v15, v10, v9}, Lx8/n;->e([BII)V

    invoke-virtual {v4, v10}, Llo/s;->q(I)V

    const/4 v15, 0x4

    invoke-virtual {v4, v15}, Llo/s;->t(I)V

    const/16 v11, 0xc

    invoke-virtual {v4, v11}, Llo/s;->i(I)I

    move-result v9

    invoke-virtual {v1, v9}, Lx8/n;->G(I)V

    invoke-virtual {v2}, Landroid/util/SparseArray;->clear()V

    invoke-virtual {v3}, Landroid/util/SparseIntArray;->clear()V

    invoke-virtual {v1}, Lx8/n;->a()I

    move-result v9

    :goto_1
    if-lez v9, :cond_21

    iget-object v11, v4, Llo/s;->b:[B

    const/4 v15, 0x5

    invoke-virtual {v1, v11, v10, v15}, Lx8/n;->e([BII)V

    invoke-virtual {v4, v10}, Llo/s;->q(I)V

    const/16 v11, 0x8

    invoke-virtual {v4, v11}, Llo/s;->i(I)I

    move-result v11

    invoke-virtual {v4, v13}, Llo/s;->t(I)V

    invoke-virtual {v4, v14}, Llo/s;->i(I)I

    move-result v10

    const/4 v14, 0x4

    invoke-virtual {v4, v14}, Llo/s;->t(I)V

    const/16 v14, 0xc

    invoke-virtual {v4, v14}, Llo/s;->i(I)I

    move-result v16

    iget v14, v1, Lx8/n;->b:I

    add-int v13, v14, v16

    const/16 v17, 0x0

    const/16 v18, -0x1

    move-object/from16 v21, v17

    move-object/from16 v23, v21

    move/from16 v20, v18

    const/16 v22, 0x0

    :goto_2
    iget v15, v1, Lx8/n;->b:I

    move-object/from16 v25, v4

    if-ge v15, v13, :cond_2

    invoke-virtual {v1}, Lx8/n;->t()I

    move-result v15

    invoke-virtual {v1}, Lx8/n;->t()I

    move-result v19

    iget v4, v1, Lx8/n;->b:I

    add-int v4, v4, v19

    if-le v4, v13, :cond_3

    :cond_2
    move-object/from16 v31, v6

    move/from16 v30, v9

    goto/16 :goto_7

    :cond_3
    const/16 v19, 0x87

    const/16 v24, 0x81

    move/from16 v30, v9

    const/4 v9, 0x5

    if-ne v15, v9, :cond_8

    invoke-virtual {v1}, Lx8/n;->v()J

    move-result-wide v26

    const-wide/32 v28, 0x41432d33

    cmp-long v9, v26, v28

    if-nez v9, :cond_4

    move/from16 v20, v24

    goto :goto_4

    :cond_4
    const-wide/32 v28, 0x45414333

    cmp-long v9, v26, v28

    if-nez v9, :cond_5

    move/from16 v20, v19

    goto :goto_4

    :cond_5
    const-wide/32 v28, 0x41432d34

    cmp-long v9, v26, v28

    if-nez v9, :cond_6

    :goto_3
    const/16 v20, 0xac

    goto :goto_4

    :cond_6
    const-wide/32 v28, 0x48455643

    cmp-long v9, v26, v28

    if-nez v9, :cond_7

    const/16 v20, 0x24

    :cond_7
    :goto_4
    move/from16 v19, v4

    move-object/from16 v31, v6

    goto/16 :goto_6

    :cond_8
    const/16 v9, 0x6a

    if-ne v15, v9, :cond_9

    move/from16 v19, v4

    move-object/from16 v31, v6

    move/from16 v20, v24

    goto/16 :goto_6

    :cond_9
    const/16 v9, 0x7a

    if-ne v15, v9, :cond_a

    move-object/from16 v31, v6

    move/from16 v20, v19

    move/from16 v19, v4

    goto/16 :goto_6

    :cond_a
    const/16 v9, 0x7f

    if-ne v15, v9, :cond_d

    invoke-virtual {v1}, Lx8/n;->t()I

    move-result v9

    const/16 v15, 0x15

    if-ne v9, v15, :cond_b

    goto :goto_3

    :cond_b
    const/16 v15, 0xe

    if-ne v9, v15, :cond_c

    const/16 v20, 0x88

    goto :goto_4

    :cond_c
    const/16 v15, 0x21

    if-ne v9, v15, :cond_7

    const/16 v20, 0x8b

    goto :goto_4

    :cond_d
    const/16 v9, 0x7b

    if-ne v15, v9, :cond_e

    move/from16 v19, v4

    move-object/from16 v31, v6

    const/16 v20, 0x8a

    goto :goto_6

    :cond_e
    const/16 v9, 0xa

    if-ne v15, v9, :cond_f

    sget-object v9, Ljava/nio/charset/StandardCharsets;->UTF_8:Ljava/nio/charset/Charset;

    const/4 v15, 0x3

    invoke-virtual {v1, v15, v9}, Lx8/n;->r(ILjava/nio/charset/Charset;)Ljava/lang/String;

    move-result-object v9

    invoke-virtual {v9}, Ljava/lang/String;->trim()Ljava/lang/String;

    move-result-object v21

    invoke-virtual {v1}, Lx8/n;->t()I

    move-result v9

    move/from16 v19, v4

    move-object/from16 v31, v6

    move/from16 v22, v9

    goto :goto_6

    :cond_f
    const/4 v0, 0x3

    const/16 v9, 0x59

    if-ne v15, v9, :cond_11

    new-instance v9, Ljava/util/ArrayList;

    invoke-direct {v9}, Ljava/util/ArrayList;-><init>()V

    :goto_5
    iget v15, v1, Lx8/n;->b:I

    if-ge v15, v4, :cond_10

    sget-object v15, Ljava/nio/charset/StandardCharsets;->UTF_8:Ljava/nio/charset/Charset;

    invoke-virtual {v1, v0, v15}, Lx8/n;->r(ILjava/nio/charset/Charset;)Ljava/lang/String;

    move-result-object v15

    invoke-virtual {v15}, Ljava/lang/String;->trim()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v1}, Lx8/n;->t()I

    move/from16 v19, v4

    const/4 v15, 0x4

    new-array v4, v15, [B

    move-object/from16 v31, v6

    const/4 v6, 0x0

    invoke-virtual {v1, v4, v6, v15}, Lx8/n;->e([BII)V

    new-instance v6, Lab/k0;

    invoke-direct {v6, v0, v4}, Lab/k0;-><init>(Ljava/lang/String;[B)V

    invoke-virtual {v9, v6}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    move/from16 v4, v19

    move-object/from16 v6, v31

    const/4 v0, 0x3

    goto :goto_5

    :cond_10
    move/from16 v19, v4

    move-object/from16 v31, v6

    move-object/from16 v23, v9

    const/16 v20, 0x59

    goto :goto_6

    :cond_11
    move/from16 v19, v4

    move-object/from16 v31, v6

    const/16 v0, 0x6f

    if-ne v15, v0, :cond_12

    const/16 v20, 0x101

    :cond_12
    :goto_6
    iget v0, v1, Lx8/n;->b:I

    sub-int v4, v19, v0

    invoke-virtual {v1, v4}, Lx8/n;->G(I)V

    move-object/from16 v0, p0

    move-object/from16 v4, v25

    move/from16 v9, v30

    move-object/from16 v6, v31

    goto/16 :goto_2

    :goto_7
    invoke-virtual {v1, v13}, Lx8/n;->F(I)V

    new-instance v19, Lab/h0;

    iget-object v0, v1, Lx8/n;->a:[B

    invoke-static {v0, v14, v13}, Ljava/util/Arrays;->copyOfRange([BII)[B

    move-result-object v24

    invoke-direct/range {v19 .. v24}, Lab/h0;-><init>(ILjava/lang/String;ILjava/util/ArrayList;[B)V

    move-object/from16 v4, v19

    move-object/from16 v0, v21

    const/4 v6, 0x6

    if-eq v11, v6, :cond_13

    const/4 v9, 0x5

    if-ne v11, v9, :cond_14

    :cond_13
    move/from16 v11, v20

    :cond_14
    add-int/lit8 v16, v16, 0x5

    sub-int v9, v30, v16

    invoke-virtual {v7, v10}, Landroid/util/SparseBooleanArray;->get(I)Z

    move-result v6

    if-eqz v6, :cond_15

    const/4 v15, 0x3

    goto/16 :goto_a

    :cond_15
    iget-object v6, v5, Lab/j0;->e:Lab/g;

    const-string v13, "video/mp2t"

    const/4 v14, 0x2

    const/4 v15, 0x3

    if-eq v11, v14, :cond_20

    if-eq v11, v15, :cond_1f

    const/4 v14, 0x4

    if-eq v11, v14, :cond_1f

    const/16 v14, 0x15

    if-eq v11, v14, :cond_1e

    const/16 v14, 0x1b

    if-eq v11, v14, :cond_1d

    const/16 v14, 0x24

    if-eq v11, v14, :cond_1c

    const/16 v14, 0x2d

    if-eq v11, v14, :cond_1b

    const/16 v14, 0x59

    if-eq v11, v14, :cond_1a

    const/16 v14, 0xac

    if-eq v11, v14, :cond_19

    const/16 v14, 0x101

    if-eq v11, v14, :cond_18

    const/16 v14, 0x8a

    if-eq v11, v14, :cond_17

    const/16 v14, 0x8b

    if-eq v11, v14, :cond_16

    packed-switch v11, :pswitch_data_0

    packed-switch v11, :pswitch_data_1

    packed-switch v11, :pswitch_data_2

    :pswitch_0
    move-object/from16 v0, v17

    goto/16 :goto_9

    :pswitch_1
    new-instance v0, Lab/f0;

    new-instance v4, La33/d;

    const-string v6, "application/x-scte35"

    const/4 v11, 0x1

    invoke-direct {v4, v6, v11}, La33/d;-><init>(Ljava/lang/String;I)V

    invoke-direct {v0, v4}, Lab/f0;-><init>(Lab/e0;)V

    goto/16 :goto_9

    :pswitch_2
    new-instance v6, Lab/z;

    new-instance v11, Lab/c;

    invoke-virtual {v4}, Lab/h0;->p()I

    move-result v4

    const/4 v14, 0x0

    invoke-direct {v11, v0, v4, v13, v14}, Lab/c;-><init>(Ljava/lang/String;ILjava/lang/String;I)V

    invoke-direct {v6, v11}, Lab/z;-><init>(Lab/j;)V

    :goto_8
    move-object v0, v6

    goto/16 :goto_9

    :pswitch_3
    new-instance v6, Lab/z;

    new-instance v11, Lab/u;

    invoke-virtual {v4}, Lab/h0;->p()I

    move-result v4

    invoke-direct {v11, v0, v4}, Lab/u;-><init>(Ljava/lang/String;I)V

    invoke-direct {v6, v11}, Lab/z;-><init>(Lab/j;)V

    goto :goto_8

    :pswitch_4
    new-instance v0, Lab/z;

    new-instance v11, Lab/o;

    new-instance v13, Lxl/a;

    invoke-virtual {v6, v4}, Lab/g;->a(Lab/h0;)Ljava/util/List;

    move-result-object v4

    const/4 v6, 0x2

    invoke-direct {v13, v4, v6}, Lxl/a;-><init>(Ljava/util/List;I)V

    invoke-direct {v11, v13}, Lab/o;-><init>(Lxl/a;)V

    invoke-direct {v0, v11}, Lab/z;-><init>(Lab/j;)V

    goto/16 :goto_9

    :pswitch_5
    new-instance v6, Lab/z;

    new-instance v11, Lab/f;

    invoke-virtual {v4}, Lab/h0;->p()I

    move-result v4

    const/4 v14, 0x0

    invoke-direct {v11, v14, v0, v4, v13}, Lab/f;-><init>(ZLjava/lang/String;ILjava/lang/String;)V

    invoke-direct {v6, v11}, Lab/z;-><init>(Lab/j;)V

    goto :goto_8

    :cond_16
    new-instance v6, Lab/z;

    new-instance v11, Lab/h;

    invoke-virtual {v4}, Lab/h0;->p()I

    move-result v4

    const/16 v13, 0x1520

    invoke-direct {v11, v0, v4, v13}, Lab/h;-><init>(Ljava/lang/String;II)V

    invoke-direct {v6, v11}, Lab/z;-><init>(Lab/j;)V

    goto :goto_8

    :cond_17
    :pswitch_6
    new-instance v6, Lab/z;

    new-instance v11, Lab/h;

    invoke-virtual {v4}, Lab/h0;->p()I

    move-result v4

    const/16 v13, 0x1000

    invoke-direct {v11, v0, v4, v13}, Lab/h;-><init>(Ljava/lang/String;II)V

    invoke-direct {v6, v11}, Lab/z;-><init>(Lab/j;)V

    goto :goto_8

    :cond_18
    new-instance v0, Lab/f0;

    new-instance v4, La33/d;

    const-string v6, "application/vnd.dvb.ait"

    const/4 v11, 0x1

    invoke-direct {v4, v6, v11}, La33/d;-><init>(Ljava/lang/String;I)V

    invoke-direct {v0, v4}, Lab/f0;-><init>(Lab/e0;)V

    goto/16 :goto_9

    :cond_19
    new-instance v6, Lab/z;

    new-instance v11, Lab/c;

    invoke-virtual {v4}, Lab/h0;->p()I

    move-result v4

    const/4 v14, 0x1

    invoke-direct {v11, v0, v4, v13, v14}, Lab/c;-><init>(Ljava/lang/String;ILjava/lang/String;I)V

    invoke-direct {v6, v11}, Lab/z;-><init>(Lab/j;)V

    goto :goto_8

    :cond_1a
    new-instance v0, Lab/z;

    new-instance v6, Lab/i;

    iget-object v4, v4, Lab/h0;->y:Ljava/lang/Object;

    check-cast v4, Ljava/util/List;

    const/4 v11, 0x0

    invoke-direct {v6, v4, v11}, Lab/i;-><init>(Ljava/util/List;I)V

    invoke-direct {v0, v6}, Lab/z;-><init>(Lab/j;)V

    goto :goto_9

    :cond_1b
    new-instance v0, Lab/z;

    new-instance v4, Lab/w;

    invoke-direct {v4}, Lab/w;-><init>()V

    invoke-direct {v0, v4}, Lab/z;-><init>(Lab/j;)V

    goto :goto_9

    :cond_1c
    new-instance v0, Lab/z;

    new-instance v11, Lab/t;

    new-instance v13, La33/d;

    invoke-virtual {v6, v4}, Lab/g;->a(Lab/h0;)Ljava/util/List;

    move-result-object v4

    invoke-direct {v13, v4}, La33/d;-><init>(Ljava/util/List;)V

    invoke-direct {v11, v13}, Lab/t;-><init>(La33/d;)V

    invoke-direct {v0, v11}, Lab/z;-><init>(Lab/j;)V

    goto :goto_9

    :cond_1d
    new-instance v0, Lab/z;

    new-instance v11, Lab/r;

    new-instance v13, La33/d;

    invoke-virtual {v6, v4}, Lab/g;->a(Lab/h0;)Ljava/util/List;

    move-result-object v4

    invoke-direct {v13, v4}, La33/d;-><init>(Ljava/util/List;)V

    const/4 v14, 0x0

    invoke-direct {v11, v13, v14, v14}, Lab/r;-><init>(La33/d;ZZ)V

    invoke-direct {v0, v11}, Lab/z;-><init>(Lab/j;)V

    goto :goto_9

    :cond_1e
    new-instance v0, Lab/z;

    new-instance v4, Lab/i;

    const/4 v6, 0x1

    invoke-direct {v4, v6}, Lab/i;-><init>(I)V

    invoke-direct {v0, v4}, Lab/z;-><init>(Lab/j;)V

    goto :goto_9

    :cond_1f
    new-instance v6, Lab/z;

    new-instance v11, Lab/v;

    invoke-virtual {v4}, Lab/h0;->p()I

    move-result v4

    invoke-direct {v11, v0, v4, v13}, Lab/v;-><init>(Ljava/lang/String;ILjava/lang/String;)V

    invoke-direct {v6, v11}, Lab/z;-><init>(Lab/j;)V

    goto/16 :goto_8

    :cond_20
    :pswitch_7
    new-instance v0, Lab/z;

    new-instance v11, Lab/l;

    new-instance v14, Lxl/a;

    invoke-virtual {v6, v4}, Lab/g;->a(Lab/h0;)Ljava/util/List;

    move-result-object v4

    const/4 v6, 0x2

    invoke-direct {v14, v4, v6}, Lxl/a;-><init>(Ljava/util/List;I)V

    invoke-direct {v11, v14, v13}, Lab/l;-><init>(Lxl/a;Ljava/lang/String;)V

    invoke-direct {v0, v11}, Lab/z;-><init>(Lab/j;)V

    :goto_9
    invoke-virtual {v3, v10, v10}, Landroid/util/SparseIntArray;->put(II)V

    invoke-virtual {v2, v10, v0}, Landroid/util/SparseArray;->put(ILjava/lang/Object;)V

    :goto_a
    move-object/from16 v0, p0

    move v13, v15

    move-object/from16 v4, v25

    move-object/from16 v6, v31

    const/4 v10, 0x0

    const/16 v11, 0xc

    const/16 v14, 0xd

    const/4 v15, 0x4

    goto/16 :goto_1

    :cond_21
    move-object/from16 v31, v6

    invoke-virtual {v3}, Landroid/util/SparseIntArray;->size()I

    move-result v0

    const/4 v6, 0x0

    :goto_b
    if-ge v6, v0, :cond_23

    invoke-virtual {v3, v6}, Landroid/util/SparseIntArray;->keyAt(I)I

    move-result v1

    invoke-virtual {v3, v6}, Landroid/util/SparseIntArray;->valueAt(I)I

    move-result v4

    const/4 v9, 0x1

    invoke-virtual {v7, v1, v9}, Landroid/util/SparseBooleanArray;->put(IZ)V

    iget-object v10, v5, Lab/j0;->i:Landroid/util/SparseBooleanArray;

    invoke-virtual {v10, v4, v9}, Landroid/util/SparseBooleanArray;->put(IZ)V

    invoke-virtual {v2, v6}, Landroid/util/SparseArray;->valueAt(I)Ljava/lang/Object;

    move-result-object v9

    check-cast v9, Lab/m0;

    if-eqz v9, :cond_22

    iget-object v10, v5, Lab/j0;->l:Lt9/q;

    new-instance v11, Lab/l0;

    const/16 v13, 0x2000

    const/4 v14, 0x0

    invoke-direct {v11, v12, v1, v13, v14}, Lab/l0;-><init>(IIII)V

    invoke-interface {v9, v8, v10, v11}, Lab/m0;->g(Lx8/s;Lt9/q;Lab/l0;)V

    move-object/from16 v1, v31

    invoke-virtual {v1, v4, v9}, Landroid/util/SparseArray;->put(ILjava/lang/Object;)V

    goto :goto_c

    :cond_22
    move-object/from16 v1, v31

    :goto_c
    add-int/lit8 v6, v6, 0x1

    move-object/from16 v31, v1

    goto :goto_b

    :cond_23
    move-object/from16 v4, p0

    move-object/from16 v1, v31

    iget v0, v4, Lab/i0;->x:I

    invoke-virtual {v1, v0}, Landroid/util/SparseArray;->remove(I)V

    const/4 v14, 0x0

    iput v14, v5, Lab/j0;->m:I

    iget-object v0, v5, Lab/j0;->l:Lt9/q;

    invoke-interface {v0}, Lt9/q;->l()V

    const/4 v9, 0x1

    iput-boolean v9, v5, Lab/j0;->n:Z

    return-void

    :pswitch_data_0
    .packed-switch 0xf
        :pswitch_5
        :pswitch_4
        :pswitch_3
    .end packed-switch

    :pswitch_data_1
    .packed-switch 0x80
        :pswitch_7
        :pswitch_2
        :pswitch_0
    .end packed-switch

    :pswitch_data_2
    .packed-switch 0x86
        :pswitch_1
        :pswitch_2
        :pswitch_6
    .end packed-switch
.end method

.method public d()Lq3/g0;
    .locals 1

    iget v0, p0, Lab/i0;->w:I

    packed-switch v0, :pswitch_data_0

    iget-object v0, p0, Lab/i0;->z:Ljava/lang/Object;

    check-cast v0, Lx30/g;

    return-object v0

    :pswitch_0
    iget-object v0, p0, Lab/i0;->z:Ljava/lang/Object;

    check-cast v0, Lg40/h2;

    return-object v0

    nop

    :pswitch_data_0
    .packed-switch 0x8
        :pswitch_0
    .end packed-switch
.end method

.method public e()Ljava/lang/String;
    .locals 1

    iget v0, p0, Lab/i0;->w:I

    packed-switch v0, :pswitch_data_0

    const-string v0, "10-80-00"

    return-object v0

    :pswitch_0
    const-string v0, "00012345"

    return-object v0

    nop

    :pswitch_data_0
    .packed-switch 0x8
        :pswitch_0
    .end packed-switch
.end method

.method public f(Led3/a;)V
    .locals 32

    move-object/from16 v0, p0

    move-object/from16 v1, p1

    iget-object v2, v0, Lab/i0;->z:Ljava/lang/Object;

    check-cast v2, Landroid/util/SparseArray;

    iget-object v3, v0, Lab/i0;->E:Ljava/lang/Object;

    check-cast v3, Landroid/util/SparseIntArray;

    iget-object v4, v0, Lab/i0;->y:Ljava/lang/Object;

    check-cast v4, Llo/s;

    iget-object v5, v0, Lab/i0;->F:Ljava/lang/Object;

    check-cast v5, Lfn/x;

    iget-object v6, v5, Lfn/x;->f:Landroid/util/SparseArray;

    iget-object v7, v5, Lfn/x;->g:Landroid/util/SparseBooleanArray;

    iget-object v8, v5, Lfn/x;->e:Lfn/f;

    iget-object v9, v5, Lfn/x;->b:Ljava/util/List;

    iget v10, v5, Lfn/x;->a:I

    invoke-virtual {v1}, Led3/a;->y()I

    move-result v11

    const/4 v12, 0x2

    if-eq v11, v12, :cond_0

    :goto_0
    move-object v1, v0

    goto/16 :goto_16

    :cond_0
    const/4 v11, 0x0

    const/4 v13, 0x1

    if-eq v10, v13, :cond_2

    if-eq v10, v12, :cond_2

    iget v14, v5, Lfn/x;->l:I

    if-ne v14, v13, :cond_1

    goto :goto_1

    :cond_1
    new-instance v14, Llo/x;

    invoke-interface {v9, v11}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v15

    check-cast v15, Llo/x;

    invoke-virtual {v15}, Llo/x;->c()J

    move-result-wide v12

    invoke-direct {v14, v12, v13}, Llo/x;-><init>(J)V

    invoke-interface {v9, v14}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    goto :goto_2

    :cond_2
    :goto_1
    invoke-interface {v9, v11}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v9

    move-object v14, v9

    check-cast v14, Llo/x;

    :goto_2
    invoke-virtual {v1}, Led3/a;->y()I

    move-result v9

    and-int/lit16 v9, v9, 0x80

    if-nez v9, :cond_3

    goto :goto_0

    :cond_3
    const/4 v9, 0x1

    invoke-virtual {v1, v9}, Led3/a;->L(I)V

    invoke-virtual {v1}, Led3/a;->D()I

    move-result v9

    const/4 v12, 0x3

    invoke-virtual {v1, v12}, Led3/a;->L(I)V

    iget-object v13, v4, Llo/s;->b:[B

    const/4 v15, 0x2

    invoke-virtual {v1, v13, v11, v15}, Led3/a;->g([BII)V

    invoke-virtual {v4, v11}, Llo/s;->q(I)V

    invoke-virtual {v4, v12}, Llo/s;->t(I)V

    const/16 v13, 0xd

    invoke-virtual {v4, v13}, Llo/s;->i(I)I

    move-result v12

    iput v12, v5, Lfn/x;->r:I

    iget-object v12, v4, Llo/s;->b:[B

    invoke-virtual {v1, v12, v11, v15}, Led3/a;->g([BII)V

    invoke-virtual {v4, v11}, Llo/s;->q(I)V

    const/4 v12, 0x4

    invoke-virtual {v4, v12}, Llo/s;->t(I)V

    const/16 v12, 0xc

    invoke-virtual {v4, v12}, Llo/s;->i(I)I

    move-result v13

    invoke-virtual {v1, v13}, Led3/a;->L(I)V

    const/4 v12, 0x0

    const/16 v11, 0x15

    if-ne v10, v15, :cond_4

    iget-object v15, v5, Lfn/x;->p:Lfn/z;

    if-nez v15, :cond_4

    new-instance v15, La33/d;

    sget-object v13, Llo/y;->f:[B

    invoke-direct {v15, v11, v12, v12, v13}, La33/d;-><init>(ILjava/lang/String;Ljava/util/ArrayList;[B)V

    invoke-virtual {v8, v11, v15}, Lfn/f;->a(ILa33/d;)Lfn/z;

    move-result-object v13

    iput-object v13, v5, Lfn/x;->p:Lfn/z;

    if-eqz v13, :cond_4

    iget-object v15, v5, Lfn/x;->k:Lwm/k;

    new-instance v12, Lab/l0;

    const/4 v0, 0x1

    move-object/from16 v18, v6

    const/16 v6, 0x2000

    invoke-direct {v12, v9, v11, v6, v0}, Lab/l0;-><init>(IIII)V

    invoke-interface {v13, v14, v15, v12}, Lfn/z;->i(Llo/x;Lwm/k;Lab/l0;)V

    goto :goto_3

    :cond_4
    move-object/from16 v18, v6

    :goto_3
    invoke-virtual {v2}, Landroid/util/SparseArray;->clear()V

    invoke-virtual {v3}, Landroid/util/SparseIntArray;->clear()V

    invoke-virtual {v1}, Led3/a;->a()I

    move-result v0

    :goto_4
    if-lez v0, :cond_1b

    iget-object v6, v4, Llo/s;->b:[B

    const/4 v12, 0x5

    const/4 v13, 0x0

    invoke-virtual {v1, v6, v13, v12}, Led3/a;->g([BII)V

    invoke-virtual {v4, v13}, Llo/s;->q(I)V

    const/16 v6, 0x8

    invoke-virtual {v4, v6}, Llo/s;->i(I)I

    move-result v6

    const/4 v13, 0x3

    invoke-virtual {v4, v13}, Llo/s;->t(I)V

    const/16 v13, 0xd

    invoke-virtual {v4, v13}, Llo/s;->i(I)I

    move-result v15

    const/4 v13, 0x4

    invoke-virtual {v4, v13}, Llo/s;->t(I)V

    const/16 v13, 0xc

    invoke-virtual {v4, v13}, Llo/s;->i(I)I

    move-result v17

    iget v13, v1, Led3/a;->b:I

    add-int v11, v13, v17

    const/16 v19, -0x1

    move/from16 v20, v19

    const/16 v21, 0x0

    const/16 v22, 0x0

    :goto_5
    iget v12, v1, Led3/a;->b:I

    if-ge v12, v11, :cond_13

    invoke-virtual {v1}, Led3/a;->y()I

    move-result v12

    invoke-virtual {v1}, Led3/a;->y()I

    move-result v23

    move/from16 v24, v0

    iget v0, v1, Led3/a;->b:I

    add-int v0, v0, v23

    if-le v0, v11, :cond_5

    :goto_6
    move-object/from16 v27, v4

    move/from16 v26, v9

    move-object/from16 v16, v14

    const/4 v0, 0x4

    goto/16 :goto_d

    :cond_5
    const/16 v23, 0xac

    const/16 v25, 0x87

    const/16 v26, 0x81

    move-object/from16 v27, v4

    const/4 v4, 0x5

    if-ne v12, v4, :cond_a

    invoke-virtual {v1}, Led3/a;->z()J

    move-result-wide v28

    const-wide/32 v30, 0x41432d33

    cmp-long v4, v28, v30

    if-nez v4, :cond_6

    move/from16 v20, v26

    goto :goto_8

    :cond_6
    const-wide/32 v30, 0x45414333

    cmp-long v4, v28, v30

    if-nez v4, :cond_7

    move/from16 v20, v25

    goto :goto_8

    :cond_7
    const-wide/32 v25, 0x41432d34

    cmp-long v4, v28, v25

    if-nez v4, :cond_8

    :goto_7
    move/from16 v20, v23

    goto :goto_8

    :cond_8
    const-wide/32 v25, 0x48455643

    cmp-long v4, v28, v25

    if-nez v4, :cond_9

    const/16 v20, 0x24

    :cond_9
    :goto_8
    move/from16 v25, v0

    :goto_9
    move/from16 v26, v9

    move-object/from16 v16, v14

    :goto_a
    const/4 v0, 0x4

    goto/16 :goto_c

    :cond_a
    const/16 v4, 0x6a

    if-ne v12, v4, :cond_b

    move/from16 v25, v0

    move-object/from16 v16, v14

    move/from16 v20, v26

    const/4 v0, 0x4

    move/from16 v26, v9

    goto/16 :goto_c

    :cond_b
    const/16 v4, 0x7a

    if-ne v12, v4, :cond_c

    move/from16 v26, v9

    move-object/from16 v16, v14

    move/from16 v20, v25

    move/from16 v25, v0

    goto :goto_a

    :cond_c
    const/16 v4, 0x7f

    if-ne v12, v4, :cond_d

    invoke-virtual {v1}, Led3/a;->y()I

    move-result v4

    const/16 v12, 0x15

    if-ne v4, v12, :cond_9

    goto :goto_7

    :cond_d
    const/16 v4, 0x7b

    if-ne v12, v4, :cond_e

    const/16 v4, 0x8a

    move/from16 v25, v0

    move/from16 v20, v4

    goto :goto_9

    :cond_e
    const/16 v4, 0xa

    if-ne v12, v4, :cond_f

    sget-object v4, Lyr/d;->c:Ljava/nio/charset/Charset;

    const/4 v12, 0x3

    invoke-virtual {v1, v12, v4}, Led3/a;->v(ILjava/nio/charset/Charset;)Ljava/lang/String;

    move-result-object v4

    invoke-virtual {v4}, Ljava/lang/String;->trim()Ljava/lang/String;

    move-result-object v21

    goto :goto_8

    :cond_f
    const/16 v4, 0x59

    if-ne v12, v4, :cond_11

    new-instance v12, Ljava/util/ArrayList;

    invoke-direct {v12}, Ljava/util/ArrayList;-><init>()V

    :goto_b
    iget v4, v1, Led3/a;->b:I

    if-ge v4, v0, :cond_10

    sget-object v4, Lyr/d;->c:Ljava/nio/charset/Charset;

    move/from16 v25, v0

    const/4 v0, 0x3

    invoke-virtual {v1, v0, v4}, Led3/a;->v(ILjava/nio/charset/Charset;)Ljava/lang/String;

    move-result-object v4

    invoke-virtual {v4}, Ljava/lang/String;->trim()Ljava/lang/String;

    move-result-object v4

    invoke-virtual {v1}, Led3/a;->y()I

    move-object/from16 v16, v14

    const/4 v0, 0x4

    new-array v14, v0, [B

    move/from16 v26, v9

    const/4 v9, 0x0

    invoke-virtual {v1, v14, v9, v0}, Led3/a;->g([BII)V

    new-instance v9, Lfn/y;

    invoke-direct {v9, v4, v14}, Lfn/y;-><init>(Ljava/lang/String;[B)V

    invoke-virtual {v12, v9}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    move-object/from16 v14, v16

    move/from16 v0, v25

    move/from16 v9, v26

    goto :goto_b

    :cond_10
    move/from16 v25, v0

    move/from16 v26, v9

    move-object/from16 v16, v14

    const/4 v0, 0x4

    move-object/from16 v22, v12

    const/16 v20, 0x59

    goto :goto_c

    :cond_11
    move/from16 v25, v0

    move/from16 v26, v9

    move-object/from16 v16, v14

    const/4 v0, 0x4

    const/16 v4, 0x6f

    if-ne v12, v4, :cond_12

    const/16 v4, 0x101

    move/from16 v20, v4

    :cond_12
    :goto_c
    iget v4, v1, Led3/a;->b:I

    sub-int v4, v25, v4

    invoke-virtual {v1, v4}, Led3/a;->L(I)V

    move-object/from16 v14, v16

    move/from16 v0, v24

    move/from16 v9, v26

    move-object/from16 v4, v27

    goto/16 :goto_5

    :cond_13
    move/from16 v24, v0

    goto/16 :goto_6

    :goto_d
    invoke-virtual {v1, v11}, Led3/a;->K(I)V

    new-instance v4, La33/d;

    iget-object v9, v1, Led3/a;->a:[B

    invoke-static {v9, v13, v11}, Ljava/util/Arrays;->copyOfRange([BII)[B

    move-result-object v9

    move/from16 v11, v20

    move-object/from16 v12, v21

    move-object/from16 v13, v22

    invoke-direct {v4, v11, v12, v13, v9}, La33/d;-><init>(ILjava/lang/String;Ljava/util/ArrayList;[B)V

    const/4 v9, 0x6

    if-eq v6, v9, :cond_14

    const/4 v9, 0x5

    if-ne v6, v9, :cond_15

    :cond_14
    move v6, v11

    :cond_15
    add-int/lit8 v17, v17, 0x5

    sub-int v9, v24, v17

    const/4 v11, 0x2

    if-ne v10, v11, :cond_16

    move v12, v6

    goto :goto_e

    :cond_16
    move v12, v15

    :goto_e
    invoke-virtual {v7, v12}, Landroid/util/SparseBooleanArray;->get(I)Z

    move-result v13

    if-eqz v13, :cond_17

    const/16 v13, 0x15

    goto :goto_10

    :cond_17
    const/16 v13, 0x15

    if-ne v10, v11, :cond_18

    if-ne v6, v13, :cond_18

    iget-object v4, v5, Lfn/x;->p:Lfn/z;

    goto :goto_f

    :cond_18
    invoke-virtual {v8, v6, v4}, Lfn/f;->a(ILa33/d;)Lfn/z;

    move-result-object v4

    :goto_f
    if-ne v10, v11, :cond_19

    const/16 v6, 0x2000

    invoke-virtual {v3, v12, v6}, Landroid/util/SparseIntArray;->get(II)I

    move-result v11

    if-ge v15, v11, :cond_1a

    :cond_19
    invoke-virtual {v3, v12, v15}, Landroid/util/SparseIntArray;->put(II)V

    invoke-virtual {v2, v12, v4}, Landroid/util/SparseArray;->put(ILjava/lang/Object;)V

    :cond_1a
    :goto_10
    move v0, v9

    move v11, v13

    move-object/from16 v14, v16

    move/from16 v9, v26

    move-object/from16 v4, v27

    goto/16 :goto_4

    :cond_1b
    move/from16 v26, v9

    move-object/from16 v16, v14

    invoke-virtual {v3}, Landroid/util/SparseIntArray;->size()I

    move-result v0

    const/4 v13, 0x0

    :goto_11
    if-ge v13, v0, :cond_1e

    invoke-virtual {v3, v13}, Landroid/util/SparseIntArray;->keyAt(I)I

    move-result v1

    invoke-virtual {v3, v13}, Landroid/util/SparseIntArray;->valueAt(I)I

    move-result v4

    const/4 v9, 0x1

    invoke-virtual {v7, v1, v9}, Landroid/util/SparseBooleanArray;->put(IZ)V

    iget-object v6, v5, Lfn/x;->h:Landroid/util/SparseBooleanArray;

    invoke-virtual {v6, v4, v9}, Landroid/util/SparseBooleanArray;->put(IZ)V

    invoke-virtual {v2, v13}, Landroid/util/SparseArray;->valueAt(I)Ljava/lang/Object;

    move-result-object v6

    check-cast v6, Lfn/z;

    if-eqz v6, :cond_1d

    iget-object v8, v5, Lfn/x;->p:Lfn/z;

    if-eq v6, v8, :cond_1c

    iget-object v8, v5, Lfn/x;->k:Lwm/k;

    new-instance v9, Lab/l0;

    const/4 v11, 0x1

    move/from16 v12, v26

    const/16 v14, 0x2000

    invoke-direct {v9, v12, v1, v14, v11}, Lab/l0;-><init>(IIII)V

    move-object/from16 v1, v16

    invoke-interface {v6, v1, v8, v9}, Lfn/z;->i(Llo/x;Lwm/k;Lab/l0;)V

    :goto_12
    move-object/from16 v8, v18

    goto :goto_13

    :cond_1c
    move-object/from16 v1, v16

    move/from16 v12, v26

    const/16 v14, 0x2000

    goto :goto_12

    :goto_13
    invoke-virtual {v8, v4, v6}, Landroid/util/SparseArray;->put(ILjava/lang/Object;)V

    goto :goto_14

    :cond_1d
    move-object/from16 v1, v16

    move-object/from16 v8, v18

    move/from16 v12, v26

    const/16 v14, 0x2000

    :goto_14
    add-int/lit8 v13, v13, 0x1

    move-object/from16 v16, v1

    move-object/from16 v18, v8

    move/from16 v26, v12

    goto :goto_11

    :cond_1e
    move-object/from16 v8, v18

    const/4 v15, 0x2

    if-ne v10, v15, :cond_20

    iget-boolean v0, v5, Lfn/x;->m:Z

    if-nez v0, :cond_1f

    iget-object v0, v5, Lfn/x;->k:Lwm/k;

    invoke-interface {v0}, Lwm/k;->l()V

    const/4 v9, 0x0

    iput v9, v5, Lfn/x;->l:I

    const/4 v0, 0x1

    iput-boolean v0, v5, Lfn/x;->m:Z

    return-void

    :cond_1f
    move-object/from16 v1, p0

    goto :goto_16

    :cond_20
    move-object/from16 v1, p0

    const/4 v0, 0x1

    const/4 v9, 0x0

    iget v2, v1, Lab/i0;->x:I

    invoke-virtual {v8, v2}, Landroid/util/SparseArray;->remove(I)V

    if-ne v10, v0, :cond_21

    move v11, v9

    goto :goto_15

    :cond_21
    iget v2, v5, Lfn/x;->l:I

    add-int/lit8 v11, v2, -0x1

    :goto_15
    iput v11, v5, Lfn/x;->l:I

    if-nez v11, :cond_22

    iget-object v2, v5, Lfn/x;->k:Lwm/k;

    invoke-interface {v2}, Lwm/k;->l()V

    iput-boolean v0, v5, Lfn/x;->m:Z

    :cond_22
    :goto_16
    return-void
.end method

.method public g(Lx8/s;Lt9/q;Lab/l0;)V
    .locals 0

    return-void
.end method

.method public getLabel()Lzy/c;
    .locals 1

    iget v0, p0, Lab/i0;->w:I

    packed-switch v0, :pswitch_data_0

    iget-object v0, p0, Lab/i0;->y:Ljava/lang/Object;

    check-cast v0, Lzy/b;

    return-object v0

    :pswitch_0
    iget-object v0, p0, Lab/i0;->y:Ljava/lang/Object;

    check-cast v0, Lzy/b;

    return-object v0

    nop

    :pswitch_data_0
    .packed-switch 0x8
        :pswitch_0
    .end packed-switch
.end method

.method public getLayoutDirection()Ly3/m;
    .locals 1

    iget v0, p0, Lab/i0;->w:I

    packed-switch v0, :pswitch_data_0

    const/4 v0, 0x0

    return-object v0

    :pswitch_0
    const/4 v0, 0x0

    return-object v0

    nop

    :pswitch_data_0
    .packed-switch 0x8
        :pswitch_0
    .end packed-switch
.end method

.method public getLoading()Lec3/h2;
    .locals 1

    iget v0, p0, Lab/i0;->w:I

    packed-switch v0, :pswitch_data_0

    iget-object v0, p0, Lab/i0;->F:Ljava/lang/Object;

    check-cast v0, Lec3/h2;

    return-object v0

    :pswitch_0
    iget-object v0, p0, Lab/i0;->F:Ljava/lang/Object;

    check-cast v0, Lec3/h2;

    return-object v0

    nop

    :pswitch_data_0
    .packed-switch 0x8
        :pswitch_0
    .end packed-switch
.end method

.method public h()I
    .locals 1

    iget v0, p0, Lab/i0;->w:I

    packed-switch v0, :pswitch_data_0

    const/4 v0, 0x0

    return v0

    :pswitch_0
    const/4 v0, 0x0

    return v0

    nop

    :pswitch_data_0
    .packed-switch 0x8
        :pswitch_0
    .end packed-switch
.end method

.method public i(Llo/x;Lwm/k;Lab/l0;)V
    .locals 0

    return-void
.end method

.method public j(Ljava/lang/String;)Ljava/lang/String;
    .locals 5

    iget v0, p0, Lab/i0;->w:I

    packed-switch v0, :pswitch_data_0

    const-string v0, "userTyped"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    invoke-interface {p1}, Ljava/lang/CharSequence;->length()I

    move-result v1

    const/4 v2, 0x0

    :goto_0
    if-ge v2, v1, :cond_1

    invoke-interface {p1, v2}, Ljava/lang/CharSequence;->charAt(I)C

    move-result v3

    invoke-static {v3}, Ljava/lang/Character;->isDigit(C)Z

    move-result v4

    if-eqz v4, :cond_0

    invoke-interface {v0, v3}, Ljava/lang/Appendable;->append(C)Ljava/lang/Appendable;

    :cond_0
    add-int/lit8 v2, v2, 0x1

    goto :goto_0

    :cond_1
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    const/4 v0, 0x6

    invoke-static {v0, p1}, Lyb3/r;->L0(ILjava/lang/String;)Ljava/lang/String;

    move-result-object p1

    return-object p1

    :pswitch_0
    const-string v0, "userTyped"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    invoke-interface {p1}, Ljava/lang/CharSequence;->length()I

    move-result v1

    const/4 v2, 0x0

    :goto_1
    if-ge v2, v1, :cond_3

    invoke-interface {p1, v2}, Ljava/lang/CharSequence;->charAt(I)C

    move-result v3

    invoke-static {v3}, Ljava/lang/Character;->isDigit(C)Z

    move-result v4

    if-eqz v4, :cond_2

    invoke-interface {v0, v3}, Ljava/lang/Appendable;->append(C)Ljava/lang/Appendable;

    :cond_2
    add-int/lit8 v2, v2, 0x1

    goto :goto_1

    :cond_3
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    const/16 v0, 0x8

    invoke-static {v0, p1}, Lyb3/r;->L0(ILjava/lang/String;)Ljava/lang/String;

    move-result-object p1

    return-object p1

    :pswitch_data_0
    .packed-switch 0x8
        :pswitch_0
    .end packed-switch
.end method

.method public k(Ljava/lang/String;)Lg40/s3;
    .locals 1

    iget v0, p0, Lab/i0;->w:I

    packed-switch v0, :pswitch_data_0

    const-string v0, "input"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-static {p1}, Lyb3/r;->i0(Ljava/lang/CharSequence;)Z

    move-result v0

    if-eqz v0, :cond_0

    sget-object p1, Lg40/t3;->b:Lg40/t3;

    goto :goto_0

    :cond_0
    invoke-virtual {p1}, Ljava/lang/String;->length()I

    move-result p1

    const/4 v0, 0x6

    if-ge p1, v0, :cond_1

    new-instance p1, Lg40/u3;

    const v0, 0x7f140fbc

    invoke-direct {p1, v0}, Lg40/u3;-><init>(I)V

    goto :goto_0

    :cond_1
    new-instance p1, Lg40/x3;

    const/4 v0, 0x0

    invoke-direct {p1, v0}, Lg40/x3;-><init>(Lg40/g1;)V

    :goto_0
    return-object p1

    :pswitch_0
    const-string v0, "input"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-static {p1}, Lyb3/r;->i0(Ljava/lang/CharSequence;)Z

    move-result v0

    if-eqz v0, :cond_2

    sget-object p1, Lg40/t3;->b:Lg40/t3;

    goto :goto_1

    :cond_2
    invoke-virtual {p1}, Ljava/lang/String;->length()I

    move-result p1

    const/16 v0, 0x8

    if-ge p1, v0, :cond_3

    new-instance p1, Lg40/u3;

    const v0, 0x7f140fb8

    invoke-direct {p1, v0}, Lg40/u3;-><init>(I)V

    goto :goto_1

    :cond_3
    new-instance p1, Lg40/x3;

    const/4 v0, 0x0

    invoke-direct {p1, v0}, Lg40/x3;-><init>(Lg40/g1;)V

    :goto_1
    return-object p1

    :pswitch_data_0
    .packed-switch 0x8
        :pswitch_0
    .end packed-switch
.end method

.method public l()Z
    .locals 1

    iget v0, p0, Lab/i0;->w:I

    packed-switch v0, :pswitch_data_0

    const/4 v0, 0x0

    return v0

    :pswitch_0
    const/4 v0, 0x0

    return v0

    nop

    :pswitch_data_0
    .packed-switch 0x8
        :pswitch_0
    .end packed-switch
.end method

.method public m(Ljava/lang/String;)Ljava/lang/String;
    .locals 1

    iget v0, p0, Lab/i0;->w:I

    packed-switch v0, :pswitch_data_0

    :pswitch_0
    const-string v0, "displayName"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    return-object p1

    nop

    :pswitch_data_0
    .packed-switch 0x8
        :pswitch_0
    .end packed-switch
.end method

.method public n()I
    .locals 1

    iget v0, p0, Lab/i0;->w:I

    packed-switch v0, :pswitch_data_0

    iget v0, p0, Lab/i0;->x:I

    return v0

    :pswitch_0
    iget v0, p0, Lab/i0;->x:I

    return v0

    nop

    :pswitch_data_0
    .packed-switch 0x8
        :pswitch_0
    .end packed-switch
.end method

.method public o()Z
    .locals 1

    iget v0, p0, Lab/i0;->w:I

    packed-switch v0, :pswitch_data_0

    const/4 v0, 0x1

    return v0

    :pswitch_0
    const/4 v0, 0x1

    return v0

    nop

    :pswitch_data_0
    .packed-switch 0x8
        :pswitch_0
    .end packed-switch
.end method

.method public p()Z
    .locals 1

    iget v0, p0, Lab/i0;->w:I

    packed-switch v0, :pswitch_data_0

    const/4 v0, 0x1

    return v0

    :pswitch_0
    const/4 v0, 0x1

    return v0

    nop

    :pswitch_data_0
    .packed-switch 0x8
        :pswitch_0
    .end packed-switch
.end method

.method public r(Lyy/m0;Ls83/c;)Ljava/lang/Object;
    .locals 6

    iget v3, p0, Lab/i0;->x:I

    invoke-virtual {p1}, Lyy/m0;->getRetryResponseCodes()Ljava/lang/Iterable;

    move-result-object v2

    new-instance v1, Lyo1/b;

    const/4 v0, 0x5

    invoke-direct {v1, v0, p0, p1}, Lyo1/b;-><init>(ILjava/lang/Object;Ljava/lang/Object;)V

    iget-object p1, p0, Lab/i0;->y:Ljava/lang/Object;

    check-cast p1, Lq83/j;

    new-instance v0, Ll1/v0;

    const/4 v5, 0x0

    move-object v4, p0

    invoke-direct/range {v0 .. v5}, Ll1/v0;-><init>(Lyo1/b;Ljava/lang/Iterable;ILab/i0;Lq83/d;)V

    invoke-static {p1, v0, p2}, Lbc3/f0;->K(Lq83/j;Lc93/m;Lq83/d;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public s(Ljava/lang/Iterable;)V
    .locals 2

    if-eqz p1, :cond_2

    invoke-interface {p1}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object p1

    :cond_0
    :goto_0
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_1

    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lqe3/a;

    instance-of v1, v0, Lbf3/a;

    if-eqz v1, :cond_0

    check-cast v0, Lbf3/a;

    invoke-interface {v0, p0}, Lbf3/a;->a(Lab/i0;)V

    goto :goto_0

    :cond_1
    return-void

    :cond_2
    new-instance p1, Ljava/lang/NullPointerException;

    const-string v0, "extensions must not be null"

    invoke-direct {p1, v0}, Ljava/lang/NullPointerException;-><init>(Ljava/lang/String;)V

    throw p1
.end method

.method public t(Ljava/lang/String;)I
    .locals 1

    iget v0, p0, Lab/i0;->w:I

    packed-switch v0, :pswitch_data_0

    iget v0, p0, Lab/i0;->x:I

    invoke-static {v0, p1}, Landroid/opengl/GLES20;->glGetAttribLocation(ILjava/lang/String;)I

    move-result p1

    invoke-static {p1}, Landroid/opengl/GLES20;->glEnableVertexAttribArray(I)V

    invoke-static {}, Lx8/a;->c()V

    return p1

    :pswitch_0
    iget v0, p0, Lab/i0;->x:I

    invoke-static {v0, p1}, Landroid/opengl/GLES20;->glGetAttribLocation(ILjava/lang/String;)I

    move-result p1

    invoke-static {p1}, Landroid/opengl/GLES20;->glEnableVertexAttribArray(I)V

    invoke-static {}, Llo/a;->g()V

    return p1

    nop

    :pswitch_data_0
    .packed-switch 0x5
        :pswitch_0
    .end packed-switch
.end method
