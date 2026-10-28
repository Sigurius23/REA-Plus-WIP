.class Lcom/whoop/realtime/presentation/views/a$a;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lcom/whoop/realtime/presentation/views/a$b;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/whoop/realtime/presentation/views/a;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x9
    name = "a"
.end annotation


# instance fields
.field private a:[I


# direct methods
.method private constructor <init>()V
    .locals 0

    .line 2
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public synthetic constructor <init>(I)V
    .locals 0

    .line 1
    invoke-direct {p0}, Lcom/whoop/realtime/presentation/views/a$a;-><init>()V

    return-void
.end method


# virtual methods
.method public final a(I)I
    .locals 2

    iget-object v0, p0, Lcom/whoop/realtime/presentation/views/a$a;->a:[I

    array-length v1, v0

    rem-int/2addr p1, v1

    aget p1, v0, p1

    return p1
.end method

.method public varargs b([I)V
    .locals 0

    iput-object p1, p0, Lcom/whoop/realtime/presentation/views/a$a;->a:[I

    return-void
.end method
