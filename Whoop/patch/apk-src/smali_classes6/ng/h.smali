.class public final Lng/h;
.super Lq83/a;
.source "SourceFile"

# interfaces
.implements Lbc3/f2;


# static fields
.field public static final x:Lng/f;


# instance fields
.field public final w:Lng/f;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    new-instance v0, Lng/f;

    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    sput-object v0, Lng/h;->x:Lng/f;

    return-void
.end method

.method public constructor <init>(Lng/f;)V
    .locals 1

    sget-object v0, Lng/h;->x:Lng/f;

    invoke-direct {p0, v0}, Lq83/a;-><init>(Lq83/i;)V

    iput-object p1, p0, Lng/h;->w:Lng/f;

    return-void
.end method


# virtual methods
.method public final J(Lq83/j;)Ljava/lang/Object;
    .locals 1

    const-string v0, "context"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object p1, p0, Lng/h;->w:Lng/f;

    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    sget-object p1, Lng/f;->w:Lng/e;

    return-object p1
.end method

.method public final x(Lq83/j;Ljava/lang/Object;)V
    .locals 1

    check-cast p2, Lng/g;

    const-string v0, "context"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string p1, "oldState"

    invoke-static {p2, p1}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-interface {p2}, Ljava/io/Closeable;->close()V

    return-void
.end method
