.class public final Lb30/m;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lxn/e;
.implements Lim/b;
.implements Loa3/n;
.implements Log/e;
.implements Lqa/e;


# instance fields
.field public E:Ljava/lang/Object;

.field public F:Ljava/lang/Object;

.field public final synthetic w:I

.field public x:Ljava/lang/Object;

.field public y:Ljava/lang/Object;

.field public z:Ljava/lang/Object;


# direct methods
.method public synthetic constructor <init>(I)V
    .locals 0

    .line 1
    iput p1, p0, Lb30/m;->w:I

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public constructor <init>(Landroid/content/Context;Ljava/lang/String;Ljava/lang/String;Lz23/c;Lso/q;)V
    .locals 1

    const/16 v0, 0x17

    iput v0, p0, Lb30/m;->w:I

    const-string v0, "context"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "callType"

    invoke-static {p3, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "eventReporter"

    invoke-static {p4, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    .line 79
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 80
    iput-object p1, p0, Lb30/m;->x:Ljava/lang/Object;

    .line 81
    iput-object p2, p0, Lb30/m;->y:Ljava/lang/Object;

    .line 82
    iput-object p3, p0, Lb30/m;->z:Ljava/lang/Object;

    .line 83
    iput-object p4, p0, Lb30/m;->E:Ljava/lang/Object;

    .line 84
    iput-object p5, p0, Lb30/m;->F:Ljava/lang/Object;

    return-void
.end method

.method public constructor <init>(Landroid/graphics/drawable/Drawable$Callback;)V
    .locals 3

    const/16 v0, 0x15

    iput v0, p0, Lb30/m;->w:I

    .line 96
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 97
    new-instance v0, Lpg3/p;

    const/16 v1, 0xb

    const/4 v2, 0x0

    .line 98
    invoke-direct {v0, v1, v2}, Lpg3/p;-><init>(IZ)V

    .line 99
    iput-object v0, p0, Lb30/m;->x:Ljava/lang/Object;

    .line 100
    new-instance v0, Ljava/util/HashMap;

    invoke-direct {v0}, Ljava/util/HashMap;-><init>()V

    iput-object v0, p0, Lb30/m;->y:Ljava/lang/Object;

    .line 101
    new-instance v0, Ljava/util/HashMap;

    invoke-direct {v0}, Ljava/util/HashMap;-><init>()V

    iput-object v0, p0, Lb30/m;->z:Ljava/lang/Object;

    .line 102
    const-string v0, ".ttf"

    iput-object v0, p0, Lb30/m;->F:Ljava/lang/Object;

    .line 103
    instance-of v0, p1, Landroid/view/View;

    if-nez v0, :cond_0

    .line 104
    const-string p1, "LottieDrawable must be inside of a view for images to work."

    invoke-static {p1}, Ldj/c;->b(Ljava/lang/String;)V

    const/4 p1, 0x0

    .line 105
    iput-object p1, p0, Lb30/m;->E:Ljava/lang/Object;

    goto :goto_0

    .line 106
    :cond_0
    check-cast p1, Landroid/view/View;

    invoke-virtual {p1}, Landroid/view/View;->getContext()Landroid/content/Context;

    move-result-object p1

    invoke-virtual {p1}, Landroid/content/Context;->getAssets()Landroid/content/res/AssetManager;

    move-result-object p1

    iput-object p1, p0, Lb30/m;->E:Ljava/lang/Object;

    :goto_0
    return-void
.end method

.method public constructor <init>(Landroid/text/Layout;)V
    .locals 5

    const/16 v0, 0x8

    iput v0, p0, Lb30/m;->w:I

    .line 107
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lb30/m;->x:Ljava/lang/Object;

    .line 108
    new-instance p1, Ljava/util/ArrayList;

    invoke-direct {p1}, Ljava/util/ArrayList;-><init>()V

    const/4 v0, 0x0

    move v1, v0

    .line 109
    :cond_0
    iget-object v2, p0, Lb30/m;->x:Ljava/lang/Object;

    check-cast v2, Landroid/text/Layout;

    invoke-virtual {v2}, Landroid/text/Layout;->getText()Ljava/lang/CharSequence;

    move-result-object v2

    const/16 v3, 0xa

    const/4 v4, 0x4

    invoke-static {v2, v3, v1, v0, v4}, Lyb3/r;->f0(Ljava/lang/CharSequence;CIZI)I

    move-result v1

    if-gez v1, :cond_1

    .line 110
    iget-object v1, p0, Lb30/m;->x:Ljava/lang/Object;

    check-cast v1, Landroid/text/Layout;

    invoke-virtual {v1}, Landroid/text/Layout;->getText()Ljava/lang/CharSequence;

    move-result-object v1

    invoke-interface {v1}, Ljava/lang/CharSequence;->length()I

    move-result v1

    goto :goto_0

    :cond_1
    add-int/lit8 v1, v1, 0x1

    .line 111
    :goto_0
    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    invoke-virtual {p1, v2}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 112
    iget-object v2, p0, Lb30/m;->x:Ljava/lang/Object;

    check-cast v2, Landroid/text/Layout;

    invoke-virtual {v2}, Landroid/text/Layout;->getText()Ljava/lang/CharSequence;

    move-result-object v2

    invoke-interface {v2}, Ljava/lang/CharSequence;->length()I

    move-result v2

    if-lt v1, v2, :cond_0

    .line 113
    iput-object p1, p0, Lb30/m;->y:Ljava/lang/Object;

    .line 114
    invoke-virtual {p1}, Ljava/util/ArrayList;->size()I

    move-result p1

    new-instance v1, Ljava/util/ArrayList;

    invoke-direct {v1, p1}, Ljava/util/ArrayList;-><init>(I)V

    :goto_1
    if-ge v0, p1, :cond_2

    const/4 v2, 0x0

    invoke-virtual {v1, v2}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    add-int/lit8 v0, v0, 0x1

    goto :goto_1

    :cond_2
    iput-object v1, p0, Lb30/m;->z:Ljava/lang/Object;

    .line 115
    iget-object p1, p0, Lb30/m;->y:Ljava/lang/Object;

    check-cast p1, Ljava/util/ArrayList;

    invoke-virtual {p1}, Ljava/util/ArrayList;->size()I

    move-result p1

    new-array p1, p1, [Z

    iput-object p1, p0, Lb30/m;->E:Ljava/lang/Object;

    .line 116
    iget-object p1, p0, Lb30/m;->y:Ljava/lang/Object;

    check-cast p1, Ljava/util/ArrayList;

    invoke-virtual {p1}, Ljava/util/ArrayList;->size()I

    return-void
.end method

.method public constructor <init>(Lbc3/c0;Lny/d;Lv00/c0;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;)V
    .locals 1

    const/16 v0, 0xa

    iput v0, p0, Lb30/m;->w:I

    const-string v0, "coroutineScope"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "tapToAddCollectionHandler"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "paymentMethodMetadata"

    invoke-static {p3, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    .line 156
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 157
    iput-object p1, p0, Lb30/m;->x:Ljava/lang/Object;

    .line 158
    iput-object p2, p0, Lb30/m;->y:Ljava/lang/Object;

    .line 159
    iput-object p4, p0, Lb30/m;->z:Ljava/lang/Object;

    .line 160
    iput-object p5, p0, Lb30/m;->E:Ljava/lang/Object;

    const/4 p1, 0x0

    .line 161
    invoke-static {p1}, Lec3/v;->c(Ljava/lang/Object;)Lec3/h2;

    move-result-object p1

    .line 162
    invoke-static {p1}, Lec3/v;->h(Lec3/p1;)Lec3/r1;

    move-result-object p1

    iput-object p1, p0, Lb30/m;->F:Ljava/lang/Object;

    return-void
.end method

.method public constructor <init>(Lbc3/c0;Lz23/c;Lpg3/p;)V
    .locals 1

    const/16 v0, 0x1c

    iput v0, p0, Lb30/m;->w:I

    .line 85
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 86
    iput-object p1, p0, Lb30/m;->x:Ljava/lang/Object;

    .line 87
    iput-object p2, p0, Lb30/m;->y:Ljava/lang/Object;

    .line 88
    iput-object p3, p0, Lb30/m;->z:Ljava/lang/Object;

    .line 89
    const-string p1, ""

    invoke-static {p1}, Lec3/v;->c(Ljava/lang/Object;)Lec3/h2;

    move-result-object p1

    iput-object p1, p0, Lb30/m;->F:Ljava/lang/Object;

    return-void
.end method

.method public constructor <init>(Ld1/j;Lwm/g;)V
    .locals 1

    const/16 v0, 0x11

    iput v0, p0, Lb30/m;->w:I

    .line 204
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 205
    iput-object p1, p0, Lb30/m;->x:Ljava/lang/Object;

    .line 206
    iput-object p2, p0, Lb30/m;->y:Ljava/lang/Object;

    .line 207
    new-instance p1, Ljava/util/HashMap;

    invoke-direct {p1}, Ljava/util/HashMap;-><init>()V

    iput-object p1, p0, Lb30/m;->z:Ljava/lang/Object;

    .line 208
    new-instance p1, Ljava/util/HashSet;

    invoke-direct {p1}, Ljava/util/HashSet;-><init>()V

    iput-object p1, p0, Lb30/m;->E:Ljava/lang/Object;

    .line 209
    new-instance p1, Ljava/util/HashMap;

    invoke-direct {p1}, Ljava/util/HashMap;-><init>()V

    iput-object p1, p0, Lb30/m;->F:Ljava/lang/Object;

    return-void
.end method

.method public constructor <init>(Lfo/e;Ljava/util/HashMap;Ljava/util/HashMap;Ljava/util/HashMap;)V
    .locals 2

    const/4 v0, 0x4

    iput v0, p0, Lb30/m;->w:I

    .line 128
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 129
    iput-object p1, p0, Lb30/m;->x:Ljava/lang/Object;

    .line 130
    iput-object p3, p0, Lb30/m;->E:Ljava/lang/Object;

    .line 131
    iput-object p4, p0, Lb30/m;->F:Ljava/lang/Object;

    .line 132
    invoke-static {p2}, Ljava/util/Collections;->unmodifiableMap(Ljava/util/Map;)Ljava/util/Map;

    move-result-object p2

    iput-object p2, p0, Lb30/m;->z:Ljava/lang/Object;

    .line 133
    new-instance p2, Ljava/util/TreeSet;

    invoke-direct {p2}, Ljava/util/TreeSet;-><init>()V

    const/4 p3, 0x0

    .line 134
    invoke-virtual {p1, p2, p3}, Lfo/e;->d(Ljava/util/TreeSet;Z)V

    .line 135
    invoke-virtual {p2}, Ljava/util/TreeSet;->size()I

    move-result p1

    new-array p1, p1, [J

    .line 136
    invoke-virtual {p2}, Ljava/util/TreeSet;->iterator()Ljava/util/Iterator;

    move-result-object p2

    :goto_0
    invoke-interface {p2}, Ljava/util/Iterator;->hasNext()Z

    move-result p4

    if-eqz p4, :cond_0

    invoke-interface {p2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object p4

    check-cast p4, Ljava/lang/Long;

    invoke-virtual {p4}, Ljava/lang/Long;->longValue()J

    move-result-wide v0

    add-int/lit8 p4, p3, 0x1

    .line 137
    aput-wide v0, p1, p3

    move p3, p4

    goto :goto_0

    .line 138
    :cond_0
    iput-object p1, p0, Lb30/m;->y:Ljava/lang/Object;

    return-void
.end method

.method public constructor <init>(Lj93/d;Ljava/lang/Class;Lr5/c;Ljava/util/Map;Ljava/lang/String;Lcom/squareup/wire/x;)V
    .locals 0

    const/16 p2, 0x12

    iput p2, p0, Lb30/m;->w:I

    const-string p2, "messageType"

    invoke-static {p1, p2}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    .line 169
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 170
    iput-object p1, p0, Lb30/m;->x:Ljava/lang/Object;

    .line 171
    iput-object p3, p0, Lb30/m;->y:Ljava/lang/Object;

    .line 172
    iput-object p4, p0, Lb30/m;->z:Ljava/lang/Object;

    .line 173
    iput-object p5, p0, Lb30/m;->E:Ljava/lang/Object;

    .line 174
    iput-object p6, p0, Lb30/m;->F:Ljava/lang/Object;

    return-void
.end method

.method public constructor <init>(Ljava/lang/Class;)V
    .locals 1

    const/4 v0, 0x3

    iput v0, p0, Lb30/m;->w:I

    .line 199
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 200
    new-instance v0, Ljava/util/HashMap;

    invoke-direct {v0}, Ljava/util/HashMap;-><init>()V

    iput-object v0, p0, Lb30/m;->y:Ljava/lang/Object;

    .line 201
    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    iput-object v0, p0, Lb30/m;->z:Ljava/lang/Object;

    .line 202
    iput-object p1, p0, Lb30/m;->x:Ljava/lang/Object;

    .line 203
    sget-object p1, Lss/a;->b:Lss/a;

    iput-object p1, p0, Lb30/m;->F:Ljava/lang/Object;

    return-void
.end method

.method public constructor <init>(Ljava/lang/Object;Landroid/os/Looper;Landroid/os/Looper;Lx8/p;Lb9/u;)V
    .locals 1

    const/16 v0, 0x1a

    iput v0, p0, Lb30/m;->w:I

    .line 163
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    const/4 v0, 0x0

    .line 164
    invoke-virtual {p4, p2, v0}, Lx8/p;->a(Landroid/os/Looper;Landroid/os/Handler$Callback;)Lx8/r;

    move-result-object p2

    iput-object p2, p0, Lb30/m;->x:Ljava/lang/Object;

    .line 165
    invoke-virtual {p4, p3, v0}, Lx8/p;->a(Landroid/os/Looper;Landroid/os/Handler$Callback;)Lx8/r;

    move-result-object p2

    iput-object p2, p0, Lb30/m;->y:Ljava/lang/Object;

    .line 166
    iput-object p1, p0, Lb30/m;->E:Ljava/lang/Object;

    .line 167
    iput-object p1, p0, Lb30/m;->F:Ljava/lang/Object;

    .line 168
    iput-object p5, p0, Lb30/m;->z:Ljava/lang/Object;

    return-void
.end method

.method public synthetic constructor <init>(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;I)V
    .locals 0

    .line 2
    iput p6, p0, Lb30/m;->w:I

    iput-object p1, p0, Lb30/m;->x:Ljava/lang/Object;

    iput-object p2, p0, Lb30/m;->y:Ljava/lang/Object;

    iput-object p3, p0, Lb30/m;->z:Ljava/lang/Object;

    iput-object p4, p0, Lb30/m;->E:Ljava/lang/Object;

    iput-object p5, p0, Lb30/m;->F:Ljava/lang/Object;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public constructor <init>(Ljava/lang/String;Ljava/lang/String;Lec3/f2;Lhc3/d;Lz23/c;Lso/q;La30/w0;)V
    .locals 0

    const/16 p4, 0x18

    iput p4, p0, Lb30/m;->w:I

    const-string p4, "callType"

    invoke-static {p2, p4}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string p4, "connectionFlow"

    invoke-static {p3, p4}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string p3, "reporter"

    invoke-static {p5, p3}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    .line 90
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 91
    iput-object p1, p0, Lb30/m;->x:Ljava/lang/Object;

    .line 92
    iput-object p2, p0, Lb30/m;->y:Ljava/lang/Object;

    .line 93
    iput-object p5, p0, Lb30/m;->z:Ljava/lang/Object;

    .line 94
    iput-object p6, p0, Lb30/m;->E:Ljava/lang/Object;

    .line 95
    iput-object p7, p0, Lb30/m;->F:Ljava/lang/Object;

    return-void
.end method

.method public constructor <init>(Ljava/lang/String;Ljava/lang/String;Lz23/c;Lso/q;Lm5/k;)V
    .locals 1

    const/16 v0, 0x16

    iput v0, p0, Lb30/m;->w:I

    const-string v0, "callType"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "eventReporter"

    invoke-static {p3, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    .line 69
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 70
    iput-object p1, p0, Lb30/m;->x:Ljava/lang/Object;

    .line 71
    iput-object p2, p0, Lb30/m;->y:Ljava/lang/Object;

    .line 72
    iput-object p3, p0, Lb30/m;->z:Ljava/lang/Object;

    .line 73
    iput-object p4, p0, Lb30/m;->E:Ljava/lang/Object;

    .line 74
    iput-object p5, p0, Lb30/m;->F:Ljava/lang/Object;

    return-void
.end method

.method public constructor <init>(Lm63/d;)V
    .locals 1

    const/16 v0, 0x1d

    iput v0, p0, Lb30/m;->w:I

    .line 117
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 118
    iget-object v0, p1, Lm63/d;->x:Ljava/lang/Object;

    check-cast v0, La73/e;

    .line 119
    iput-object v0, p0, Lb30/m;->x:Ljava/lang/Object;

    .line 120
    iget-object v0, p1, Lm63/d;->z:Ljava/lang/Object;

    check-cast v0, Lg73/a;

    .line 121
    iput-object v0, p0, Lb30/m;->y:Ljava/lang/Object;

    .line 122
    iget-object v0, p1, Lm63/d;->E:Ljava/lang/Object;

    check-cast v0, Lz5/b;

    .line 123
    iput-object v0, p0, Lb30/m;->z:Ljava/lang/Object;

    .line 124
    iget-object v0, p1, Lm63/d;->F:Ljava/lang/Object;

    check-cast v0, Lg73/a;

    .line 125
    iput-object v0, p0, Lb30/m;->E:Ljava/lang/Object;

    .line 126
    iget-object p1, p1, Lm63/d;->H:Ljava/lang/Object;

    check-cast p1, Lo20/a;

    .line 127
    iput-object p1, p0, Lb30/m;->F:Ljava/lang/Object;

    return-void
.end method

.method public constructor <init>(Lm63/d;Lm63/d;Lva3/h;Ljava/util/ArrayList;)V
    .locals 1

    const/16 v0, 0xb

    iput v0, p0, Lb30/m;->w:I

    .line 196
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 197
    iput-object p1, p0, Lb30/m;->y:Ljava/lang/Object;

    iput-object p2, p0, Lb30/m;->z:Ljava/lang/Object;

    iput-object p3, p0, Lb30/m;->E:Ljava/lang/Object;

    iput-object p4, p0, Lb30/m;->F:Ljava/lang/Object;

    .line 198
    iput-object p1, p0, Lb30/m;->x:Ljava/lang/Object;

    return-void
.end method

.method public constructor <init>(Lorg/webrtc/PeerConnection;Lstream/video/sfu/models/PeerType;)V
    .locals 1

    const/4 v0, 0x6

    iput v0, p0, Lb30/m;->w:I

    const-string v0, "peerType"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    .line 150
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 151
    iput-object p1, p0, Lb30/m;->x:Ljava/lang/Object;

    .line 152
    iput-object p2, p0, Lb30/m;->y:Ljava/lang/Object;

    .line 153
    sget-object p1, Lm83/z;->w:Lm83/z;

    iput-object p1, p0, Lb30/m;->z:Ljava/lang/Object;

    .line 154
    new-instance p1, Lm83/m;

    invoke-direct {p1}, Lm83/m;-><init>()V

    iput-object p1, p0, Lb30/m;->E:Ljava/lang/Object;

    .line 155
    new-instance p1, Lm83/m;

    invoke-direct {p1}, Lm83/m;-><init>()V

    iput-object p1, p0, Lb30/m;->F:Ljava/lang/Object;

    return-void
.end method

.method public constructor <init>(Lpg/a;Log/b;)V
    .locals 1

    const/16 v0, 0xc

    iput v0, p0, Lb30/m;->w:I

    .line 75
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 76
    iput-object p1, p0, Lb30/m;->x:Ljava/lang/Object;

    .line 77
    iput-object p2, p0, Lb30/m;->y:Ljava/lang/Object;

    .line 78
    new-instance p1, Lpc3/r;

    const/4 p2, 0x2

    invoke-direct {p1, p2}, Lpc3/r;-><init>(I)V

    invoke-static {p1}, Lq83/g;->H(Lc93/a;)Ll83/p;

    move-result-object p1

    iput-object p1, p0, Lb30/m;->F:Ljava/lang/Object;

    return-void
.end method

.method public constructor <init>(Lrh/d;)V
    .locals 5

    const/16 v0, 0x10

    iput v0, p0, Lb30/m;->w:I

    .line 175
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 176
    iget-object v0, p1, Lrh/d;->a:Ljava/util/List;

    .line 177
    check-cast v0, Ljava/util/Collection;

    invoke-static {v0}, Lm83/s;->F1(Ljava/util/Collection;)Ljava/util/ArrayList;

    move-result-object v0

    iput-object v0, p0, Lb30/m;->x:Ljava/lang/Object;

    .line 178
    iget-object v0, p1, Lrh/d;->b:Ljava/util/List;

    .line 179
    check-cast v0, Ljava/util/Collection;

    invoke-static {v0}, Lm83/s;->F1(Ljava/util/Collection;)Ljava/util/ArrayList;

    move-result-object v0

    iput-object v0, p0, Lb30/m;->y:Ljava/lang/Object;

    .line 180
    iget-object v0, p1, Lrh/d;->c:Ljava/util/List;

    .line 181
    check-cast v0, Ljava/util/Collection;

    invoke-static {v0}, Lm83/s;->F1(Ljava/util/Collection;)Ljava/util/ArrayList;

    move-result-object v0

    iput-object v0, p0, Lb30/m;->z:Ljava/lang/Object;

    .line 182
    iget-object v0, p1, Lrh/d;->f:Ll83/p;

    invoke-virtual {v0}, Ll83/p;->getValue()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/util/List;

    .line 183
    check-cast v0, Ljava/lang/Iterable;

    new-instance v1, Ljava/util/ArrayList;

    invoke-direct {v1}, Ljava/util/ArrayList;-><init>()V

    .line 184
    invoke-interface {v0}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :goto_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v2

    if-eqz v2, :cond_0

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v2

    .line 185
    check-cast v2, Ll83/k;

    .line 186
    new-instance v3, Lq80/h;

    const/16 v4, 0xe

    invoke-direct {v3, v2, v4}, Lq80/h;-><init>(Ljava/lang/Object;I)V

    .line 187
    invoke-virtual {v1, v3}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    goto :goto_0

    .line 188
    :cond_0
    iput-object v1, p0, Lb30/m;->E:Ljava/lang/Object;

    .line 189
    iget-object p1, p1, Lrh/d;->g:Ll83/p;

    invoke-virtual {p1}, Ll83/p;->getValue()Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Ljava/util/List;

    .line 190
    check-cast p1, Ljava/lang/Iterable;

    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    .line 191
    invoke-interface {p1}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object p1

    :goto_1
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_1

    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    .line 192
    check-cast v1, Lsh/j;

    .line 193
    new-instance v2, Lrh/c;

    const/4 v3, 0x1

    invoke-direct {v2, v1, v3}, Lrh/c;-><init>(Lsh/j;I)V

    .line 194
    invoke-virtual {v0, v2}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    goto :goto_1

    .line 195
    :cond_1
    iput-object v0, p0, Lb30/m;->F:Ljava/lang/Object;

    return-void
.end method

.method public constructor <init>(Lwa/c;Ljava/util/HashMap;Ljava/util/HashMap;Ljava/util/HashMap;)V
    .locals 2

    const/16 v0, 0x19

    iput v0, p0, Lb30/m;->w:I

    .line 139
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 140
    iput-object p1, p0, Lb30/m;->x:Ljava/lang/Object;

    .line 141
    iput-object p3, p0, Lb30/m;->E:Ljava/lang/Object;

    .line 142
    iput-object p4, p0, Lb30/m;->F:Ljava/lang/Object;

    .line 143
    invoke-static {p2}, Ljava/util/Collections;->unmodifiableMap(Ljava/util/Map;)Ljava/util/Map;

    move-result-object p2

    iput-object p2, p0, Lb30/m;->z:Ljava/lang/Object;

    .line 144
    new-instance p2, Ljava/util/TreeSet;

    invoke-direct {p2}, Ljava/util/TreeSet;-><init>()V

    const/4 p3, 0x0

    .line 145
    invoke-virtual {p1, p2, p3}, Lwa/c;->d(Ljava/util/TreeSet;Z)V

    .line 146
    invoke-virtual {p2}, Ljava/util/TreeSet;->size()I

    move-result p1

    new-array p1, p1, [J

    .line 147
    invoke-virtual {p2}, Ljava/util/TreeSet;->iterator()Ljava/util/Iterator;

    move-result-object p2

    :goto_0
    invoke-interface {p2}, Ljava/util/Iterator;->hasNext()Z

    move-result p4

    if-eqz p4, :cond_0

    invoke-interface {p2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object p4

    check-cast p4, Ljava/lang/Long;

    invoke-virtual {p4}, Ljava/lang/Long;->longValue()J

    move-result-wide v0

    add-int/lit8 p4, p3, 0x1

    .line 148
    aput-wide v0, p1, p3

    move p3, p4

    goto :goto_0

    .line 149
    :cond_0
    iput-object p1, p0, Lb30/m;->y:Ljava/lang/Object;

    return-void
.end method

.method public constructor <init>(Ly00/v3;Lh20/j1;Lb30/t1;ZZLjava/util/Set;)V
    .locals 25

    move-object/from16 v0, p0

    move-object/from16 v1, p1

    move-object/from16 v2, p3

    const/4 v3, 0x0

    iput v3, v0, Lb30/m;->w:I

    const-string v4, "addressCollectionMode"

    move-object/from16 v5, p2

    invoke-static {v5, v4}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v4, "allowedBillingCountries"

    move-object/from16 v8, p6

    invoke-static {v8, v4}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    .line 3
    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    .line 4
    iput-object v2, v0, Lb30/m;->x:Ljava/lang/Object;

    .line 5
    sget-object v4, Lb30/t1;->y:Lb30/t1;

    const/4 v14, 0x0

    if-ne v2, v4, :cond_1

    .line 6
    new-instance v4, Lg40/c3;

    .line 7
    sget-object v6, Lcom/stripe/android/uicore/elements/IdentifierSpec;->Companion:Lcom/stripe/android/uicore/elements/a;

    invoke-virtual {v6}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 8
    invoke-static {}, Lcom/stripe/android/uicore/elements/IdentifierSpec;->access$getName$cp()Lcom/stripe/android/uicore/elements/IdentifierSpec;

    move-result-object v6

    if-eqz v1, :cond_0

    .line 9
    iget-object v7, v1, Ly00/v3;->y:Ljava/lang/String;

    goto :goto_0

    :cond_0
    move-object v7, v14

    .line 10
    :goto_0
    new-instance v9, Lg40/f3;

    .line 11
    new-instance v10, Lg40/l1;

    invoke-direct {v10}, Lg40/l1;-><init>()V

    const/4 v11, 0x4

    .line 12
    invoke-direct {v9, v10, v7, v14, v11}, Lg40/f3;-><init>(Lg40/l3;Ljava/lang/String;Ldo0/c;I)V

    .line 13
    invoke-direct {v4, v6, v9}, Lg40/c3;-><init>(Lcom/stripe/android/uicore/elements/IdentifierSpec;Lg40/m3;)V

    goto :goto_1

    :cond_1
    move-object v4, v14

    .line 14
    :goto_1
    iput-object v4, v0, Lb30/m;->y:Ljava/lang/Object;

    .line 15
    sget-object v6, Lcom/stripe/android/uicore/elements/IdentifierSpec;->Companion:Lcom/stripe/android/uicore/elements/a;

    invoke-virtual {v6}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 16
    invoke-static {}, Lcom/stripe/android/uicore/elements/IdentifierSpec;->access$getBillingAddress$cp()Lcom/stripe/android/uicore/elements/IdentifierSpec;

    move-result-object v6

    .line 17
    invoke-virtual {v5}, Ljava/lang/Enum;->ordinal()I

    move-result v5

    const/4 v15, 0x1

    if-eqz v5, :cond_4

    if-eq v5, v15, :cond_3

    const/4 v7, 0x2

    if-ne v5, v7, :cond_2

    .line 18
    sget-object v5, Lu30/b;->y:Lu30/b;

    :goto_2
    move-object/from16 v20, v5

    goto :goto_3

    .line 19
    :cond_2
    new-instance v1, Lkotlin/NoWhenBranchMatchedException;

    invoke-direct {v1}, Lkotlin/NoWhenBranchMatchedException;-><init>()V

    throw v1

    .line 20
    :cond_3
    sget-object v5, Lu30/b;->x:Lu30/b;

    goto :goto_2

    .line 21
    :cond_4
    sget-object v5, Lu30/b;->w:Lu30/b;

    goto :goto_2

    .line 22
    :goto_3
    sget-object v5, Lb30/t1;->x:Lb30/t1;

    if-ne v2, v5, :cond_5

    move/from16 v17, v15

    goto :goto_4

    :cond_5
    move/from16 v17, v3

    .line 23
    :goto_4
    new-instance v12, Lu30/c;

    const/16 v21, 0x10

    move/from16 v18, p4

    move/from16 v19, p5

    move-object/from16 v16, v12

    invoke-direct/range {v16 .. v21}, Lu30/c;-><init>(ZZZLu30/b;I)V

    if-eqz v1, :cond_6

    .line 24
    iget-object v7, v1, Ly00/v3;->w:Ly00/c;

    goto :goto_5

    :cond_6
    move-object v7, v14

    .line 25
    :goto_5
    invoke-static {}, Lcom/stripe/android/uicore/elements/IdentifierSpec;->access$getName$cp()Lcom/stripe/android/uicore/elements/IdentifierSpec;

    move-result-object v9

    if-eqz v1, :cond_7

    .line 26
    iget-object v10, v1, Ly00/v3;->y:Ljava/lang/String;

    goto :goto_6

    :cond_7
    move-object v10, v14

    .line 27
    :goto_6
    new-instance v11, Ll83/k;

    invoke-direct {v11, v9, v10}, Ll83/k;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    if-ne v2, v5, :cond_8

    move-object/from16 v16, v11

    goto :goto_7

    :cond_8
    move-object/from16 v16, v14

    .line 28
    :goto_7
    invoke-static {}, Lcom/stripe/android/uicore/elements/IdentifierSpec;->access$getLine1$cp()Lcom/stripe/android/uicore/elements/IdentifierSpec;

    move-result-object v2

    if-eqz v7, :cond_9

    .line 29
    iget-object v5, v7, Ly00/c;->y:Ljava/lang/String;

    goto :goto_8

    :cond_9
    move-object v5, v14

    .line 30
    :goto_8
    new-instance v9, Ll83/k;

    invoke-direct {v9, v2, v5}, Ll83/k;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    .line 31
    invoke-static {}, Lcom/stripe/android/uicore/elements/IdentifierSpec;->access$getLine2$cp()Lcom/stripe/android/uicore/elements/IdentifierSpec;

    move-result-object v2

    if-eqz v7, :cond_a

    .line 32
    iget-object v5, v7, Ly00/c;->z:Ljava/lang/String;

    goto :goto_9

    :cond_a
    move-object v5, v14

    .line 33
    :goto_9
    new-instance v10, Ll83/k;

    invoke-direct {v10, v2, v5}, Ll83/k;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    .line 34
    invoke-static {}, Lcom/stripe/android/uicore/elements/IdentifierSpec;->access$getState$cp()Lcom/stripe/android/uicore/elements/IdentifierSpec;

    move-result-object v2

    if-eqz v7, :cond_b

    .line 35
    iget-object v5, v7, Ly00/c;->F:Ljava/lang/String;

    goto :goto_a

    :cond_b
    move-object v5, v14

    .line 36
    :goto_a
    new-instance v11, Ll83/k;

    invoke-direct {v11, v2, v5}, Ll83/k;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    .line 37
    invoke-static {}, Lcom/stripe/android/uicore/elements/IdentifierSpec;->access$getCity$cp()Lcom/stripe/android/uicore/elements/IdentifierSpec;

    move-result-object v2

    if-eqz v7, :cond_c

    .line 38
    iget-object v5, v7, Ly00/c;->w:Ljava/lang/String;

    goto :goto_b

    :cond_c
    move-object v5, v14

    .line 39
    :goto_b
    new-instance v13, Ll83/k;

    invoke-direct {v13, v2, v5}, Ll83/k;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    .line 40
    invoke-static {}, Lcom/stripe/android/uicore/elements/IdentifierSpec;->access$getCountry$cp()Lcom/stripe/android/uicore/elements/IdentifierSpec;

    move-result-object v2

    if-eqz v7, :cond_d

    .line 41
    iget-object v5, v7, Ly00/c;->x:Ljava/lang/String;

    goto :goto_c

    :cond_d
    move-object v5, v14

    .line 42
    :goto_c
    new-instance v14, Ll83/k;

    invoke-direct {v14, v2, v5}, Ll83/k;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    .line 43
    invoke-static {}, Lcom/stripe/android/uicore/elements/IdentifierSpec;->access$getPostalCode$cp()Lcom/stripe/android/uicore/elements/IdentifierSpec;

    move-result-object v2

    if-eqz v7, :cond_e

    .line 44
    iget-object v5, v7, Ly00/c;->E:Ljava/lang/String;

    goto :goto_d

    :cond_e
    const/4 v5, 0x0

    .line 45
    :goto_d
    new-instance v7, Ll83/k;

    invoke-direct {v7, v2, v5}, Ll83/k;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    .line 46
    invoke-static {}, Lcom/stripe/android/uicore/elements/IdentifierSpec;->access$getEmail$cp()Lcom/stripe/android/uicore/elements/IdentifierSpec;

    move-result-object v2

    if-eqz v1, :cond_f

    .line 47
    iget-object v5, v1, Ly00/v3;->x:Ljava/lang/String;

    goto :goto_e

    :cond_f
    const/4 v5, 0x0

    .line 48
    :goto_e
    new-instance v15, Ll83/k;

    invoke-direct {v15, v2, v5}, Ll83/k;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    if-eqz p4, :cond_10

    move-object/from16 v23, v15

    goto :goto_f

    :cond_10
    const/16 v23, 0x0

    .line 49
    :goto_f
    invoke-static {}, Lcom/stripe/android/uicore/elements/IdentifierSpec;->access$getPhone$cp()Lcom/stripe/android/uicore/elements/IdentifierSpec;

    move-result-object v2

    if-eqz v1, :cond_11

    .line 50
    iget-object v1, v1, Ly00/v3;->z:Ljava/lang/String;

    goto :goto_10

    :cond_11
    const/4 v1, 0x0

    .line 51
    :goto_10
    new-instance v5, Ll83/k;

    invoke-direct {v5, v2, v1}, Ll83/k;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    if-eqz p5, :cond_12

    move-object/from16 v24, v5

    :goto_11
    move-object/from16 v22, v7

    move-object/from16 v17, v9

    move-object/from16 v18, v10

    move-object/from16 v19, v11

    move-object/from16 v20, v13

    move-object/from16 v21, v14

    goto :goto_12

    :cond_12
    const/16 v24, 0x0

    goto :goto_11

    .line 52
    :goto_12
    filled-new-array/range {v16 .. v24}, [Ll83/k;

    move-result-object v1

    .line 53
    invoke-static {v1}, Lm83/n;->r0([Ljava/lang/Object;)Ljava/util/List;

    move-result-object v1

    .line 54
    invoke-static {v1}, Lm83/g0;->i0(Ljava/lang/Iterable;)Ljava/util/Map;

    move-result-object v7

    .line 55
    new-instance v5, Lx30/o;

    const/4 v11, 0x0

    const/16 v13, 0x8

    const/4 v9, 0x0

    const/4 v10, 0x0

    invoke-direct/range {v5 .. v13}, Lx30/o;-><init>(Lcom/stripe/android/uicore/elements/IdentifierSpec;Ljava/util/Map;Ljava/util/Set;Lg40/z;Lg40/v2;Ljava/util/Map;Lu30/c;I)V

    .line 56
    new-array v1, v3, [Ljava/lang/Object;

    const v2, 0x7f140fcc

    .line 57
    sget-object v6, Lm83/y;->w:Lm83/y;

    invoke-static {v2, v1, v6}, Ls4/i;->s(I[Ljava/lang/Object;Ljava/util/List;)Lzy/b;

    move-result-object v1

    .line 58
    invoke-static {v5, v1}, Lg40/l0;->b(Lg40/y2;Lzy/c;)Lg40/w2;

    move-result-object v1

    iput-object v1, v0, Lb30/m;->z:Ljava/lang/Object;

    .line 59
    iget-object v1, v5, Lx30/o;->h:Ln53/e;

    iput-object v1, v0, Lb30/m;->E:Ljava/lang/Object;

    if-eqz v4, :cond_13

    .line 60
    invoke-virtual {v4}, Lg40/b3;->e()Lec3/f2;

    move-result-object v2

    goto :goto_13

    .line 61
    :cond_13
    new-instance v2, La6/u;

    const/4 v4, 0x1

    invoke-direct {v2, v6, v4}, La6/u;-><init>(Ljava/lang/Object;I)V

    .line 62
    :goto_13
    iget-object v4, v5, Lx30/o;->c:Lg40/h;

    .line 63
    invoke-interface {v4}, Lg40/y2;->e()Lec3/f2;

    move-result-object v4

    .line 64
    new-instance v5, Lb30/l;

    const/4 v6, 0x0

    invoke-direct {v5, v0, v6, v3}, Lb30/l;-><init>(Ljava/lang/Object;Lq83/d;I)V

    invoke-static {v2, v4, v1, v5}, Lec3/v;->p(Lec3/l;Lec3/l;Lec3/l;Lc93/n;)Lec3/j1;

    move-result-object v1

    .line 65
    sget-object v2, Lbc3/q0;->a:Lkc3/e;

    .line 66
    sget-object v2, Lhc3/o;->a:Lbc3/w1;

    .line 67
    invoke-static {v1, v2}, Lec3/v;->F(Lec3/l;Lq83/j;)Lec3/l;

    move-result-object v1

    .line 68
    iput-object v1, v0, Lb30/m;->F:Ljava/lang/Object;

    return-void
.end method

.method public static final f(Lb30/m;Ljava/util/List;Lcom/stripe/android/uicore/elements/IdentifierSpec;Ljava/util/Set;)Ll40/a;
    .locals 1

    invoke-interface {p3, p2}, Ljava/util/Set;->contains(Ljava/lang/Object;)Z

    move-result p0

    const/4 p3, 0x0

    if-eqz p0, :cond_0

    goto :goto_1

    :cond_0
    check-cast p1, Ljava/lang/Iterable;

    invoke-interface {p1}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object p0

    :cond_1
    invoke-interface {p0}, Ljava/util/Iterator;->hasNext()Z

    move-result p1

    if-eqz p1, :cond_2

    invoke-interface {p0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object p1

    move-object v0, p1

    check-cast v0, Ll83/k;

    iget-object v0, v0, Ll83/k;->w:Ljava/lang/Object;

    invoke-static {v0, p2}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_1

    goto :goto_0

    :cond_2
    move-object p1, p3

    :goto_0
    check-cast p1, Ll83/k;

    if-eqz p1, :cond_3

    iget-object p0, p1, Ll83/k;->x:Ljava/lang/Object;

    check-cast p0, Ll40/a;

    return-object p0

    :cond_3
    :goto_1
    return-object p3
.end method

.method public static o(Lcom/squareup/wire/j;ILcom/squareup/wire/d;Ljava/lang/Object;)V
    .locals 2

    const-string v0, "builder"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "fieldEncoding"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v0, p0, Lcom/squareup/wire/j;->b:Lne3/h;

    if-nez v0, :cond_0

    new-instance v0, Lne3/h;

    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    iput-object v0, p0, Lcom/squareup/wire/j;->b:Lne3/h;

    new-instance v1, Lcom/squareup/wire/s;

    invoke-direct {v1, v0}, Lcom/squareup/wire/s;-><init>(Lne3/i;)V

    iput-object v1, p0, Lcom/squareup/wire/j;->c:Lcom/squareup/wire/s;

    iget-object v0, p0, Lcom/squareup/wire/j;->a:Lne3/l;

    invoke-virtual {v1, v0}, Lcom/squareup/wire/s;->a(Lne3/l;)V

    sget-object v0, Lne3/l;->E:Lne3/l;

    iput-object v0, p0, Lcom/squareup/wire/j;->a:Lne3/l;

    :cond_0
    invoke-virtual {p2}, Lcom/squareup/wire/d;->a()Lcom/squareup/wire/q;

    move-result-object p2

    const-string v0, "null cannot be cast to non-null type com.squareup.wire.ProtoAdapter<kotlin.Any>"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/k;->h(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object p0, p0, Lcom/squareup/wire/j;->c:Lcom/squareup/wire/s;

    invoke-static {p0}, Lkotlin/jvm/internal/k;->g(Ljava/lang/Object;)V

    invoke-virtual {p2, p0, p1, p3}, Lcom/squareup/wire/q;->encodeWithTag(Lcom/squareup/wire/s;ILjava/lang/Object;)V

    return-void
.end method


# virtual methods
.method public A()Lxi/b;
    .locals 1

    iget-object v0, p0, Lb30/m;->y:Ljava/lang/Object;

    check-cast v0, Lxi/b;

    return-object v0
.end method

.method public B(IZ)I
    .locals 2

    iget-object v0, p0, Lb30/m;->y:Ljava/lang/Object;

    check-cast v0, Ljava/util/ArrayList;

    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    invoke-static {v0, v1}, Lwb3/f;->i(Ljava/util/List;Ljava/lang/Comparable;)I

    move-result v1

    if-gez v1, :cond_0

    add-int/lit8 v1, v1, 0x1

    neg-int v1, v1

    goto :goto_0

    :cond_0
    add-int/lit8 v1, v1, 0x1

    :goto_0
    if-eqz p2, :cond_1

    if-lez v1, :cond_1

    add-int/lit8 p2, v1, -0x1

    invoke-virtual {v0, p2}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/Number;

    invoke-virtual {v0}, Ljava/lang/Number;->intValue()I

    move-result v0

    if-ne p1, v0, :cond_1

    return p2

    :cond_1
    return v1
.end method

.method public C(I)I
    .locals 1

    if-nez p1, :cond_0

    const/4 p1, 0x0

    return p1

    :cond_0
    iget-object v0, p0, Lb30/m;->y:Ljava/lang/Object;

    check-cast v0, Ljava/util/ArrayList;

    add-int/lit8 p1, p1, -0x1

    invoke-virtual {v0, p1}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Ljava/lang/Number;

    invoke-virtual {p1}, Ljava/lang/Number;->intValue()I

    move-result p1

    return p1
.end method

.method public D()Lxi/b;
    .locals 1

    iget-object v0, p0, Lb30/m;->F:Ljava/lang/Object;

    check-cast v0, Lxi/b;

    return-object v0
.end method

.method public E(II)I
    .locals 2

    :goto_0
    if-le p1, p2, :cond_3

    iget-object v0, p0, Lb30/m;->x:Ljava/lang/Object;

    check-cast v0, Landroid/text/Layout;

    invoke-virtual {v0}, Landroid/text/Layout;->getText()Ljava/lang/CharSequence;

    move-result-object v0

    add-int/lit8 v1, p1, -0x1

    invoke-interface {v0, v1}, Ljava/lang/CharSequence;->charAt(I)C

    move-result v0

    const/16 v1, 0x20

    if-eq v0, v1, :cond_2

    const/16 v1, 0xa

    if-eq v0, v1, :cond_2

    const/16 v1, 0x1680

    if-eq v0, v1, :cond_2

    const/16 v1, 0x2000

    invoke-static {v0, v1}, Lkotlin/jvm/internal/k;->k(II)I

    move-result v1

    if-ltz v1, :cond_0

    const/16 v1, 0x200a

    invoke-static {v0, v1}, Lkotlin/jvm/internal/k;->k(II)I

    move-result v1

    if-gtz v1, :cond_0

    const/16 v1, 0x2007

    if-ne v0, v1, :cond_2

    :cond_0
    const/16 v1, 0x205f

    if-eq v0, v1, :cond_2

    const/16 v1, 0x3000

    if-ne v0, v1, :cond_1

    goto :goto_1

    :cond_1
    return p1

    :cond_2
    :goto_1
    add-int/lit8 p1, p1, -0x1

    goto :goto_0

    :cond_3
    return p1
.end method

.method public F(ILjava/lang/String;Ljava/lang/String;)V
    .locals 11

    const-string v0, "message"

    invoke-static {p3, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v0, p0, Lb30/m;->E:Ljava/lang/Object;

    check-cast v0, Lso/q;

    iget-object v1, v0, Lso/q;->x:Ljava/lang/Object;

    check-cast v1, Lec3/r1;

    iget-object v2, v1, Lec3/r1;->w:Lec3/f2;

    invoke-interface {v2}, Lec3/f2;->getValue()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Lw23/h;

    iget-object v2, v2, Lw23/h;->d:Lx23/f;

    sget-object v3, Lw23/g;->a:[I

    invoke-virtual {v2}, Ljava/lang/Enum;->ordinal()I

    move-result v2

    aget v2, v3, v2

    const/4 v3, 0x3

    if-ne v2, v3, :cond_1

    iget-object v2, v1, Lec3/r1;->w:Lec3/f2;

    invoke-interface {v2}, Lec3/f2;->getValue()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Lw23/h;

    iget-object v2, v2, Lw23/h;->c:Ljava/lang/String;

    invoke-virtual {v2}, Ljava/lang/String;->length()I

    move-result v2

    if-lez v2, :cond_0

    iget-object v2, p0, Lb30/m;->z:Ljava/lang/Object;

    move-object v3, v2

    check-cast v3, Lz23/c;

    iget-object v1, v1, Lec3/r1;->w:Lec3/f2;

    invoke-interface {v1}, Lec3/f2;->getValue()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lw23/h;

    iget-object v4, v1, Lw23/h;->c:Ljava/lang/String;

    const/4 v9, 0x0

    const/16 v10, 0x20

    const/4 v5, 0x0

    move v6, p1

    move-object v8, p2

    move-object v7, p3

    invoke-static/range {v3 .. v10}, Lz23/c;->b(Lz23/c;Ljava/lang/String;ZILjava/lang/String;Ljava/lang/String;Ljava/lang/String;I)V

    :cond_0
    sget-object p1, Lx23/f;->y:Lx23/f;

    invoke-virtual {v0, p1}, Lso/q;->i(Lx23/f;)V

    :cond_1
    return-void
.end method

.method public G(Ljava/lang/String;ILjava/lang/String;Z)V
    .locals 26

    move-object/from16 v0, p0

    iget-object v1, v0, Lb30/m;->F:Ljava/lang/Object;

    check-cast v1, La30/w0;

    iget-object v2, v1, La30/w0;->G:Ljava/lang/Object;

    check-cast v2, Lec3/r1;

    iget-object v3, v1, La30/w0;->E:Ljava/lang/Object;

    check-cast v3, Lec3/r1;

    iget-object v3, v3, Lec3/r1;->w:Lec3/f2;

    invoke-interface {v3}, Lec3/f2;->getValue()Ljava/lang/Object;

    move-result-object v3

    sget-object v4, Lx23/f;->x:Lx23/f;

    if-ne v3, v4, :cond_6

    iget-object v3, v2, Lec3/r1;->w:Lec3/f2;

    invoke-interface {v3}, Lec3/f2;->getValue()Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Ljava/lang/CharSequence;

    invoke-interface {v3}, Ljava/lang/CharSequence;->length()I

    move-result v3

    if-lez v3, :cond_5

    iget-object v3, v0, Lb30/m;->z:Ljava/lang/Object;

    check-cast v3, Lz23/c;

    iget-object v2, v2, Lec3/r1;->w:Lec3/f2;

    invoke-interface {v2}, Lec3/f2;->getValue()Ljava/lang/Object;

    move-result-object v2

    move-object v10, v2

    check-cast v10, Ljava/lang/String;

    iget-object v2, v0, Lb30/m;->E:Ljava/lang/Object;

    check-cast v2, Lso/q;

    iget-object v2, v2, Lso/q;->x:Ljava/lang/Object;

    check-cast v2, Lec3/r1;

    iget-object v2, v2, Lec3/r1;->w:Lec3/f2;

    invoke-interface {v2}, Lec3/f2;->getValue()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Lw23/h;

    iget-object v2, v2, Lw23/h;->b:Ljava/lang/String;

    if-nez v2, :cond_0

    const-string v2, "unknown"

    :cond_0
    move-object v12, v2

    invoke-virtual {v3}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    const-string v2, "stageId"

    invoke-static {v10, v2}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v2, v3, Lz23/c;->d:Ljava/util/concurrent/ConcurrentHashMap;

    invoke-virtual {v2, v10}, Ljava/util/concurrent/ConcurrentHashMap;->remove(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Lb33/h;

    if-nez v2, :cond_1

    goto :goto_3

    :cond_1
    instance-of v5, v2, Lb33/j;

    if-eqz v5, :cond_5

    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v5

    invoke-virtual {v2}, Lb33/h;->a()J

    move-result-wide v7

    sub-long/2addr v5, v7

    check-cast v2, Lb33/j;

    move-wide v6, v5

    iget-object v5, v3, Lz23/c;->c:Lz23/a;

    move-wide v7, v6

    iget-object v6, v2, Lb33/j;->a:Ljava/lang/String;

    move-wide v8, v7

    iget-object v7, v2, Lb33/j;->b:Ljava/lang/String;

    move-wide v13, v8

    sget-object v8, Lb33/d;->z:Lb33/d;

    sget-object v9, Lb33/g;->y:Lb33/g;

    if-eqz p4, :cond_2

    sget-object v11, Lb33/c;->x:Lb33/c;

    goto :goto_0

    :cond_2
    sget-object v11, Lb33/c;->y:Lb33/c;

    :goto_0
    if-nez p4, :cond_3

    move-object/from16 v16, p1

    goto :goto_1

    :cond_3
    const/16 v16, 0x0

    :goto_1
    if-nez p4, :cond_4

    move-object/from16 v17, p3

    goto :goto_2

    :cond_4
    const/16 v17, 0x0

    :goto_2
    iget-object v15, v2, Lb33/j;->h:Ljava/lang/String;

    iget-object v4, v2, Lb33/j;->i:Ljava/lang/String;

    iget-object v2, v2, Lb33/j;->g:Ls93/k;

    invoke-static {v13, v14}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v13

    invoke-static/range {p2 .. p2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v14

    const/16 v24, 0x0

    const v25, 0x7fc000

    const/16 v20, 0x0

    const/16 v21, 0x0

    const/16 v22, 0x0

    const/16 v23, 0x0

    move-object/from16 v18, v4

    move-object/from16 v19, v15

    move-object v15, v14

    move-object v14, v11

    move-object v11, v2

    invoke-static/range {v5 .. v25}, Lz23/a;->a(Lz23/a;Ljava/lang/String;Ljava/lang/String;Lb33/f;Lb33/g;Ljava/lang/String;Ls93/k;Ljava/lang/String;Ljava/lang/Long;Lb33/c;Ljava/lang/Integer;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lb33/i;Ljava/lang/Boolean;Lw23/t;Ljava/lang/Boolean;Ljava/lang/Boolean;I)Lio/getstream/android/video/generated/models/ClientEvent;

    move-result-object v2

    iget-object v3, v3, Lz23/c;->a:La33/d;

    invoke-virtual {v3, v2}, La33/d;->P(Lio/getstream/android/video/generated/models/ClientEvent;)V

    :cond_5
    :goto_3
    sget-object v2, Lx23/f;->y:Lx23/f;

    iget-object v1, v1, La30/w0;->z:Ljava/lang/Object;

    check-cast v1, Lec3/h2;

    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    const/4 v3, 0x0

    invoke-virtual {v1, v3, v2}, Lec3/h2;->k(Ljava/lang/Object;Ljava/lang/Object;)Z

    :cond_6
    return-void
.end method

.method public H(Lgf/c;)V
    .locals 1

    const-string v0, "<set-?>"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    iput-object p1, p0, Lb30/m;->z:Ljava/lang/Object;

    return-void
.end method

.method public I(Ljava/lang/String;)V
    .locals 0

    iput-object p1, p0, Lb30/m;->F:Ljava/lang/Object;

    return-void
.end method

.method public J(Luf/t;)V
    .locals 1

    const-string v0, "<set-?>"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    iput-object p1, p0, Lb30/m;->E:Ljava/lang/Object;

    return-void
.end method

.method public K(Lmg/h;)V
    .locals 1

    const-string v0, "<set-?>"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    iput-object p1, p0, Lb30/m;->x:Ljava/lang/Object;

    return-void
.end method

.method public L(Ljava/lang/String;)V
    .locals 0

    iput-object p1, p0, Lb30/m;->F:Ljava/lang/Object;

    return-void
.end method

.method public a(Ljava/lang/Throwable;)V
    .locals 1

    const-string v0, "ex"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    iput-object p1, p0, Lb30/m;->E:Ljava/lang/Object;

    return-void
.end method

.method public b(J)I
    .locals 2

    iget v0, p0, Lb30/m;->w:I

    packed-switch v0, :pswitch_data_0

    iget-object v0, p0, Lb30/m;->y:Ljava/lang/Object;

    check-cast v0, [J

    const/4 v1, 0x0

    invoke-static {v0, p1, p2, v1}, Lx8/t;->a([JJZ)I

    move-result p1

    array-length p2, v0

    if-ge p1, p2, :cond_0

    goto :goto_0

    :cond_0
    const/4 p1, -0x1

    :goto_0
    return p1

    :pswitch_0
    iget-object v0, p0, Lb30/m;->y:Ljava/lang/Object;

    check-cast v0, [J

    const/4 v1, 0x0

    invoke-static {v0, p1, p2, v1}, Llo/y;->b([JJZ)I

    move-result p1

    array-length p2, v0

    if-ge p1, p2, :cond_1

    goto :goto_1

    :cond_1
    const/4 p1, -0x1

    :goto_1
    return p1

    nop

    :pswitch_data_0
    .packed-switch 0x4
        :pswitch_0
    .end packed-switch
.end method

.method public c(Ljava/lang/String;Ljava/lang/Object;)V
    .locals 1

    const-string v0, "key"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "value"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v0, p0, Lb30/m;->F:Ljava/lang/Object;

    check-cast v0, Ll83/p;

    invoke-virtual {v0}, Ll83/p;->getValue()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/util/Map;

    invoke-interface {v0, p1, p2}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    return-void
.end method

.method public d(J)Ljava/util/List;
    .locals 28

    move-object/from16 v0, p0

    move-wide/from16 v2, p1

    iget v1, v0, Lb30/m;->w:I

    packed-switch v1, :pswitch_data_0

    iget-object v1, v0, Lb30/m;->x:Ljava/lang/Object;

    check-cast v1, Lwa/c;

    iget-object v4, v0, Lb30/m;->z:Ljava/lang/Object;

    move-object v7, v4

    check-cast v7, Ljava/util/Map;

    iget-object v4, v0, Lb30/m;->E:Ljava/lang/Object;

    move-object v8, v4

    check-cast v8, Ljava/util/HashMap;

    iget-object v4, v0, Lb30/m;->F:Ljava/lang/Object;

    move-object v9, v4

    check-cast v9, Ljava/util/HashMap;

    new-instance v10, Ljava/util/ArrayList;

    invoke-direct {v10}, Ljava/util/ArrayList;-><init>()V

    iget-object v4, v1, Lwa/c;->h:Ljava/lang/String;

    invoke-virtual {v1, v2, v3, v4, v10}, Lwa/c;->g(JLjava/lang/String;Ljava/util/ArrayList;)V

    new-instance v6, Ljava/util/TreeMap;

    invoke-direct {v6}, Ljava/util/TreeMap;-><init>()V

    const/4 v4, 0x0

    iget-object v5, v1, Lwa/c;->h:Ljava/lang/String;

    invoke-virtual/range {v1 .. v6}, Lwa/c;->i(JZLjava/lang/String;Ljava/util/TreeMap;)V

    iget-object v2, v1, Lwa/c;->h:Ljava/lang/String;

    move-object v4, v7

    move-object v5, v8

    move-object v7, v6

    move-object v6, v2

    move-wide/from16 v2, p1

    invoke-virtual/range {v1 .. v7}, Lwa/c;->h(JLjava/util/Map;Ljava/util/HashMap;Ljava/lang/String;Ljava/util/TreeMap;)V

    move-object v6, v7

    new-instance v1, Ljava/util/ArrayList;

    invoke-direct {v1}, Ljava/util/ArrayList;-><init>()V

    invoke-virtual {v10}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    move-result-object v2

    :goto_0
    invoke-interface {v2}, Ljava/util/Iterator;->hasNext()Z

    move-result v3

    const/4 v4, 0x0

    if-eqz v3, :cond_1

    invoke-interface {v2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Landroid/util/Pair;

    iget-object v7, v3, Landroid/util/Pair;->second:Ljava/lang/Object;

    invoke-virtual {v9, v7}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v7

    check-cast v7, Ljava/lang/String;

    if-nez v7, :cond_0

    goto :goto_0

    :cond_0
    invoke-static {v7, v4}, Landroid/util/Base64;->decode(Ljava/lang/String;I)[B

    move-result-object v7

    array-length v8, v7

    invoke-static {v7, v4, v8}, Landroid/graphics/BitmapFactory;->decodeByteArray([BII)Landroid/graphics/Bitmap;

    move-result-object v14

    iget-object v3, v3, Landroid/util/Pair;->first:Ljava/lang/Object;

    invoke-virtual {v5, v3}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Lwa/e;

    invoke-virtual {v3}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    iget v4, v3, Lwa/e;->b:F

    iget v15, v3, Lwa/e;->c:F

    iget v7, v3, Lwa/e;->e:I

    iget v8, v3, Lwa/e;->f:F

    iget v10, v3, Lwa/e;->g:F

    iget v3, v3, Lwa/e;->j:I

    move/from16 v23, v10

    new-instance v10, Lw8/b;

    const/4 v11, 0x0

    const/16 v16, 0x0

    const/16 v19, 0x0

    const/high16 v20, -0x80000000

    const v21, -0x800001

    const/16 v24, 0x0

    const/high16 v25, -0x1000000

    const/16 v27, 0x0

    move-object v12, v11

    move-object v13, v11

    move/from16 v26, v3

    move/from16 v18, v4

    move/from16 v17, v7

    move/from16 v22, v8

    invoke-direct/range {v10 .. v27}, Lw8/b;-><init>(Ljava/lang/CharSequence;Landroid/text/Layout$Alignment;Landroid/text/Layout$Alignment;Landroid/graphics/Bitmap;FIIFIIFFFZIIF)V

    invoke-virtual {v1, v10}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    goto :goto_0

    :cond_1
    invoke-virtual {v6}, Ljava/util/TreeMap;->entrySet()Ljava/util/Set;

    move-result-object v2

    invoke-interface {v2}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    move-result-object v2

    :goto_1
    invoke-interface {v2}, Ljava/util/Iterator;->hasNext()Z

    move-result v3

    if-eqz v3, :cond_d

    invoke-interface {v2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Ljava/util/Map$Entry;

    invoke-interface {v3}, Ljava/util/Map$Entry;->getKey()Ljava/lang/Object;

    move-result-object v6

    invoke-virtual {v5, v6}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v6

    check-cast v6, Lwa/e;

    invoke-virtual {v6}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    invoke-interface {v3}, Ljava/util/Map$Entry;->getValue()Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Lw8/a;

    iget-object v7, v3, Lw8/a;->a:Ljava/lang/CharSequence;

    invoke-virtual {v7}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    check-cast v7, Landroid/text/SpannableStringBuilder;

    invoke-virtual {v7}, Landroid/text/SpannableStringBuilder;->length()I

    move-result v8

    const-class v9, Lwa/a;

    invoke-virtual {v7, v4, v8, v9}, Landroid/text/SpannableStringBuilder;->getSpans(IILjava/lang/Class;)[Ljava/lang/Object;

    move-result-object v8

    check-cast v8, [Lwa/a;

    array-length v9, v8

    move v10, v4

    :goto_2
    if-ge v10, v9, :cond_2

    aget-object v11, v8, v10

    invoke-virtual {v7, v11}, Landroid/text/SpannableStringBuilder;->getSpanStart(Ljava/lang/Object;)I

    move-result v12

    invoke-virtual {v7, v11}, Landroid/text/SpannableStringBuilder;->getSpanEnd(Ljava/lang/Object;)I

    move-result v11

    const-string v13, ""

    invoke-virtual {v7, v12, v11, v13}, Landroid/text/SpannableStringBuilder;->replace(IILjava/lang/CharSequence;)Landroid/text/SpannableStringBuilder;

    add-int/lit8 v10, v10, 0x1

    goto :goto_2

    :cond_2
    move v8, v4

    :goto_3
    invoke-virtual {v7}, Landroid/text/SpannableStringBuilder;->length()I

    move-result v9

    const/16 v10, 0x20

    if-ge v8, v9, :cond_5

    invoke-virtual {v7, v8}, Landroid/text/SpannableStringBuilder;->charAt(I)C

    move-result v9

    if-ne v9, v10, :cond_4

    add-int/lit8 v9, v8, 0x1

    move v11, v9

    :goto_4
    invoke-virtual {v7}, Landroid/text/SpannableStringBuilder;->length()I

    move-result v12

    if-ge v11, v12, :cond_3

    invoke-virtual {v7, v11}, Landroid/text/SpannableStringBuilder;->charAt(I)C

    move-result v12

    if-ne v12, v10, :cond_3

    add-int/lit8 v11, v11, 0x1

    goto :goto_4

    :cond_3
    sub-int/2addr v11, v9

    if-lez v11, :cond_4

    add-int/2addr v11, v8

    invoke-virtual {v7, v8, v11}, Landroid/text/SpannableStringBuilder;->delete(II)Landroid/text/SpannableStringBuilder;

    :cond_4
    add-int/lit8 v8, v8, 0x1

    goto :goto_3

    :cond_5
    invoke-virtual {v7}, Landroid/text/SpannableStringBuilder;->length()I

    move-result v8

    const/4 v9, 0x1

    if-lez v8, :cond_6

    invoke-virtual {v7, v4}, Landroid/text/SpannableStringBuilder;->charAt(I)C

    move-result v8

    if-ne v8, v10, :cond_6

    invoke-virtual {v7, v4, v9}, Landroid/text/SpannableStringBuilder;->delete(II)Landroid/text/SpannableStringBuilder;

    :cond_6
    move v8, v4

    :goto_5
    invoke-virtual {v7}, Landroid/text/SpannableStringBuilder;->length()I

    move-result v11

    sub-int/2addr v11, v9

    const/16 v12, 0xa

    if-ge v8, v11, :cond_8

    invoke-virtual {v7, v8}, Landroid/text/SpannableStringBuilder;->charAt(I)C

    move-result v11

    if-ne v11, v12, :cond_7

    add-int/lit8 v11, v8, 0x1

    invoke-virtual {v7, v11}, Landroid/text/SpannableStringBuilder;->charAt(I)C

    move-result v12

    if-ne v12, v10, :cond_7

    add-int/lit8 v12, v8, 0x2

    invoke-virtual {v7, v11, v12}, Landroid/text/SpannableStringBuilder;->delete(II)Landroid/text/SpannableStringBuilder;

    :cond_7
    add-int/lit8 v8, v8, 0x1

    goto :goto_5

    :cond_8
    invoke-virtual {v7}, Landroid/text/SpannableStringBuilder;->length()I

    move-result v8

    if-lez v8, :cond_9

    invoke-virtual {v7}, Landroid/text/SpannableStringBuilder;->length()I

    move-result v8

    sub-int/2addr v8, v9

    invoke-virtual {v7, v8}, Landroid/text/SpannableStringBuilder;->charAt(I)C

    move-result v8

    if-ne v8, v10, :cond_9

    invoke-virtual {v7}, Landroid/text/SpannableStringBuilder;->length()I

    move-result v8

    sub-int/2addr v8, v9

    invoke-virtual {v7}, Landroid/text/SpannableStringBuilder;->length()I

    move-result v11

    invoke-virtual {v7, v8, v11}, Landroid/text/SpannableStringBuilder;->delete(II)Landroid/text/SpannableStringBuilder;

    :cond_9
    move v8, v4

    :goto_6
    invoke-virtual {v7}, Landroid/text/SpannableStringBuilder;->length()I

    move-result v11

    sub-int/2addr v11, v9

    if-ge v8, v11, :cond_b

    invoke-virtual {v7, v8}, Landroid/text/SpannableStringBuilder;->charAt(I)C

    move-result v11

    if-ne v11, v10, :cond_a

    add-int/lit8 v11, v8, 0x1

    invoke-virtual {v7, v11}, Landroid/text/SpannableStringBuilder;->charAt(I)C

    move-result v13

    if-ne v13, v12, :cond_a

    invoke-virtual {v7, v8, v11}, Landroid/text/SpannableStringBuilder;->delete(II)Landroid/text/SpannableStringBuilder;

    :cond_a
    add-int/lit8 v8, v8, 0x1

    goto :goto_6

    :cond_b
    invoke-virtual {v7}, Landroid/text/SpannableStringBuilder;->length()I

    move-result v8

    if-lez v8, :cond_c

    invoke-virtual {v7}, Landroid/text/SpannableStringBuilder;->length()I

    move-result v8

    sub-int/2addr v8, v9

    invoke-virtual {v7, v8}, Landroid/text/SpannableStringBuilder;->charAt(I)C

    move-result v8

    if-ne v8, v12, :cond_c

    invoke-virtual {v7}, Landroid/text/SpannableStringBuilder;->length()I

    move-result v8

    sub-int/2addr v8, v9

    invoke-virtual {v7}, Landroid/text/SpannableStringBuilder;->length()I

    move-result v9

    invoke-virtual {v7, v8, v9}, Landroid/text/SpannableStringBuilder;->delete(II)Landroid/text/SpannableStringBuilder;

    :cond_c
    iget v7, v6, Lwa/e;->c:F

    iget v8, v6, Lwa/e;->d:I

    iput v7, v3, Lw8/a;->e:F

    iput v8, v3, Lw8/a;->f:I

    iget v7, v6, Lwa/e;->e:I

    iput v7, v3, Lw8/a;->g:I

    iget v7, v6, Lwa/e;->b:F

    iput v7, v3, Lw8/a;->h:F

    iget v7, v6, Lwa/e;->f:F

    iput v7, v3, Lw8/a;->l:F

    iget v7, v6, Lwa/e;->i:F

    iget v8, v6, Lwa/e;->h:I

    iput v7, v3, Lw8/a;->k:F

    iput v8, v3, Lw8/a;->j:I

    iget v6, v6, Lwa/e;->j:I

    iput v6, v3, Lw8/a;->p:I

    invoke-virtual {v3}, Lw8/a;->a()Lw8/b;

    move-result-object v3

    invoke-virtual {v1, v3}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    goto/16 :goto_1

    :cond_d
    return-object v1

    :pswitch_0
    iget-object v1, v0, Lb30/m;->x:Ljava/lang/Object;

    check-cast v1, Lfo/e;

    iget-object v4, v0, Lb30/m;->z:Ljava/lang/Object;

    move-object v7, v4

    check-cast v7, Ljava/util/Map;

    iget-object v4, v0, Lb30/m;->E:Ljava/lang/Object;

    move-object v8, v4

    check-cast v8, Ljava/util/HashMap;

    iget-object v4, v0, Lb30/m;->F:Ljava/lang/Object;

    move-object v9, v4

    check-cast v9, Ljava/util/HashMap;

    new-instance v10, Ljava/util/ArrayList;

    invoke-direct {v10}, Ljava/util/ArrayList;-><init>()V

    iget-object v4, v1, Lfo/e;->h:Ljava/lang/String;

    invoke-virtual {v1, v2, v3, v4, v10}, Lfo/e;->g(JLjava/lang/String;Ljava/util/ArrayList;)V

    new-instance v6, Ljava/util/TreeMap;

    invoke-direct {v6}, Ljava/util/TreeMap;-><init>()V

    const/4 v4, 0x0

    iget-object v5, v1, Lfo/e;->h:Ljava/lang/String;

    invoke-virtual/range {v1 .. v6}, Lfo/e;->i(JZLjava/lang/String;Ljava/util/TreeMap;)V

    iget-object v2, v1, Lfo/e;->h:Ljava/lang/String;

    move-object v4, v7

    move-object v5, v8

    move-object v7, v6

    move-object v6, v2

    move-wide/from16 v2, p1

    invoke-virtual/range {v1 .. v7}, Lfo/e;->h(JLjava/util/Map;Ljava/util/HashMap;Ljava/lang/String;Ljava/util/TreeMap;)V

    move-object v6, v7

    new-instance v1, Ljava/util/ArrayList;

    invoke-direct {v1}, Ljava/util/ArrayList;-><init>()V

    invoke-virtual {v10}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    move-result-object v2

    :goto_7
    invoke-interface {v2}, Ljava/util/Iterator;->hasNext()Z

    move-result v3

    const/4 v4, 0x0

    if-eqz v3, :cond_f

    invoke-interface {v2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Landroid/util/Pair;

    iget-object v7, v3, Landroid/util/Pair;->second:Ljava/lang/Object;

    invoke-virtual {v9, v7}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v7

    check-cast v7, Ljava/lang/String;

    if-nez v7, :cond_e

    goto :goto_7

    :cond_e
    invoke-static {v7, v4}, Landroid/util/Base64;->decode(Ljava/lang/String;I)[B

    move-result-object v7

    array-length v8, v7

    invoke-static {v7, v4, v8}, Landroid/graphics/BitmapFactory;->decodeByteArray([BII)Landroid/graphics/Bitmap;

    move-result-object v14

    iget-object v3, v3, Landroid/util/Pair;->first:Ljava/lang/Object;

    invoke-virtual {v5, v3}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Lfo/f;

    invoke-virtual {v3}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    iget v4, v3, Lfo/f;->b:F

    iget v15, v3, Lfo/f;->c:F

    iget v7, v3, Lfo/f;->e:I

    iget v8, v3, Lfo/f;->f:F

    iget v10, v3, Lfo/f;->g:F

    iget v3, v3, Lfo/f;->j:I

    move/from16 v23, v10

    new-instance v10, Lxn/b;

    const/4 v11, 0x0

    const/16 v16, 0x0

    const/16 v19, 0x0

    const/high16 v20, -0x80000000

    const v21, -0x800001

    const/16 v24, 0x0

    const/high16 v25, -0x1000000

    const/16 v27, 0x0

    move-object v12, v11

    move-object v13, v11

    move/from16 v26, v3

    move/from16 v18, v4

    move/from16 v17, v7

    move/from16 v22, v8

    invoke-direct/range {v10 .. v27}, Lxn/b;-><init>(Ljava/lang/CharSequence;Landroid/text/Layout$Alignment;Landroid/text/Layout$Alignment;Landroid/graphics/Bitmap;FIIFIIFFFZIIF)V

    invoke-virtual {v1, v10}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    goto :goto_7

    :cond_f
    invoke-virtual {v6}, Ljava/util/TreeMap;->entrySet()Ljava/util/Set;

    move-result-object v2

    invoke-interface {v2}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    move-result-object v2

    :goto_8
    invoke-interface {v2}, Ljava/util/Iterator;->hasNext()Z

    move-result v3

    if-eqz v3, :cond_1b

    invoke-interface {v2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Ljava/util/Map$Entry;

    invoke-interface {v3}, Ljava/util/Map$Entry;->getKey()Ljava/lang/Object;

    move-result-object v6

    invoke-virtual {v5, v6}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v6

    check-cast v6, Lfo/f;

    invoke-virtual {v6}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    invoke-interface {v3}, Ljava/util/Map$Entry;->getValue()Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Lxn/a;

    iget-object v7, v3, Lxn/a;->a:Ljava/lang/CharSequence;

    invoke-virtual {v7}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    check-cast v7, Landroid/text/SpannableStringBuilder;

    invoke-virtual {v7}, Landroid/text/SpannableStringBuilder;->length()I

    move-result v8

    const-class v9, Lfo/a;

    invoke-virtual {v7, v4, v8, v9}, Landroid/text/SpannableStringBuilder;->getSpans(IILjava/lang/Class;)[Ljava/lang/Object;

    move-result-object v8

    check-cast v8, [Lfo/a;

    array-length v9, v8

    move v10, v4

    :goto_9
    if-ge v10, v9, :cond_10

    aget-object v11, v8, v10

    invoke-virtual {v7, v11}, Landroid/text/SpannableStringBuilder;->getSpanStart(Ljava/lang/Object;)I

    move-result v12

    invoke-virtual {v7, v11}, Landroid/text/SpannableStringBuilder;->getSpanEnd(Ljava/lang/Object;)I

    move-result v11

    const-string v13, ""

    invoke-virtual {v7, v12, v11, v13}, Landroid/text/SpannableStringBuilder;->replace(IILjava/lang/CharSequence;)Landroid/text/SpannableStringBuilder;

    add-int/lit8 v10, v10, 0x1

    goto :goto_9

    :cond_10
    move v8, v4

    :goto_a
    invoke-virtual {v7}, Landroid/text/SpannableStringBuilder;->length()I

    move-result v9

    const/16 v10, 0x20

    if-ge v8, v9, :cond_13

    invoke-virtual {v7, v8}, Landroid/text/SpannableStringBuilder;->charAt(I)C

    move-result v9

    if-ne v9, v10, :cond_12

    add-int/lit8 v9, v8, 0x1

    move v11, v9

    :goto_b
    invoke-virtual {v7}, Landroid/text/SpannableStringBuilder;->length()I

    move-result v12

    if-ge v11, v12, :cond_11

    invoke-virtual {v7, v11}, Landroid/text/SpannableStringBuilder;->charAt(I)C

    move-result v12

    if-ne v12, v10, :cond_11

    add-int/lit8 v11, v11, 0x1

    goto :goto_b

    :cond_11
    sub-int/2addr v11, v9

    if-lez v11, :cond_12

    add-int/2addr v11, v8

    invoke-virtual {v7, v8, v11}, Landroid/text/SpannableStringBuilder;->delete(II)Landroid/text/SpannableStringBuilder;

    :cond_12
    add-int/lit8 v8, v8, 0x1

    goto :goto_a

    :cond_13
    invoke-virtual {v7}, Landroid/text/SpannableStringBuilder;->length()I

    move-result v8

    const/4 v9, 0x1

    if-lez v8, :cond_14

    invoke-virtual {v7, v4}, Landroid/text/SpannableStringBuilder;->charAt(I)C

    move-result v8

    if-ne v8, v10, :cond_14

    invoke-virtual {v7, v4, v9}, Landroid/text/SpannableStringBuilder;->delete(II)Landroid/text/SpannableStringBuilder;

    :cond_14
    move v8, v4

    :goto_c
    invoke-virtual {v7}, Landroid/text/SpannableStringBuilder;->length()I

    move-result v11

    sub-int/2addr v11, v9

    const/16 v12, 0xa

    if-ge v8, v11, :cond_16

    invoke-virtual {v7, v8}, Landroid/text/SpannableStringBuilder;->charAt(I)C

    move-result v11

    if-ne v11, v12, :cond_15

    add-int/lit8 v11, v8, 0x1

    invoke-virtual {v7, v11}, Landroid/text/SpannableStringBuilder;->charAt(I)C

    move-result v12

    if-ne v12, v10, :cond_15

    add-int/lit8 v12, v8, 0x2

    invoke-virtual {v7, v11, v12}, Landroid/text/SpannableStringBuilder;->delete(II)Landroid/text/SpannableStringBuilder;

    :cond_15
    add-int/lit8 v8, v8, 0x1

    goto :goto_c

    :cond_16
    invoke-virtual {v7}, Landroid/text/SpannableStringBuilder;->length()I

    move-result v8

    if-lez v8, :cond_17

    invoke-virtual {v7}, Landroid/text/SpannableStringBuilder;->length()I

    move-result v8

    sub-int/2addr v8, v9

    invoke-virtual {v7, v8}, Landroid/text/SpannableStringBuilder;->charAt(I)C

    move-result v8

    if-ne v8, v10, :cond_17

    invoke-virtual {v7}, Landroid/text/SpannableStringBuilder;->length()I

    move-result v8

    sub-int/2addr v8, v9

    invoke-virtual {v7}, Landroid/text/SpannableStringBuilder;->length()I

    move-result v11

    invoke-virtual {v7, v8, v11}, Landroid/text/SpannableStringBuilder;->delete(II)Landroid/text/SpannableStringBuilder;

    :cond_17
    move v8, v4

    :goto_d
    invoke-virtual {v7}, Landroid/text/SpannableStringBuilder;->length()I

    move-result v11

    sub-int/2addr v11, v9

    if-ge v8, v11, :cond_19

    invoke-virtual {v7, v8}, Landroid/text/SpannableStringBuilder;->charAt(I)C

    move-result v11

    if-ne v11, v10, :cond_18

    add-int/lit8 v11, v8, 0x1

    invoke-virtual {v7, v11}, Landroid/text/SpannableStringBuilder;->charAt(I)C

    move-result v13

    if-ne v13, v12, :cond_18

    invoke-virtual {v7, v8, v11}, Landroid/text/SpannableStringBuilder;->delete(II)Landroid/text/SpannableStringBuilder;

    :cond_18
    add-int/lit8 v8, v8, 0x1

    goto :goto_d

    :cond_19
    invoke-virtual {v7}, Landroid/text/SpannableStringBuilder;->length()I

    move-result v8

    if-lez v8, :cond_1a

    invoke-virtual {v7}, Landroid/text/SpannableStringBuilder;->length()I

    move-result v8

    sub-int/2addr v8, v9

    invoke-virtual {v7, v8}, Landroid/text/SpannableStringBuilder;->charAt(I)C

    move-result v8

    if-ne v8, v12, :cond_1a

    invoke-virtual {v7}, Landroid/text/SpannableStringBuilder;->length()I

    move-result v8

    sub-int/2addr v8, v9

    invoke-virtual {v7}, Landroid/text/SpannableStringBuilder;->length()I

    move-result v9

    invoke-virtual {v7, v8, v9}, Landroid/text/SpannableStringBuilder;->delete(II)Landroid/text/SpannableStringBuilder;

    :cond_1a
    iget v7, v6, Lfo/f;->c:F

    iget v8, v6, Lfo/f;->d:I

    iput v7, v3, Lxn/a;->e:F

    iput v8, v3, Lxn/a;->f:I

    iget v7, v6, Lfo/f;->e:I

    iput v7, v3, Lxn/a;->g:I

    iget v7, v6, Lfo/f;->b:F

    iput v7, v3, Lxn/a;->h:F

    iget v7, v6, Lfo/f;->f:F

    iput v7, v3, Lxn/a;->l:F

    iget v7, v6, Lfo/f;->i:F

    iget v8, v6, Lfo/f;->h:I

    iput v7, v3, Lxn/a;->k:F

    iput v8, v3, Lxn/a;->j:I

    iget v6, v6, Lfo/f;->j:I

    iput v6, v3, Lxn/a;->p:I

    invoke-virtual {v3}, Lxn/a;->a()Lxn/b;

    move-result-object v3

    invoke-virtual {v1, v3}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    goto/16 :goto_8

    :cond_1b
    return-object v1

    nop

    :pswitch_data_0
    .packed-switch 0x4
        :pswitch_0
    .end packed-switch
.end method

.method public e()V
    .locals 10

    iget-object v0, p0, Lb30/m;->F:Ljava/lang/Object;

    check-cast v0, Ll83/p;

    iget-object v1, p0, Lb30/m;->x:Ljava/lang/Object;

    move-object v4, v1

    check-cast v4, Lpg/a;

    iget-object v1, p0, Lb30/m;->z:Ljava/lang/Object;

    check-cast v1, Lc93/a;

    if-eqz v1, :cond_10

    iget-object v2, p0, Lb30/m;->y:Ljava/lang/Object;

    check-cast v2, Log/b;

    invoke-virtual {v2}, Ljava/lang/Enum;->ordinal()I

    move-result v2

    if-eqz v2, :cond_4

    const/4 v3, 0x1

    if-eq v2, v3, :cond_3

    const/4 v3, 0x2

    if-eq v2, v3, :cond_2

    const/4 v3, 0x3

    if-eq v2, v3, :cond_1

    const/4 v3, 0x4

    if-ne v2, v3, :cond_0

    new-instance v2, Landroidx/room/v0;

    const/4 v8, 0x0

    const/16 v9, 0x11

    const/4 v3, 0x2

    const-class v5, Lpg/a;

    const-string v6, "trace"

    const-string v7, "trace(Ljava/lang/Throwable;Lkotlin/jvm/functions/Function0;)V"

    invoke-direct/range {v2 .. v9}, Landroidx/room/v0;-><init>(ILjava/lang/Object;Ljava/lang/Class;Ljava/lang/String;Ljava/lang/String;II)V

    goto :goto_0

    :cond_0
    new-instance v0, Lkotlin/NoWhenBranchMatchedException;

    invoke-direct {v0}, Lkotlin/NoWhenBranchMatchedException;-><init>()V

    throw v0

    :cond_1
    new-instance v2, Landroidx/room/v0;

    const/4 v8, 0x0

    const/16 v9, 0x10

    const/4 v3, 0x2

    const-class v5, Lpg/a;

    const-string v6, "debug"

    const-string v7, "debug(Ljava/lang/Throwable;Lkotlin/jvm/functions/Function0;)V"

    invoke-direct/range {v2 .. v9}, Landroidx/room/v0;-><init>(ILjava/lang/Object;Ljava/lang/Class;Ljava/lang/String;Ljava/lang/String;II)V

    goto :goto_0

    :cond_2
    new-instance v2, Landroidx/room/v0;

    const/4 v8, 0x0

    const/16 v9, 0xf

    const/4 v3, 0x2

    const-class v5, Lpg/a;

    const-string v6, "info"

    const-string v7, "info(Ljava/lang/Throwable;Lkotlin/jvm/functions/Function0;)V"

    invoke-direct/range {v2 .. v9}, Landroidx/room/v0;-><init>(ILjava/lang/Object;Ljava/lang/Class;Ljava/lang/String;Ljava/lang/String;II)V

    goto :goto_0

    :cond_3
    new-instance v2, Landroidx/room/v0;

    const/4 v8, 0x0

    const/16 v9, 0xe

    const/4 v3, 0x2

    const-class v5, Lpg/a;

    const-string v6, "warn"

    const-string v7, "warn(Ljava/lang/Throwable;Lkotlin/jvm/functions/Function0;)V"

    invoke-direct/range {v2 .. v9}, Landroidx/room/v0;-><init>(ILjava/lang/Object;Ljava/lang/Class;Ljava/lang/String;Ljava/lang/String;II)V

    goto :goto_0

    :cond_4
    new-instance v2, Landroidx/room/v0;

    const/4 v8, 0x0

    const/16 v9, 0xd

    const/4 v3, 0x2

    const-class v5, Lpg/a;

    const-string v6, "error"

    const-string v7, "error(Ljava/lang/Throwable;Lkotlin/jvm/functions/Function0;)V"

    invoke-direct/range {v2 .. v9}, Landroidx/room/v0;-><init>(ILjava/lang/Object;Ljava/lang/Class;Ljava/lang/String;Ljava/lang/String;II)V

    :goto_0
    invoke-virtual {v0}, Ll83/p;->getValue()Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Ljava/util/Map;

    invoke-interface {v3}, Ljava/util/Map;->isEmpty()Z

    move-result v3

    if-nez v3, :cond_f

    invoke-static {}, Lup/d;->v()Lig3/b;

    move-result-object v3

    const-string v4, "MDCAdapter cannot be null. See also http://www.slf4j.org/codes.html#null_MDCA"

    if-eqz v3, :cond_e

    invoke-static {}, Lup/d;->v()Lig3/b;

    move-result-object v3

    invoke-interface {v3}, Lig3/b;->f()Ljava/util/Map;

    move-result-object v3

    :try_start_0
    invoke-virtual {v0}, Ll83/p;->getValue()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/util/Map;

    invoke-interface {v0}, Ljava/util/Map;->entrySet()Ljava/util/Set;

    move-result-object v0

    invoke-interface {v0}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :goto_1
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v5

    if-eqz v5, :cond_7

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v5

    check-cast v5, Ljava/util/Map$Entry;

    invoke-interface {v5}, Ljava/util/Map$Entry;->getKey()Ljava/lang/Object;

    move-result-object v6

    check-cast v6, Ljava/lang/String;

    invoke-interface {v5}, Ljava/util/Map$Entry;->getValue()Ljava/lang/Object;

    move-result-object v5

    invoke-virtual {v5}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object v5

    if-eqz v6, :cond_6

    invoke-static {}, Lup/d;->v()Lig3/b;

    move-result-object v7

    if-eqz v7, :cond_5

    invoke-static {}, Lup/d;->v()Lig3/b;

    move-result-object v7

    invoke-interface {v7, v6, v5}, Lig3/b;->c(Ljava/lang/String;Ljava/lang/String;)V

    goto :goto_1

    :cond_5
    new-instance v0, Ljava/lang/IllegalStateException;

    invoke-direct {v0, v4}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v0

    :cond_6
    new-instance v0, Ljava/lang/IllegalArgumentException;

    const-string v1, "key parameter cannot be null"

    invoke-direct {v0, v1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw v0

    :catchall_0
    move-exception v0

    goto :goto_2

    :cond_7
    iget-object v0, p0, Lb30/m;->E:Ljava/lang/Object;

    check-cast v0, Ljava/lang/Throwable;

    invoke-interface {v2, v0, v1}, Lc93/m;->invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    if-nez v3, :cond_9

    invoke-static {}, Lup/d;->v()Lig3/b;

    move-result-object v0

    if-eqz v0, :cond_8

    invoke-static {}, Lup/d;->v()Lig3/b;

    move-result-object v0

    invoke-interface {v0}, Lig3/b;->clear()V

    return-void

    :cond_8
    new-instance v0, Ljava/lang/IllegalStateException;

    invoke-direct {v0, v4}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v0

    :cond_9
    invoke-static {}, Lup/d;->v()Lig3/b;

    move-result-object v0

    if-eqz v0, :cond_a

    invoke-static {}, Lup/d;->v()Lig3/b;

    move-result-object v0

    invoke-interface {v0, v3}, Lig3/b;->v(Ljava/util/Map;)V

    return-void

    :cond_a
    new-instance v0, Ljava/lang/IllegalStateException;

    invoke-direct {v0, v4}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v0

    :goto_2
    if-nez v3, :cond_c

    invoke-static {}, Lup/d;->v()Lig3/b;

    move-result-object v1

    if-eqz v1, :cond_b

    invoke-static {}, Lup/d;->v()Lig3/b;

    move-result-object v1

    invoke-interface {v1}, Lig3/b;->clear()V

    goto :goto_3

    :cond_b
    new-instance v0, Ljava/lang/IllegalStateException;

    invoke-direct {v0, v4}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v0

    :cond_c
    invoke-static {}, Lup/d;->v()Lig3/b;

    move-result-object v1

    if-eqz v1, :cond_d

    invoke-static {}, Lup/d;->v()Lig3/b;

    move-result-object v1

    invoke-interface {v1, v3}, Lig3/b;->v(Ljava/util/Map;)V

    :goto_3
    throw v0

    :cond_d
    new-instance v0, Ljava/lang/IllegalStateException;

    invoke-direct {v0, v4}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v0

    :cond_e
    new-instance v0, Ljava/lang/IllegalStateException;

    invoke-direct {v0, v4}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v0

    :cond_f
    iget-object v0, p0, Lb30/m;->E:Ljava/lang/Object;

    check-cast v0, Ljava/lang/Throwable;

    invoke-interface {v2, v0, v1}, Lc93/m;->invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    return-void

    :cond_10
    new-instance v0, Ljava/lang/IllegalArgumentException;

    const-string v1, "no message provided to LogRecordBuilder"

    invoke-direct {v0, v1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw v0
.end method

.method public g(Luh/e;Lj93/d;)V
    .locals 3

    iget-object v0, p0, Lb30/m;->E:Ljava/lang/Object;

    check-cast v0, Ljava/util/ArrayList;

    new-instance v1, Lqt2/e;

    const/16 v2, 0x10

    invoke-direct {v1, v2, p1, p2}, Lqt2/e;-><init>(ILjava/lang/Object;Ljava/lang/Object;)V

    invoke-interface {v0, v1}, Ljava/util/Collection;->add(Ljava/lang/Object;)Z

    return-void
.end method

.method public get()Ljava/lang/Object;
    .locals 7

    iget-object v0, p0, Lb30/m;->x:Ljava/lang/Object;

    check-cast v0, Lk83/a;

    invoke-interface {v0}, Lk83/a;->get()Ljava/lang/Object;

    move-result-object v0

    move-object v2, v0

    check-cast v2, Ljava/util/concurrent/Executor;

    iget-object v0, p0, Lb30/m;->y:Ljava/lang/Object;

    check-cast v0, Lk83/a;

    invoke-interface {v0}, Lk83/a;->get()Ljava/lang/Object;

    move-result-object v0

    move-object v3, v0

    check-cast v3, Lhm/e;

    iget-object v0, p0, Lb30/m;->z:Ljava/lang/Object;

    check-cast v0, Lgm/r;

    invoke-virtual {v0}, Lgm/r;->get()Ljava/lang/Object;

    move-result-object v0

    move-object v4, v0

    check-cast v4, Lgm/r;

    iget-object v0, p0, Lb30/m;->E:Ljava/lang/Object;

    check-cast v0, Lk83/a;

    invoke-interface {v0}, Lk83/a;->get()Ljava/lang/Object;

    move-result-object v0

    move-object v5, v0

    check-cast v5, Lnm/d;

    iget-object v0, p0, Lb30/m;->F:Ljava/lang/Object;

    check-cast v0, Lk83/a;

    invoke-interface {v0}, Lk83/a;->get()Ljava/lang/Object;

    move-result-object v0

    move-object v6, v0

    check-cast v6, Lom/b;

    new-instance v1, Llm/a;

    invoke-direct/range {v1 .. v6}, Llm/a;-><init>(Ljava/util/concurrent/Executor;Lhm/e;Lgm/r;Lnm/d;Lom/b;)V

    return-object v1
.end method

.method public h(I)J
    .locals 2

    iget v0, p0, Lb30/m;->w:I

    packed-switch v0, :pswitch_data_0

    iget-object v0, p0, Lb30/m;->y:Ljava/lang/Object;

    check-cast v0, [J

    aget-wide v0, v0, p1

    return-wide v0

    :pswitch_0
    iget-object v0, p0, Lb30/m;->y:Ljava/lang/Object;

    check-cast v0, [J

    aget-wide v0, v0, p1

    return-wide v0

    nop

    :pswitch_data_0
    .packed-switch 0x4
        :pswitch_0
    .end packed-switch
.end method

.method public i(Lzh/a;Lj93/d;)V
    .locals 2

    iget-object v0, p0, Lb30/m;->y:Ljava/lang/Object;

    check-cast v0, Ljava/util/ArrayList;

    new-instance v1, Ll83/k;

    invoke-direct {v1, p1, p2}, Ll83/k;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    invoke-interface {v0, v1}, Ljava/util/Collection;->add(Ljava/lang/Object;)Z

    return-void
.end method

.method public j()I
    .locals 1

    iget v0, p0, Lb30/m;->w:I

    packed-switch v0, :pswitch_data_0

    iget-object v0, p0, Lb30/m;->y:Ljava/lang/Object;

    check-cast v0, [J

    array-length v0, v0

    return v0

    :pswitch_0
    iget-object v0, p0, Lb30/m;->y:Ljava/lang/Object;

    check-cast v0, [J

    array-length v0, v0

    return v0

    nop

    :pswitch_data_0
    .packed-switch 0x4
        :pswitch_0
    .end packed-switch
.end method

.method public k(Ljava/lang/Object;Lvs/t3;Z)V
    .locals 9

    iget-object v0, p0, Lb30/m;->y:Ljava/lang/Object;

    check-cast v0, Ljava/util/HashMap;

    if-eqz v0, :cond_9

    if-eqz p1, :cond_8

    invoke-virtual {p2}, Lvs/t3;->G()Lvs/n3;

    move-result-object v0

    sget-object v1, Lvs/n3;->y:Lvs/n3;

    if-ne v0, v1, :cond_7

    new-instance v2, Lcom/google/crypto/tink/internal/j0;

    invoke-virtual {p2}, Lvs/t3;->F()Lvs/h4;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/Enum;->ordinal()I

    move-result v0

    const/4 v1, 0x1

    if-eq v0, v1, :cond_3

    const/4 v1, 0x2

    if-eq v0, v1, :cond_2

    const/4 v1, 0x3

    if-eq v0, v1, :cond_1

    const/4 v1, 0x4

    if-ne v0, v1, :cond_0

    goto :goto_0

    :cond_0
    new-instance p1, Ljava/security/GeneralSecurityException;

    const-string p2, "unknown output prefix type"

    invoke-direct {p1, p2}, Ljava/security/GeneralSecurityException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_1
    sget-object v0, Lfs/b;->a:[B

    goto :goto_1

    :cond_2
    :goto_0
    invoke-virtual {p2}, Lvs/t3;->E()I

    move-result v0

    invoke-static {v0}, Lcom/google/crypto/tink/internal/a0;->a(I)Lct/a;

    move-result-object v0

    invoke-virtual {v0}, Lct/a;->b()[B

    move-result-object v0

    goto :goto_1

    :cond_3
    invoke-virtual {p2}, Lvs/t3;->E()I

    move-result v0

    invoke-static {v0}, Lcom/google/crypto/tink/internal/a0;->b(I)Lct/a;

    move-result-object v0

    invoke-virtual {v0}, Lct/a;->b()[B

    move-result-object v0

    :goto_1
    invoke-static {v0}, Lct/a;->a([B)Lct/a;

    move-result-object v4

    invoke-virtual {p2}, Lvs/t3;->G()Lvs/n3;

    move-result-object v5

    invoke-virtual {p2}, Lvs/t3;->F()Lvs/h4;

    move-result-object v6

    invoke-virtual {p2}, Lvs/t3;->E()I

    move-result v7

    invoke-virtual {p2}, Lvs/t3;->D()Lvs/m3;

    move-result-object p2

    invoke-virtual {p2}, Lvs/m3;->E()Ljava/lang/String;

    move-result-object v8

    move-object v3, p1

    invoke-direct/range {v2 .. v8}, Lcom/google/crypto/tink/internal/j0;-><init>(Ljava/lang/Object;Lct/a;Lvs/n3;Lvs/h4;ILjava/lang/String;)V

    iget-object p1, p0, Lb30/m;->y:Ljava/lang/Object;

    check-cast p1, Ljava/util/HashMap;

    iget-object p2, p0, Lb30/m;->z:Ljava/lang/Object;

    check-cast p2, Ljava/util/ArrayList;

    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    invoke-virtual {v0, v2}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    invoke-static {v0}, Ljava/util/Collections;->unmodifiableList(Ljava/util/List;)Ljava/util/List;

    move-result-object v0

    invoke-virtual {p1, v4, v0}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/util/List;

    if-eqz v0, :cond_4

    new-instance v1, Ljava/util/ArrayList;

    invoke-direct {v1}, Ljava/util/ArrayList;-><init>()V

    invoke-virtual {v1, v0}, Ljava/util/ArrayList;->addAll(Ljava/util/Collection;)Z

    invoke-virtual {v1, v2}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    invoke-static {v1}, Ljava/util/Collections;->unmodifiableList(Ljava/util/List;)Ljava/util/List;

    move-result-object v0

    invoke-virtual {p1, v4, v0}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    :cond_4
    invoke-virtual {p2, v2}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    if-eqz p3, :cond_6

    iget-object p1, p0, Lb30/m;->E:Ljava/lang/Object;

    check-cast p1, Lcom/google/crypto/tink/internal/j0;

    if-nez p1, :cond_5

    iput-object v2, p0, Lb30/m;->E:Ljava/lang/Object;

    return-void

    :cond_5
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string p2, "you cannot set two primary primitives"

    invoke-direct {p1, p2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_6
    return-void

    :cond_7
    new-instance p1, Ljava/security/GeneralSecurityException;

    const-string p2, "only ENABLED key is allowed"

    invoke-direct {p1, p2}, Ljava/security/GeneralSecurityException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_8
    new-instance p1, Ljava/lang/NullPointerException;

    const-string p2, "`fullPrimitive` must not be null"

    invoke-direct {p1, p2}, Ljava/lang/NullPointerException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_9
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string p2, "addEntry cannot be called after build"

    invoke-direct {p1, p2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1
.end method

.method public l()V
    .locals 4

    iget-object v0, p0, Lb30/m;->y:Ljava/lang/Object;

    check-cast v0, Lm63/d;

    invoke-virtual {v0}, Lm63/d;->l()V

    iget-object v0, p0, Lb30/m;->z:Ljava/lang/Object;

    check-cast v0, Lm63/d;

    iget-object v1, p0, Lb30/m;->E:Ljava/lang/Object;

    check-cast v1, Lva3/h;

    new-instance v2, Lab3/a;

    iget-object v3, p0, Lb30/m;->F:Ljava/lang/Object;

    check-cast v3, Ljava/util/ArrayList;

    invoke-static {v3}, Lm83/s;->p1(Ljava/util/List;)Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Ls93/b;

    invoke-direct {v2, v3}, Lab3/a;-><init>(Ls93/b;)V

    iget-object v0, v0, Lm63/d;->y:Ljava/lang/Object;

    check-cast v0, Ljava/util/HashMap;

    invoke-virtual {v0, v1, v2}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    return-void
.end method

.method public m(Lva3/h;)Loa3/o;
    .locals 1

    iget-object v0, p0, Lb30/m;->x:Ljava/lang/Object;

    check-cast v0, Lm63/d;

    invoke-virtual {v0, p1}, Lm63/d;->m(Lva3/h;)Loa3/o;

    move-result-object p1

    return-object p1
.end method

.method public n(Lva3/h;Lab3/f;)V
    .locals 1

    iget-object v0, p0, Lb30/m;->x:Ljava/lang/Object;

    check-cast v0, Lm63/d;

    invoke-virtual {v0, p1, p2}, Lm63/d;->n(Lva3/h;Lab3/f;)V

    return-void
.end method

.method public p(Lva3/h;Ljava/lang/Object;)V
    .locals 1

    iget-object v0, p0, Lb30/m;->x:Ljava/lang/Object;

    check-cast v0, Lm63/d;

    invoke-virtual {v0, p1, p2}, Lm63/d;->p(Lva3/h;Ljava/lang/Object;)V

    return-void
.end method

.method public q(Lva3/h;Lva3/c;Lva3/h;)V
    .locals 1

    iget-object v0, p0, Lb30/m;->x:Ljava/lang/Object;

    check-cast v0, Lm63/d;

    invoke-virtual {v0, p1, p2, p3}, Lm63/d;->q(Lva3/h;Lva3/c;Lva3/h;)V

    return-void
.end method

.method public r(Lc93/a;)V
    .locals 0

    iput-object p1, p0, Lb30/m;->z:Ljava/lang/Object;

    return-void
.end method

.method public s(Lva3/c;Lva3/h;)Loa3/n;
    .locals 1

    iget-object v0, p0, Lb30/m;->x:Ljava/lang/Object;

    check-cast v0, Lm63/d;

    invoke-virtual {v0, p1, p2}, Lm63/d;->s(Lva3/c;Lva3/h;)Loa3/n;

    move-result-object p1

    return-object p1
.end method

.method public t(I)Ljava/text/Bidi;
    .locals 14

    iget-object v0, p0, Lb30/m;->x:Ljava/lang/Object;

    check-cast v0, Landroid/text/Layout;

    iget-object v1, p0, Lb30/m;->y:Ljava/lang/Object;

    check-cast v1, Ljava/util/ArrayList;

    iget-object v2, p0, Lb30/m;->z:Ljava/lang/Object;

    check-cast v2, Ljava/util/ArrayList;

    iget-object v3, p0, Lb30/m;->E:Ljava/lang/Object;

    check-cast v3, [Z

    aget-boolean v4, v3, p1

    if-eqz v4, :cond_0

    invoke-virtual {v2, p1}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Ljava/text/Bidi;

    return-object p1

    :cond_0
    const/4 v4, 0x0

    if-nez p1, :cond_1

    move v5, v4

    goto :goto_0

    :cond_1
    add-int/lit8 v5, p1, -0x1

    invoke-virtual {v1, v5}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v5

    check-cast v5, Ljava/lang/Number;

    invoke-virtual {v5}, Ljava/lang/Number;->intValue()I

    move-result v5

    :goto_0
    invoke-virtual {v1, p1}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ljava/lang/Number;

    invoke-virtual {v1}, Ljava/lang/Number;->intValue()I

    move-result v1

    sub-int v11, v1, v5

    iget-object v6, p0, Lb30/m;->F:Ljava/lang/Object;

    check-cast v6, [C

    if-eqz v6, :cond_3

    array-length v7, v6

    if-ge v7, v11, :cond_2

    goto :goto_2

    :cond_2
    :goto_1
    move-object v7, v6

    goto :goto_3

    :cond_3
    :goto_2
    new-array v6, v11, [C

    goto :goto_1

    :goto_3
    invoke-virtual {v0}, Landroid/text/Layout;->getText()Ljava/lang/CharSequence;

    move-result-object v6

    invoke-static {v6, v5, v1, v7, v4}, Landroid/text/TextUtils;->getChars(Ljava/lang/CharSequence;II[CI)V

    invoke-static {v7, v4, v11}, Ljava/text/Bidi;->requiresBidi([CII)Z

    move-result v1

    const/4 v5, 0x0

    const/4 v13, 0x1

    if-eqz v1, :cond_5

    invoke-virtual {p0, p1}, Lb30/m;->C(I)I

    move-result v1

    invoke-virtual {v0, v1}, Landroid/text/Layout;->getLineForOffset(I)I

    move-result v1

    invoke-virtual {v0, v1}, Landroid/text/Layout;->getParagraphDirection(I)I

    move-result v0

    const/4 v1, -0x1

    if-ne v0, v1, :cond_4

    move v12, v13

    goto :goto_4

    :cond_4
    move v12, v4

    :goto_4
    new-instance v6, Ljava/text/Bidi;

    const/4 v9, 0x0

    const/4 v10, 0x0

    const/4 v8, 0x0

    invoke-direct/range {v6 .. v12}, Ljava/text/Bidi;-><init>([CI[BIII)V

    invoke-virtual {v6}, Ljava/text/Bidi;->getRunCount()I

    move-result v0

    if-ne v0, v13, :cond_6

    :cond_5
    move-object v6, v5

    :cond_6
    invoke-virtual {v2, p1, v6}, Ljava/util/ArrayList;->set(ILjava/lang/Object;)Ljava/lang/Object;

    aput-boolean v13, v3, p1

    if-eqz v6, :cond_8

    iget-object p1, p0, Lb30/m;->F:Ljava/lang/Object;

    check-cast p1, [C

    if-ne v7, p1, :cond_7

    move-object v7, v5

    goto :goto_5

    :cond_7
    move-object v7, p1

    :cond_8
    :goto_5
    iput-object v7, p0, Lb30/m;->F:Ljava/lang/Object;

    return-object v6
.end method

.method public u()Lxi/a;
    .locals 1

    iget-object v0, p0, Lb30/m;->x:Ljava/lang/Object;

    check-cast v0, Lxi/a;

    return-object v0
.end method

.method public v()Lxi/b;
    .locals 1

    iget-object v0, p0, Lb30/m;->z:Ljava/lang/Object;

    check-cast v0, Lxi/b;

    return-object v0
.end method

.method public w()Lxi/b;
    .locals 1

    iget-object v0, p0, Lb30/m;->E:Ljava/lang/Object;

    check-cast v0, Lxi/b;

    return-object v0
.end method

.method public x(IZ)F
    .locals 2

    iget-object v0, p0, Lb30/m;->x:Ljava/lang/Object;

    check-cast v0, Landroid/text/Layout;

    invoke-virtual {v0, p1}, Landroid/text/Layout;->getLineForOffset(I)I

    move-result v1

    invoke-virtual {v0, v1}, Landroid/text/Layout;->getLineEnd(I)I

    move-result v1

    if-le p1, v1, :cond_0

    move p1, v1

    :cond_0
    if-eqz p2, :cond_1

    invoke-virtual {v0, p1}, Landroid/text/Layout;->getPrimaryHorizontal(I)F

    move-result p1

    return p1

    :cond_1
    invoke-virtual {v0, p1}, Landroid/text/Layout;->getSecondaryHorizontal(I)F

    move-result p1

    return p1
.end method

.method public y(IZZ)F
    .locals 17

    move-object/from16 v0, p0

    move/from16 v1, p1

    move/from16 v2, p3

    iget-object v3, v0, Lb30/m;->x:Ljava/lang/Object;

    check-cast v3, Landroid/text/Layout;

    if-nez v2, :cond_0

    invoke-virtual/range {p0 .. p2}, Lb30/m;->x(IZ)F

    move-result v1

    return v1

    :cond_0
    invoke-static {v3, v1, v2}, Lcom/squareup/wire/n;->I(Landroid/text/Layout;IZ)I

    move-result v4

    invoke-virtual {v3, v4}, Landroid/text/Layout;->getLineStart(I)I

    move-result v5

    invoke-virtual {v3, v4}, Landroid/text/Layout;->getLineEnd(I)I

    move-result v6

    if-eq v1, v5, :cond_1

    if-eq v1, v6, :cond_1

    invoke-virtual/range {p0 .. p2}, Lb30/m;->x(IZ)F

    move-result v1

    return v1

    :cond_1
    if-eqz v1, :cond_22

    invoke-virtual {v3}, Landroid/text/Layout;->getText()Ljava/lang/CharSequence;

    move-result-object v7

    invoke-interface {v7}, Ljava/lang/CharSequence;->length()I

    move-result v7

    if-ne v1, v7, :cond_2

    goto/16 :goto_10

    :cond_2
    invoke-virtual {v0, v1, v2}, Lb30/m;->B(IZ)I

    move-result v2

    invoke-virtual {v0, v2}, Lb30/m;->C(I)I

    move-result v7

    invoke-virtual {v3, v7}, Landroid/text/Layout;->getLineForOffset(I)I

    move-result v7

    invoke-virtual {v3, v7}, Landroid/text/Layout;->getParagraphDirection(I)I

    move-result v7

    const/4 v8, -0x1

    const/4 v10, 0x1

    if-ne v7, v8, :cond_3

    move v7, v10

    goto :goto_0

    :cond_3
    const/4 v7, 0x0

    :goto_0
    invoke-virtual {v0, v6, v5}, Lb30/m;->E(II)I

    move-result v6

    invoke-virtual {v0, v2}, Lb30/m;->C(I)I

    move-result v11

    sub-int v12, v5, v11

    sub-int v11, v6, v11

    invoke-virtual {v0, v2}, Lb30/m;->t(I)Ljava/text/Bidi;

    move-result-object v2

    if-eqz v2, :cond_4

    invoke-virtual {v2, v12, v11}, Ljava/text/Bidi;->createLineBidi(II)Ljava/text/Bidi;

    move-result-object v2

    goto :goto_1

    :cond_4
    const/4 v2, 0x0

    :goto_1
    if-eqz v2, :cond_5

    invoke-virtual {v2}, Ljava/text/Bidi;->getRunCount()I

    move-result v11

    if-ne v11, v10, :cond_6

    :cond_5
    const/4 v13, 0x0

    goto/16 :goto_d

    :cond_6
    invoke-virtual {v2}, Ljava/text/Bidi;->getRunCount()I

    move-result v11

    new-array v12, v11, [Lm3/f;

    const/4 v13, 0x0

    :goto_2
    if-ge v13, v11, :cond_8

    new-instance v14, Lm3/f;

    invoke-virtual {v2, v13}, Ljava/text/Bidi;->getRunStart(I)I

    move-result v15

    add-int/2addr v15, v5

    invoke-virtual {v2, v13}, Ljava/text/Bidi;->getRunLimit(I)I

    move-result v16

    add-int v8, v16, v5

    invoke-virtual {v2, v13}, Ljava/text/Bidi;->getRunLevel(I)I

    move-result v16

    rem-int/lit8 v9, v16, 0x2

    if-ne v9, v10, :cond_7

    move v9, v10

    goto :goto_3

    :cond_7
    const/4 v9, 0x0

    :goto_3
    invoke-direct {v14, v15, v8, v9}, Lm3/f;-><init>(IIZ)V

    aput-object v14, v12, v13

    add-int/lit8 v13, v13, 0x1

    const/4 v8, -0x1

    goto :goto_2

    :cond_8
    invoke-virtual {v2}, Ljava/text/Bidi;->getRunCount()I

    move-result v8

    new-array v9, v8, [B

    const/4 v13, 0x0

    :goto_4
    if-ge v13, v8, :cond_9

    invoke-virtual {v2, v13}, Ljava/text/Bidi;->getRunLevel(I)I

    move-result v14

    int-to-byte v14, v14

    aput-byte v14, v9, v13

    add-int/lit8 v13, v13, 0x1

    goto :goto_4

    :cond_9
    const/4 v13, 0x0

    invoke-static {v9, v13, v12, v13, v11}, Ljava/text/Bidi;->reorderVisually([BI[Ljava/lang/Object;II)V

    if-ne v1, v5, :cond_12

    move v2, v13

    :goto_5
    if-ge v2, v11, :cond_b

    aget-object v5, v12, v2

    iget v5, v5, Lm3/f;->a:I

    if-ne v5, v1, :cond_a

    move v8, v2

    goto :goto_6

    :cond_a
    add-int/lit8 v2, v2, 0x1

    goto :goto_5

    :cond_b
    const/4 v8, -0x1

    :goto_6
    aget-object v1, v12, v8

    if-nez p2, :cond_d

    iget-boolean v1, v1, Lm3/f;->c:Z

    if-ne v7, v1, :cond_c

    goto :goto_7

    :cond_c
    move v9, v7

    goto :goto_8

    :cond_d
    :goto_7
    if-nez v7, :cond_e

    move v9, v10

    goto :goto_8

    :cond_e
    move v9, v13

    :goto_8
    if-nez v8, :cond_f

    if-eqz v9, :cond_f

    invoke-virtual {v3, v4}, Landroid/text/Layout;->getLineLeft(I)F

    move-result v1

    return v1

    :cond_f
    sub-int/2addr v11, v10

    if-ne v8, v11, :cond_10

    if-nez v9, :cond_10

    invoke-virtual {v3, v4}, Landroid/text/Layout;->getLineRight(I)F

    move-result v1

    return v1

    :cond_10
    if-eqz v9, :cond_11

    sub-int/2addr v8, v10

    aget-object v1, v12, v8

    iget v1, v1, Lm3/f;->a:I

    invoke-virtual {v3, v1}, Landroid/text/Layout;->getPrimaryHorizontal(I)F

    move-result v1

    return v1

    :cond_11
    add-int/2addr v8, v10

    aget-object v1, v12, v8

    iget v1, v1, Lm3/f;->a:I

    invoke-virtual {v3, v1}, Landroid/text/Layout;->getPrimaryHorizontal(I)F

    move-result v1

    return v1

    :cond_12
    if-le v1, v6, :cond_13

    invoke-virtual {v0, v1, v5}, Lb30/m;->E(II)I

    move-result v1

    :cond_13
    move v2, v13

    :goto_9
    if-ge v2, v11, :cond_15

    aget-object v5, v12, v2

    iget v5, v5, Lm3/f;->b:I

    if-ne v5, v1, :cond_14

    move v8, v2

    goto :goto_a

    :cond_14
    add-int/lit8 v2, v2, 0x1

    goto :goto_9

    :cond_15
    const/4 v8, -0x1

    :goto_a
    aget-object v1, v12, v8

    if-nez p2, :cond_18

    iget-boolean v1, v1, Lm3/f;->c:Z

    if-ne v7, v1, :cond_16

    goto :goto_b

    :cond_16
    if-nez v7, :cond_17

    move v9, v10

    goto :goto_c

    :cond_17
    move v9, v13

    goto :goto_c

    :cond_18
    :goto_b
    move v9, v7

    :goto_c
    if-nez v8, :cond_19

    if-eqz v9, :cond_19

    invoke-virtual {v3, v4}, Landroid/text/Layout;->getLineLeft(I)F

    move-result v1

    return v1

    :cond_19
    sub-int/2addr v11, v10

    if-ne v8, v11, :cond_1a

    if-nez v9, :cond_1a

    invoke-virtual {v3, v4}, Landroid/text/Layout;->getLineRight(I)F

    move-result v1

    return v1

    :cond_1a
    if-eqz v9, :cond_1b

    sub-int/2addr v8, v10

    aget-object v1, v12, v8

    iget v1, v1, Lm3/f;->b:I

    invoke-virtual {v3, v1}, Landroid/text/Layout;->getPrimaryHorizontal(I)F

    move-result v1

    return v1

    :cond_1b
    add-int/2addr v8, v10

    aget-object v1, v12, v8

    iget v1, v1, Lm3/f;->b:I

    invoke-virtual {v3, v1}, Landroid/text/Layout;->getPrimaryHorizontal(I)F

    move-result v1

    return v1

    :goto_d
    invoke-virtual {v3, v5}, Landroid/text/Layout;->isRtlCharAt(I)Z

    move-result v2

    if-nez p2, :cond_1c

    if-ne v7, v2, :cond_1e

    :cond_1c
    if-nez v7, :cond_1d

    move v7, v10

    goto :goto_e

    :cond_1d
    move v7, v13

    :cond_1e
    :goto_e
    if-ne v1, v5, :cond_1f

    move v9, v7

    goto :goto_f

    :cond_1f
    if-nez v7, :cond_20

    move v9, v10

    goto :goto_f

    :cond_20
    move v9, v13

    :goto_f
    if-eqz v9, :cond_21

    invoke-virtual {v3, v4}, Landroid/text/Layout;->getLineLeft(I)F

    move-result v1

    return v1

    :cond_21
    invoke-virtual {v3, v4}, Landroid/text/Layout;->getLineRight(I)F

    move-result v1

    return v1

    :cond_22
    :goto_10
    invoke-virtual/range {p0 .. p2}, Lb30/m;->x(IZ)F

    move-result v1

    return v1
.end method

.method public z(I)I
    .locals 2

    iget-object v0, p0, Lb30/m;->x:Ljava/lang/Object;

    check-cast v0, Landroid/text/Layout;

    invoke-virtual {v0, p1}, Landroid/text/Layout;->getLineEnd(I)I

    move-result v1

    invoke-virtual {v0, p1}, Landroid/text/Layout;->getLineStart(I)I

    move-result p1

    invoke-virtual {p0, v1, p1}, Lb30/m;->E(II)I

    move-result p1

    return p1
.end method
