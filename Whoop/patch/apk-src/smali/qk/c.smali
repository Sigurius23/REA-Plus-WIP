.class public final Lqk/c;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field public static final b:Ljava/lang/Object;

.field public static final c:Ljava/util/LinkedHashMap;


# instance fields
.field public final a:Lcd3/g;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    new-instance v0, Ljava/lang/Object;

    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    sput-object v0, Lqk/c;->b:Ljava/lang/Object;

    new-instance v0, Ljava/util/LinkedHashMap;

    invoke-direct {v0}, Ljava/util/LinkedHashMap;-><init>()V

    sput-object v0, Lqk/c;->c:Ljava/util/LinkedHashMap;

    return-void
.end method

.method public constructor <init>(Lqk/b;)V
    .locals 1

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iget-object v0, p1, Lqk/b;->c:Ljc/a;

    invoke-virtual {v0, p1}, Ljc/a;->m(Lqk/b;)Lp0/n0;

    move-result-object p1

    new-instance v0, Lcd3/g;

    invoke-direct {v0, p1}, Lcd3/g;-><init>(Lp0/n0;)V

    iput-object v0, p0, Lqk/c;->a:Lcd3/g;

    return-void
.end method
