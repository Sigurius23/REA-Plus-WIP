.class public final Lxk/h;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lxk/g;


# static fields
.field public static final x:Lhl/a;


# instance fields
.field public final w:Ljava/lang/Object;


# direct methods
.method static constructor <clinit>()V
    .locals 2

    new-instance v0, Lhl/a;

    const/4 v1, 0x1

    invoke-direct {v0, v1}, Lhl/a;-><init>(I)V

    sput-object v0, Lxk/h;->x:Lhl/a;

    return-void
.end method

.method public constructor <init>()V
    .locals 1

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    new-instance v0, Ljava/util/HashMap;

    invoke-direct {v0}, Ljava/util/HashMap;-><init>()V

    iput-object v0, p0, Lxk/h;->w:Ljava/lang/Object;

    return-void
.end method

.method public constructor <init>(Landroid/os/ParcelFileDescriptor;)V
    .locals 1

    .line 3
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 4
    new-instance v0, Lpe3/a;

    invoke-direct {v0, p1}, Lpe3/a;-><init>(Landroid/os/ParcelFileDescriptor;)V

    iput-object v0, p0, Lxk/h;->w:Ljava/lang/Object;

    return-void
.end method


# virtual methods
.method public a()V
    .locals 0

    return-void
.end method

.method public e()Ljava/lang/Object;
    .locals 1

    iget-object v0, p0, Lxk/h;->w:Ljava/lang/Object;

    check-cast v0, Lpe3/a;

    invoke-virtual {v0}, Lpe3/a;->a()Landroid/os/ParcelFileDescriptor;

    move-result-object v0

    return-object v0
.end method
