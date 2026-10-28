.class public final Lvn/b;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field public static final d:Lt9/s;


# instance fields
.field public final a:Lwm/i;

.field public final b:Lrm/c0;

.field public final c:Llo/x;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    new-instance v0, Lt9/s;

    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    sput-object v0, Lvn/b;->d:Lt9/s;

    return-void
.end method

.method public constructor <init>(Lwm/i;Lrm/c0;Llo/x;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lvn/b;->a:Lwm/i;

    iput-object p2, p0, Lvn/b;->b:Lrm/c0;

    iput-object p3, p0, Lvn/b;->c:Llo/x;

    return-void
.end method
