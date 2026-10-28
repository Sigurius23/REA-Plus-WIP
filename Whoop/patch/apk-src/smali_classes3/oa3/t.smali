.class public final Loa3/t;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field public static final i:Loa3/t;


# instance fields
.field public final a:Z

.field public final b:Z

.field public final c:Loa3/t;

.field public final d:Z

.field public final e:Loa3/t;

.field public final f:Loa3/t;

.field public final g:Z

.field public final h:Z


# direct methods
.method static constructor <clinit>()V
    .locals 3

    new-instance v0, Loa3/t;

    const/4 v1, 0x0

    const/16 v2, 0x7ff

    invoke-direct {v0, v1, v2}, Loa3/t;-><init>(Loa3/t;I)V

    new-instance v1, Loa3/t;

    const/16 v2, 0x7dc

    invoke-direct {v1, v0, v2}, Loa3/t;-><init>(Loa3/t;I)V

    sput-object v1, Loa3/t;->i:Loa3/t;

    return-void
.end method

.method public synthetic constructor <init>(Loa3/t;I)V
    .locals 12

    and-int/lit8 v0, p2, 0x1

    const/4 v1, 0x0

    const/4 v2, 0x1

    if-eqz v0, :cond_0

    move v4, v2

    goto :goto_0

    :cond_0
    move v4, v1

    :goto_0
    and-int/lit8 v0, p2, 0x2

    if-eqz v0, :cond_1

    move v5, v2

    goto :goto_1

    :cond_1
    move v5, v1

    :goto_1
    and-int/lit8 v0, p2, 0x20

    if-eqz v0, :cond_2

    const/4 p1, 0x0

    :cond_2
    move-object v6, p1

    and-int/lit16 p1, p2, 0x200

    if-eqz p1, :cond_3

    move v10, v1

    goto :goto_2

    :cond_3
    move v10, v2

    :goto_2
    and-int/lit16 p1, p2, 0x400

    if-eqz p1, :cond_4

    move v11, v1

    goto :goto_3

    :cond_4
    move v11, v2

    :goto_3
    const/4 v7, 0x1

    move-object v8, v6

    move-object v9, v6

    move-object v3, p0

    .line 10
    invoke-direct/range {v3 .. v11}, Loa3/t;-><init>(ZZLoa3/t;ZLoa3/t;Loa3/t;ZZ)V

    return-void
.end method

.method public constructor <init>(ZZLoa3/t;ZLoa3/t;Loa3/t;ZZ)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    iput-boolean p1, p0, Loa3/t;->a:Z

    .line 3
    iput-boolean p2, p0, Loa3/t;->b:Z

    .line 4
    iput-object p3, p0, Loa3/t;->c:Loa3/t;

    .line 5
    iput-boolean p4, p0, Loa3/t;->d:Z

    .line 6
    iput-object p5, p0, Loa3/t;->e:Loa3/t;

    .line 7
    iput-object p6, p0, Loa3/t;->f:Loa3/t;

    .line 8
    iput-boolean p7, p0, Loa3/t;->g:Z

    .line 9
    iput-boolean p8, p0, Loa3/t;->h:Z

    return-void
.end method
